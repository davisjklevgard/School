package edu.cvtc.dao;

import edu.cvtc.model.User;

import java.io.*;

public class UserIO {

    public static boolean add(final User user, final String filePath) {
        final File userFile = new File(filePath);
        final PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(userFile, true));

            out.println(user.getEmail() + "|" + user.getFirstName() + "|" + user.getLastName());

            out.close();

            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public static User getUser(String email, String filePath) {
        User user = null;

        try {
            final BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line = reader.readLine();

            while(line != null) {
                user = new User();

                String[] lineArray = line.split("|");

                if(lineArray[0].equalsIgnoreCase(email)) {
                    user.setEmail(lineArray[0]);
                    user.setFirstName(lineArray[1]);
                    user.setLastName(lineArray[2]);

                    reader.close();
                    return user;
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user;
    }
}
