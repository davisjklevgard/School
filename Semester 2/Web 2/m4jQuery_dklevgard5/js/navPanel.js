$(function() {

  let hoveredOverLinkWithTabAdded;

  // On hover, change the associated text (<h3> and <p>)
  // and polaroid image to correspond to the hovered over
  // nav link 
  $("#nav a").hover(function() {

    // on mouseenter
    // 1. Hide the currently showing text and image
    $('.tabDesc:visible').hide();

    // 2. Show the text and image that correspond
    //    to the hovered over link
    hoveredOverLinkWithTabAdded = "#" + this.id + "Tab";
    $(hoveredOverLinkWithTabAdded).stop().fadeIn(1000);

  }, function() {

    // on mouseleave 
    // 1. Hide the currently showing text and image
    $(hoveredOverLinkWithTabAdded).hide();

    // 2. Show the text and image for the default tab
    $('#defaultTab').stop(true, true).fadeIn(5000);

  });

});