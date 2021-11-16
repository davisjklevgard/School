class NorthShoreGallery {

  // declare and initialize properties
  static imageCounter = 0;  // class-level property

  // Set up two indexed arrays such that an index that is used 
  // in both arrays will retrieve related values from both arrays
  static pics = new Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

  static captions = ["Split Rock Lighthouse", "Superior Trail", "Beach Rock", "Breakers", "American Beach", "Surf Spray", " Superior Red Rock", "Superior REd Rock", "Superior Sunset", "Gooseberry Falls", "Cascades at Squatch Rock", "The Temperance", "Fall Colors"]; 

  // Get references to our second image and our paragraphs that will contain
  // current caption
  static timedImage = document.querySelector('#northShoreAutoPic');

  static picCaptions = document.querySelectorAll('.picCaption');


  //
  // Set up our class's constructor method with a parameter variable
  // named northShoreImage.
  //
  constructor(northShoreImage) {

    this.northShoreImage = northShoreImage;
    console.log("this.northShoreImage's id = " + this.northShoreImage.id);

  }


  // Declare/define methods...

  init() {

    //console.log("Hello from init()");

    // Set up event handlers for mouseenter and mouseleave
    //
    // older event handler syntax
    // element.onevent = eventHandlerFunctionName;
    this.northShoreImage.onmouseenter = this.showRandomImage;
    this.northShoreImage.onmouseleave = NorthShoreGallery.resetImage;

    // Start our circular carousel slideshow
    NorthShoreGallery.slideShow();

  }


  // 
  //Event handler instance method to handle the mouseenter event on 
  // our first image
  //
  showRandomImage(e) {

    //console.log("hello from showRandomImage");
    //
    // JavaScript automatically passes the event that occured 
    // as an object (event object) to ALL event handler functions.
    //
    // Above, e is a paramter variable we set up to recieve 
    // and store the passed-in event object. The name e is a 
    // convention that is commonly (optionally) used for this.
    // 
    //console.log("The id of our moused-over image is: " + this.id + "\nthe images's file path is: " + e.currentTarget.src + "\n\nMouse position where the mouseenter event occured on our image is (" + e.offsetX + ", " + e.offsetY + ")");
    //
    //Notice that this was the same as the e.currentTarget above...
    //
    // Why?
    //
    // Inside the context of an event handler function (context
    // refers to the closest function we are inside of),  the 
    // this keyword is a reference to the currently active object.
    //
    // What is the currently active object inisde an event handler
    // function? Remember that the currently actie object depends
    // on the context (the function we are currently in).
    //
    // In the context of an event handler/listener function, the 
    // this keyword is a reference to the object (element/tag) 
    // that the event occurred on. 
    //

    // Get a random number that we can use as an index into our 
    // two array properties
    let randomIndex = NorthShoreGallery.randRange(1, NorthShoreGallery.pics.length); 

    //console.log("randomly-genereated index = " + randomIndex + "\nrandom image number related to our random index is " + NorthShoreGallery.pics[randomIndex]);

    // Change the image replacing it with a randomly generated 
    // image based on our random index number 
    this.src = 'images/northShore/pic' + NorthShoreGallery.pics[randomIndex] + '.jpg';

    // Change the caption to correspond to the new image
    NorthShoreGallery.picCaptions[0].innerText = NorthShoreGallery.captions[randomIndex];


    // Add filter effects to our hovered over image
    this.className = "contrast";
    //this.className += ' invert';
    this.className += ' sepiaBlur';

  }


  // 
  //Event handler static (class-level) method to handle the mouseleave
  // event on our first image
  //
  static resetImage(){

    //console.log("hello from resetImage");
    this.src = 'images/northShore/pic' + NorthShoreGallery.pics[0] + '.jpg';

    NorthShoreGallery.picCaptions[0].innerText = NorthShoreGallery.captions[0];

    // Turn off filter effects
    this.className = " ";

  }


  //
  // Slideshow (circular carousel)
  //
  // Cycle through our images sequntially on a timed basis. 
  // 
  static slideShow() {

    console.log("Hello from slideShow")

  }


  //
  // Random integer generator (helper method)
  //
  static randRange(min, max){
    return Math.floor(Math.random() * (max - min) + min);
  }


} // end of class NorthShoreGallery




function imageGallery() {

  // Get a reference to the first image on the page
  let firstImage = document.querySelector('#northShorePic');

  let gallery = new NorthShoreGallery(firstImage);

  // Call the init() method of our gallery instance (instance of 
  // the NorthShoreGallery class)
  gallery.init();

}


// Once the web page's content has finished loading,
// call the imageGallery() function.
window.onload = imageGallery;