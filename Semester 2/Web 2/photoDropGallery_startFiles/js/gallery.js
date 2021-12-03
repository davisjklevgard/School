$(function() {

  let $galleryImages = $('.polaroid');

  // For each matched element (tag) in the 
  // $galleryImages jQuery object, execue
  // an anonymous function that performs 
  // our animation tasks...
  $galleryImages.each(function(index) {

    // The code here in the body of the each() method's 
    // function will execute for each <img> tag in 
    // the $galleryImages' matched elements node list.
    //
    // Also, note that the this keyword will refer 
    // to the <img> tag currently being iterated (looped)
    // over by the each() method.

    // Wrap our current inage (this) into a jQuery object 
    // as the jQuery object's matched element so we can 
    // run jQuery methods on it.
    let $photo = $(this);

    //console.log("Image file path = " + $photo.attr('src'));

    // Calculate the left and bottom offset values for the
    // current image using a range of 0-549 pixels for the 
    // left offset and a range of 0-29 pixels for the
    // bottom offset.
    let offsetLeft = Math.floor(Math.random() * 550);
    let offsetBottom = Math.floor(Math.random() * 30);

    // Apply the above offset values to the left and 
    // bottom edge CSS attributes for the current <img> tag
    $photo.css({
      left: offsetLeft,
      bottom: offsetBottom
    });

    // Set up random rotation for the image before it 
    // begins to drop and fade in.
    //
    // Note: Modernizr scripts create an object named
    // Modernizr which is created as a property of the
    // window object (browser window). The modernizr
    // object allows us to use feature detection to 
    // determine if certain CSS properties are supported 
    // by the user's browser.
    if (Modernizr.csstransforms) {

      // degrees in a range from -20degrees to 19 degrees
      let degrees = Math.floor(Math.random() * 40) - 20;

      // CSS transform property using one of the CSS rotate 
      // functions => transform: rotate(###deg);
      let rotation = 'rotate(' + degrees + 'deg)';

      //console.log("rotation = " + rotation);

      $photo.css({
        transform: 'scale(4)' + rotation
      });

      // Drop the photos one by one in sequence using a timer 
      // and scaling them down to simulate the photo dropping
      // away from the viewer.
      // setTimeout(functionToExecute, delayInMilliseconds);
      setTimeout(function() {

        $photo.animate({
          transform: 'scale(1)' + rotation,
          opacity: 1
        }, 1000, 'easeInExpo', function() {

            // offsetLeft = offsetLeft + randRange(-8, 8)
            offsetLeft += randRange(-4, 4);
            offsetBottom += randRange(-4, 4);

            rotation = 'rotate(' + randRange(-10, 10) + 'deg)';

            $photo.animate({
              left: offsetLeft + 'px',
              bottom: offsetBottom + 'px',
              transform: 'scale(1.05) ' + rotation
            }, 60).animate({
              left: offsetLeft + randRange(-8, 8) + 'px',
              bottom: offsetBottom + randRange(-8, 8) + 'px',
              transform: 'scale(1) ' + rotation
            }, 100);

        });

      }, index * 2500);
 
    } else { // user's browser does NOT support CSS transform property

      // TODO: do whatever code we could to support older browsers
      // that don't support CSS transforms. 

    }

  });

});


function randRange(min, max){
  return Math.floor(Math.random() * (max - min) + min);
}