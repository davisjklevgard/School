$(function() {
  let $whoAmI = $('#whoAmI');
  let $text = $('#whoAmIText');
  let $mysteryPanel = $('div#mysteryPanel');
  let $mpH3 = $('div#mysteryPanel h3');

  // mouse enter
  $whoAmI.hover(function() {
    $whoAmI.stop().fadeTo('normal', 1);
    $text.stop().fadeTo('normal', 1);
  }, function () {

    //mouse leave
    $whoAmI.stop().fadeTo('normal', .4);
    $text.stop().fadeTo('normal', .4);
  });

  $whoAmI.click(function() {

    // opens panel
    $mysteryPanel.toggle(300)

  })

  // changes font size to fit all text
  $mysteryPanel.css({
    fontSize: 13
  })

  $mpH3.click(function() {
    $('#silhouette').fadeOut(5000);
    $('img#revealed').delay(3000).fadeIn(1000, function() {
      $mpH3.text('Marechal Patrice MacMahon').css({
        cursor: 'default'
      })
    });
  })
});