$(function() {

  let $divWrapper = $('#wrapper');
  let $loginPanel = $('#loginForm_wrap');
  let $loginButton = $('#loginHook');
  //let loginButtonFlag = true;

  // Alter CSS on div#wrapper, div#loginForm_wrap, and a#loginHook
  $divWrapper.css({
    position: 'relative'
  });

  $loginPanel.css({
    width: '100%',
    position: 'absolute',
    top: 0,
    left: 0,
    zIndex: 10
  });


  $loginButton.css({
    top: 28,
    left: -60,
    transform: 'rotate(90deg)',
    zIndex: 8
  })

  // Close the div#loginForm_wrap box (panel)
  //$loginPanel.css('display', 'none');
  $loginPanel.hide();

  // Set up clickability on our login button
  // and toggle the sliding open/closed of
  // our div#loginForm_wrap element based
  // on its current state (open/closed).
  $loginButton.click(function() {

    // console.log("a#loginHook was clicked");

    // toggle the login form panel open/closed
    $loginPanel.slideToggle(400, 'easeOutBounce');

    // Move login buttin if necessary
    // if (loginButtonFlag){
    //   $(this).css({
    //     top: 100
    //   });
    //   loginButtonFlag = false;
    // } else {
    //   loginButtonFlag = true;
    // }

  });

});