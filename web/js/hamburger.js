$('.nav-btn').on('click', function() {
    $('.menubar').addClass('open');
    if ($('.menubar').hasClass('open')){
        $('.menubar').removeClass('open');
    } else {
        $('.menubar').addClass('open');
    }
});
if (window.innerWidth > 767) {
    $('.menubar').addClass('open');
}