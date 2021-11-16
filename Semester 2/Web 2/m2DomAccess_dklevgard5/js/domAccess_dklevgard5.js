function init(){

 //console.log("All your base are beling to us!");

 let DOMAccess = {

  exampleProperty: 70,

  doStuff: function() {

    //console.log("Hi, from doStuff")

    // Document Access - creating reference(s) to tag(s)
    //
    // Get a reference to div#primaryContent named primaryContentDiv
    // old way
    // let primaryContentDiv = document.getElementById('primaryContent');
    //
    // Newer way
    // let primaryContentDiv = document.querySelector('#primaryContent');

    // console.log(primaryContentDiv.id);
    // primaryContentDiv.id = "Sasquatch";
    // console.log(primaryContentDiv.id);

    // Select the last <p> tag inside of the div#primaryContent
    // let lastParagraph = primaryContentDiv.querySelector('#quoteToday p');
    //or ('#motd p:last-child')

    // console.log("last paragraph = " + lastParagraph.innerText);
    // console.log("The div#motd tag contains: " + document.querySelector('#motd').innerHTML);

    let quoteTodayDiv = document.querySelector('#quoteToday');

    // Add classes to div#quoteToday to appl styles already in those
    // classes in out .css file.
    quoteTodayDiv.className = "quoteToday";

    quoteTodayDiv.className += ' coolClass';

    console.log('quoteTodayDiv is a ' + quoteTodayDiv.nodeName + ' tag')

    // Dynamically change styles for the div#quoteToday tag

    // Note: inline style looks like this:
    //    <div id="quoteToday" style="color: navy; font-family: Impact;">
    quoteTodayDiv.style.color = 'navy';
    quoteTodayDiv.style.fontFamily = "Impact";
    quoteTodayDiv.style.borderleft = '3px double #76623c'
    quoteTodayDiv.style.borderTopLeftRadius = "8px";

    //Replace soldier image with a new soldier image (frenchBugler.png)
    // This is called iage rollover
    // let soldierPic = document.querySelector('#pic');
    // soldierPic.src = 'images/pics/frenchBugler.png';

    // Refactor the above two statements in one statement
    document.querySelector('#pic').src = 'images/pics/frenchBugler.png';

    // 
    //Style the navigational list of links
    //
    // get a nodelist of references to all the <li> tags inside
    // of <ul id="nav">
    //
    // let ulNav = document.querySelector('#nav');
    // let navList = ulNav.querySelectorAll('li');

    // REfactor the above two statements into one

    // var navList = document.querySelector('#nav').querySelectorAll('li');

    // Refactor again

    var navList = document.querySelectorAll('#nav > li');

    console.log("The number of <li> tags in ul#nav is " + navList.length);

    // Set the opacity of the first <li> in the navlist to 20%
    // navList[0].style.opacity = .2;

    // Step through the navList nodelist one element at a time
    // applying CSS styles to wach element (<li>) in the list.
    for (let i = 0; i < navList.length; i++) {

      navList[i].style.backgroundColor = 'rgba(118, 98, 60, .15)';
      navList[i].style.borderRadius = '6px';
      navList[i].style.paddingTop = '4px';
      navList[i].style.position = 'relative'; 
      navList[i].style.top = '-4px';

    }

    // Change the "- French historian" text to be 
    // "- Micheal Howard" where the "Michael Howard" should be 
    // an email link to mhoward@oxford.uk
    var historian = document.querySelector('#historian');
    console.log(historian.innerText);

    historian.innerText = " - ";

    // Create an email link
    //
    // <a href="mailto:mhoward@oxford.uk">Michael Howard</a>
    //
    //Step 1: Use the createElement() method to create a new tag.
    //
    // createElement('tagName') returns a reference to the newly 
    // created element (tag).
    let emailAddress = document.createElement('a');

    // we now have <a></a>
    // Note: this tag now exists and its reference is in emailAddress, 
    // but it is not yet attached in the DOM. 

    //Step 2: ad any needed attributes to our new tag
    // emailAddress.setAttribute('href', "mailto:mhoward@oxford.uk");
    emailAddress.href ="mailto:mhoward@oxford.uk";

    // we now have <a href="mailto:mhoward@oxford.uk"></a>
   // console.log(emailAddress.href);
   
   // Step3: Create the text content for our tag as an object
   //let emailRecipient = document.createTextNode('Michael Howard');


   // Step 4: Attach the text object as a child of our new <a> tag
   //
   //parentTag.appendChild(childObject);
   //emailAddress.appendChild(emailRecipient);

   // we now have :
   // <a href="mailto:mhoward@oxford.uk">Michael Howard</a>

   // Refactor the last two steps into one short step
    emailAddress.innerText = "Michael Howard";

    // Last step: Attach or new tag to the DOM as a last child 
    // our historian <span> tag
    //historian.appendChild(emailAddress);
    historian.append(emailAddress);

    // Change link color
    emailAddress.style.color = '#a0522d';

    // Create the following structure and prepend (insert)
    // it before header#top.
    //
    // <div id="loginTab">
    //    <p><a id="loginHook" href="#"><Client login</a><p>
    // <div>
    //
    let wrapperDiv = document.querySelector('#wrapper');
    let topHeader = document.querySelector('#top');

    let loginTabDiv = document.createElement('div');
    let paragraph = document.createElement('p');
    let loginLink = document.createElement('a');

    // Use setAttribute() to add an id attribute to loginTabDiv
    loginTabDiv.setAttribute('id', 'loginTab');
    //loginTabDiv.id = 'loginTab';

    loginLink.id = 'loginHook';
    loginLink.href = '#';

    //Put text content in our <a> tag
    //
    //long official way ... in one statement
    //loginLink.append(document.createTextNode("Client login"));

    //Shortcut to do the above using innerText
    loginLink.innerText = 'Client login';

    // Connect our new tags (<div>, <p>, <a>) together
    paragraph.append(loginLink);
    loginTabDiv.append(paragraph);

    // Connect our new structure to the DOM and add it
    // as a first child of the div#wrapper
    //wrapperDiv.prepend(loginTabDiv);
    wrapperDiv.insertBefore(loginTabDiv, topHeader);


  } // end doStuff

 };

 //Run the doStuff method
 DOMAccess.doStuff();

} // end init()

//When the page content is finished loading, call the init() function
window.onload = init; 