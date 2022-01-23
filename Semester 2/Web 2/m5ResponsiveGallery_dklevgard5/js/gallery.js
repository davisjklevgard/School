function gallery() {

  let painting = document.querySelector('#photo1'),
      paintingWidth = painting.width,
      paintingHeight = painting.height, 
      currentCaption, 
      allH2s = document.querySelectorAll('h2'),
      firstH2 = allH2s[0];

  // need this variable to be global in scope
  captions = document.querySelectorAll('p.picTitle');

  //
  // h2 text effect animation to animate each character of the <h2>
  //
  let $h2 = $(firstH2); // wrap firstH2 into a jQuery object

  // Break up the <h2>'s string content into individual
  // character storing them int oan array for later access. 
  //
  // The JavaScript split() method of the String class breaks up
  // the string object it is run on into individual characters
  // storing them from the left-to-right into an array it builds 
  // and returns. 
  let phraseArray = $h2.text().split("");

  console.log('phraseArray = ' + phraseArray);

  let charTimeLine = gsap.timeline({
    repeat: 2, 
    repeatDelay: .4,
    yoyo: true 
  });

  // Empty our <h2>'s content
  $h2.text('');

  // Use jQuery's low-level (utility) each() method
  // to loop through each element of our phraseArray
  // doing something with each element's index and 
  // value (character).
  $.each(phraseArray, function(index, value) {

    if (value == ' '){
      value = '&nbsp;';
    }

    // Creat a new <span> tag that will contain 
    // this individual character and attach 
    // the new tag to the DOM. 
    let $letter = $('<span/>', {id: "txt" + index})
                    .html(value)
                    .appendTo($h2);
    


    // Tween the timeline
    charTimeLine.to($letter, {
      rotationX: 360, 
      rotationY: 360, 
      textShadow: '0 0 1px #ddd',
      color: "none",
      autoAlpha: 1,
      ease: Back.easeOut,
      duration: 1,
      transformOrigin: '50% 50% -20'
    }, index * .05)

  });


  //
  // Create animation effects on the thumbnail images as 
  // they appear
  //
  $thumbs = $('.thumbnails > img');

  // Whizbang effect for bringing our thumbnail images into view
  let staggerTimeline = gsap.timeline();

  staggerTimeline.from($thumbs, {
    opacity: 0,
    top: '-12.5rem', 
    left: '-=3.125rem',
    rotation: '-45deg',
    ease: Bounce.easeOut,
    stagger: .5
  }, .2).to($thumbs, {
    opacity: .5,
    duration: .8,
    onComplete: completeThumbsSetup
  });


  //
  // Callback function
  //
  // This function is a closure because it is defined 
  // inside of another function definition (gallery).
  //
  function completeThumbsSetup() {

    // For each thumbnail image, set up hover and click events
    $thumbs.hover(function() {
      // mouseenter
      gsap.to(this, {scale: 1.05, opacity: 1, duration: .1});
    }, function () {
      //mouseleave
      gsap.to(this, {scale: 1, opacity: .5, duration: .1});
    });


    $thumbs.click(showPainting);

  }


  function showPainting() {

    //console.log('showPainting was called');
    painting.srcset = "";
    painting.sizes = "";

    // Accomplish responsive image choice through JavaScript
    //
    // Choose and display large ainting image that corresponds 
    // to the clicked thumbnail image using its id value.
    // 
    let imgPath = 'images/' + this.id;

    if (window.innerWidth <= 460) {
      imgPath += '_300px.jpg';
    } else if (window.innerWidth <= 768) {
      imgPath += '_500px.jpg';
    } else if (window.innerWidth <= 1000) {
      imgPath += '_800px.jpg';
    } else {
      imgPath += '_1000px.jpg';
    }

    console.log(imgPath);
    // Image rollover for large painting image
    painting.src = imgPath;

    // Change the caption and artist to match our new painting
    //
    // Hide the currently showing caption
    $('.picTitle:visible').hide();

    // Fade in the caption that corresponds to the newly loaded 
    //painting image
    $('#picCaption' + this.id).stop().fadeIn(2000);

    // Animate the apperance of hte new large painting image
    gsap.fromTo(painting, {
      // beginning property values
      alpha: 0,
      transformPerspective: 100,
      rotationX: 120,
      z: -300,
      transformOrigin: "50% 0%"
    }, {
      // ending property values
      alpha: 1,
      transformPerspective: 1000,
      rotationX: 0,
      z: 0,
      transformOrigin: "50% 0%",
      duration: 1.2,
      ease: Bounce.easeOut
    });

  }
 
}


window.onload = gallery;