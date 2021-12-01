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

    console.log("Image file path = " + $photo.attr('src'));

  });

});