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
  }, 2500);

});