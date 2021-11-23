/*
jQuery is a class (objects)

We will always work with jQuery objects

A jQuery object will contain properties and methods AND will often also contain a matched list of elements (tags). The matched elements (tags) are what jQuery will work on (affect). This matched list of elements is ALWAYS a nodelist of tag references that were "selected"

To get a jQuery object, we will call the jQuery function.  The jQuery function will ALWAYS return a jQuery object as its return value. -much like a constructor function

Note: $ is an alias for jQuery.

jQuery Function:

jQuery(selector); // selector parameter is used to select elements (tags)
more commonly coded as: $(selector);

This function will return a jQuery object that contains a matched element nodelist of all tags that were selected by the selector parameter.

A selector can be: 
1) object (in a variable name - eg window, document, myImgTagReference). Note: cannot be inside quotes...

eg $(document); // return a jQuery object with the document object selected

2) a CSS-like selection string. Must be inside quotes.
 eg $('img');   // returns a jQuery object containing a nodelist 
 // with all <img> tags on entire web page

      $('#stuff > img');  // returns jQuery object containing a node list of all <img> tags 
      // that are direct children of a tag whose id value is "stuff".



A jQuery statement includes calling the jQuery function and many times has four parts:

1) the jQuery function call.   $();
2) the selector parameter passed inside the ()'s of the function call.   
    $(selector);
3) the jQuery method that we will run on the returned jQuery object.  
    $(selector).method();
4) any parameter(s) that need to be passed to the jQuery method we are calling.  
   $(selector).method(parameter1, parameter2);


Obtain a jQuery object and store it in a variable for later (re)use.
$variableName = $(selector);

Then, run a jQuery method on the variable containing the jQuery object: 
$variableName.method(parameter1, parameter2, ..., parameterN);

*/


// We don't want this code to be executed by the JavaScript Interpreter 
// until the web page content has finished loading...
//$(document).ready(function() {});

//
// Let's use a shortcut instead for the above code...
//
// Note that the default selector in jQuery function calls is the document 
// object and if document is selected, the deault jQuery method that is 
// called on that jQuery object which has document sleected is the 
// ready() method.
$(function() {

  // Create and store a jQuery object whose matched element is img#pic
  let $soldierPic = $('#pic');

  // Fade the image to 15% over 3 seconds initially
  $soldierPic.fadeTo(3000, .15, 'easeOutBounce');

  // On hover, fade the image to full opacity slowly
  //
  // On hover off, fade the image back to 15% using the "normal" keyword
  //
  $soldierPic.hover(function() {

    // on hover (mouseenter)
    $soldierPic.stop().fadeTo('slow', 1);
    //$(this).fadeTo('slow', 1);


  }, function() {

    //on hover off (mouseleave)
    $soldierPic.stop().fadeTo('normal', .15); // slightly more efficient
    //$(this).fadeTo('slow', .15);


  });

});