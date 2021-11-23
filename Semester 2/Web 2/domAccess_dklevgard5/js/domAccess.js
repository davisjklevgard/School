var MyDOMAccess = {

	init: function() {
	
		// Try these out by uncommenting them, then comment them again
		//alert(document.querySelector("#wrapper").querySelectorAll('div')[0].nodeName);
		//alert(document.querySelector("#wrapper").querySelectorAll('div')[0].id);
		
		// ****************************************************************
		//
		// Document Access Project Assignment
		//
		// ****************************************************************
		
		
		// ****************************************************************
		//
		// Add 1, 2, 3, and 4 tab button images to left of soldier pic.
		//
		// ****************************************************************
		
		// Create a <div> tag storing the reference to it in a variable 
		// named imageTabsDiv and then use the setAttribute() method to set 
		// its 'id' attribute to a value of "imageTabs".
		let imageTabsDiv = document.createElement('div');
		imageTabsDiv.setAttribute('id', "imageTabs");
		
		
		// Create four images that display the following images from the 
		// images/pics folder: imageTab01.png, imageTab02.png, imageTab03.png,
		// and imageTab04.png.  Store the references to the new image elements
		// in variables named tab01, tab02, tab03, and tab04.
		//
		// Use the shorthand way of accessing the attribute
		// as an object property to set the 'src' attribute for each image.
		//
		// Following each image tag except the last one, create a <br> tag.
		// Note that when creating the <br> tags, you will need to 
		// consider creating more than one reference as each one is unique...
		
		let tab01 = document.createElement('img');
		let break1 = document.createElement('br');
		let tab02 = document.createElement('img');
		let break2 = document.createElement('br');
		let tab03 = document.createElement('img');
		let break3 = document.createElement('br');
		let tab04 = document.createElement('img');

		tab01.src = 'images/pics/imageTab01.png';
		tab02.src = 'images/pics/imageTab02.png';
    tab03.src = 'images/pics/imageTab03.png';
		tab04.src = 'images/pics/imageTab04.png';

		
		
		// Append these tab images and <br>'s to div#imageTabs
		
		
		imageTabsDiv.append(tab01);
		imageTabsDiv.append(break1);
		imageTabsDiv.append(tab02);
		imageTabsDiv.append(break2);
		imageTabsDiv.append(tab03);
		imageTabsDiv.append(break3);
		imageTabsDiv.append(tab04);
		
		
		// Get a reference to div#primaryPic and name it primaryPic
		let primaryPic = document.querySelector('#primaryPic');
		
		// Add div#imageTabs as a child of div#primaryPic
		primaryPic.append(imageTabsDiv);
		
		// Position div#imageTabs as shown in the video using "absolute 
		// positioning" by dynamically altering this element's styles.
		
		imageTabsDiv.style.position = 'absolute';
		imageTabsDiv.style.left = '-26px';
		imageTabsDiv.style.top = '15px';
		
		
		// ****************************************************************
		//
		// Replace the polaroid image with the 
		// images/navPhotos/theArt_polaroidSmall.png image
		//
		// ****************************************************************
		
		// In one statement, get a reference to the img tag (store in variable 
		// named polaroid) inside div#defaultTab using the querySelectorAll() 
		// method.
		let polaroid = document.querySelectorAll('#defaultTab img');
		
		
		// Display the polaroid's tagname in an alert dialog window - hint: use
		// the nodeName property of the element object to get this.
		alert(polaroid[0].nodeName);
		
		// Replace the current image with the 'theArt_polaroidSmall.png' image
		// using the src property shortcut on your <img> tag reference variable.
		polaroid[0].src = 'images/navPhotos/theArt_polaroidSmall.png';
		
		
		
		// ****************************************************************
		//
		// Change the styles applied to the <p> tags within div#motd as shown
		// in the specs video.
		//
		// The styles you should be changing dynamically through your
		// JavaScript code for each selected <p> tag will be: 
		// 
		//		background   (set background image to images/pBackground.png)
		//		color
		//		border-radius
		//		padding
		//		text-shadow
		//
		// Look carefully at the specs video and/or provided screenshot
		// and try to match your style values to create what you see.  Don't
		// worry too much about being 1px off here and there as long as your
		// output is very close to what you see in my output examples.
		//
		// ****************************************************************
		
		// Get a reference to div#motd and store in a variable named motdDiv.
		let motdDiv = document.querySelector('#motd');
		
		// Get a nodelist of references to the <p> tags within div#motd 
		// and store in a variable named pList.
		let pList = document.querySelectorAll(motdDiv > p);

		// Step through the pList nodelist and change the forementioned styles
		// on each <p> element inside div#motd - use a for loop to do this.
		for (let i = 0; i < pList.length; i++) {
			pList[i].style.background = 'url(images/pBackground.png)';
			pList[i].style.color = 'white';
      pList[i].style.borderRadius = '1px';
      pList[i].style.position = 'relative'; 
      pList[i].style.textShadow = '2px, 2px, #FFF';
		}
		
		
		
		
		
		// ****************************************************************
		//
		// Change the copyright symbol "2020 Jon Cooley" text into copyright symbol 
		// "2020 Yournamehere" where "Yournamehere" should be an email link to 
		// your email address (replace "Yournamehere" with your name :-)
		//
		// ****************************************************************
		
		// Store reference to span#copyRight in variable named copyRight.
		let copyRight = document.querySelector('#copyRight');

		// Create a new email anchor element with appropriate href attribute placing
		// your name as its text content - store reference to new tag in variable 
		// named emailAddress.
		let emailAddress = document.createElement('a');
		emailAddress.href = "mailto:dklevgard5@student.cvtc.edu";		

		// Create your Name text content that will be used inside the link 
		// using the document's createTextNode() method to create a text node 
		// storing the reference it returns in a variable named emailText.
		//var emailText = document.createTextNode('Davis Klevgard');
		
		// Next, place link text content (text node you created) in the <a> tag.
		//parentTag.appendChild(childObject);
    //emailAddress.appendChild(emailRecipient);
		
		// Now, comment out the above two steps of creating the text node 
		// and placing the new content inside the <a> tag and redo 
		// those steps in ONE statement (hint: use innerHTML).
		emailAddress.innerText = "Davis Klevgard"

		// Then, replace the <span> tag's content with just the 
		// "'copyright symbol here' 2020 ".
		copyRight.innerText = copy; "2020 ";

		// Append email address at end of <span>'s content.
		copyRight.append(emailAddress);
		
	
	}	// end init() method

};

window.onload = MyDOMAccess.init ;