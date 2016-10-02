var menu = document.querySelector('.dropDownMenu');
var main = document.querySelector('.hamburgerMenu');
var drawer = document.querySelector('#drawer');

menu.addEventListener('click', function (e) {
    drawer.classList.toggle('open');
    e.stopPropagation();
    e.preventDefault();
});

main.addEventListener('click', function() {
    drawer.classList.remove('open');
});