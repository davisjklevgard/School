package edu.cvtc.controller;

import com.google.common.base.Strings;
import edu.cvtc.dao.UserIO;
import edu.cvtc.model.User;
import edu.cvtc.utility.CookieUtility;


import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "RegisterFilter", urlPatterns = "/*", initParams = @WebInitParam(name="pathsToIgnore", value="/assets/,/register.jsp/,/RegisterUser/"))
public class RegisterFilter implements Filter {

    FilterConfig fConfig = null;

    public void init(FilterConfig config) throws ServletException {
        this.fConfig = config;
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        if (isPathIgnore(request,fConfig) || isRegistered(request, response)) {
            // the user is allowed to proceed
            chain.doFilter(request, response);
        } else {
            // the user is not allowed access, and must be redirected
            ((HttpServletRequest)request).getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
        }

    }

    private boolean isPathIgnore(ServletRequest request, FilterConfig fConfig) {
        Boolean isIgnored = false;

        String requestURI = ((HttpServletRequest)request).getRequestURI();
        String pathsToIgnore = fConfig.getInitParameter("pathsToIgnore");

        for (String path: pathsToIgnore.split(",")) {
            if(requestURI.contains(path)) {
                isIgnored = true;
            }
        }
        return isIgnored;
    }

    private boolean isRegistered(ServletRequest request, ServletResponse response) {


        //TODO Check to see if the user is in session
        final HttpSession session = ((HttpServletRequest)request).getSession();
        User user = (User) session.getAttribute("user");

        if (user == null){
            // User is not in session

            //TODO Check to see if the user has a cookie on their machine
            Cookie[] cookies = ((HttpServletRequest)request).getCookies();
            final String emailAddress = CookieUtility.getCookieValue(cookies, "emailCookie");

            if(Strings.isNullOrEmpty(emailAddress)){
                // user was snot in session, and has no cookie
                return false;
            } else {
                // user was not in session, but has a cookie, meaning they registered previously (probably)
                // TODO Check to see if the user is in our registration file
                String filepath = ((HttpServletRequest)request).getServletContext().getRealPath("WEB-INF/emailList.txt");
                user = UserIO.getUser(emailAddress, filepath);

                if (user == null) {
                    return false;
                }

                session.setAttribute("user", user);
            }
        }

        return true;
    }
}
