$(function() {

  let $logoPic = $('#logo1870');

  // Reposition the image so that it is half on, half off the left edge
  // of the page using the css() method pasing it an object literal
  // so we can set multiple css attribute at the same time on the 
  // selected tag(s).
  $logoPic.css({
    opacity: 0,
    position: "relative",
    left: -300,
    zIndex: 2
  }).animate({
    opacity: 1,
    left: 510
  }, 2500, 'easeOutElastic', function() {
    
    // This function is commonly refered to as a "callback"
    // function AND will not be called until the animate()'s
    // animation is finished
    //
    //console.log("logo1870's animate() complete");

    // Note: the this keyword in a callback function context
    // is the matched element (img#logo1870) of the jQuery
    // object the animate() was on. 
    $(this).fadeTo(2000, .5)
    .rotate({
      duration: 2500, 
      angle: 0,
      center: [0, 0],
      animateTo: 720
    })

  })
  .rotate({
    duration: 2500, 
    angle: 0,
    center: [50, 50],
    animateTo: -360
  });

});