var ImageGallery = {
  init: function() {
    picArray = ["1", "2", "3", "4"];
    // Get reference to large image and store in variable
    // named canvas
    ImageGallery.canvas = document.querySelector('#bigPic');

    // Get reference to div#thumbnails and store in
    // variable named thumbsDiv
    let thumbsDiv = document.querySelector('div#thumbnails');

    // Set up a nodelist, named thumbs, containing
    // references to all <img> tags in div#thumbnails
    let thumbs = thumbsDiv.querySelectorAll('img');

    // Add mouseenter and mouseleave event handlers to 
    // each thumbnail image in thumbs using a for loop. 
    //
    // Set them up to call a method of our object called 
    // newPic on mouseenter and a method called origPic 
    // on mouseleave.

    for (let i = 0; i < thumbs.length; i++){

      thumbs[i].onmouseenter = ImageGallery.newPic;
      
      thumbs[i].onmouseleave = ImageGallery.origPic;

    }
  },

  newPic: function () {

    // Get the value of the moused over object's id 
    // attribute and store it in a variable named 
    // imgNumber
    let imgNumber = this.id;
    

    // Build the path to the image we want to rollover to 
    // and store the path string in a variable named
    // imgPath

    let imgPath = 'images/bigPics/' + picArray[imgNumber] + '.jpg';

    // Rollover (change) the large image to the moused
    // over thumbnail’s large image
    ImageGallery.canvas.src = imgPath;

  },

  origPic: function() {

     // Rollover the large image back to its original image
    ImageGallery.canvas.src = 'images/bigPics/initialPic.jpg'

  }
} 

window.onload = ImageGallery.init; 