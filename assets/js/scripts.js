var body = document.querySelector('body')
var menuTrigger = document.querySelector('#toggle-main-menu-mobile');
var menuContainer = document.querySelector('#main-menu-mobile');

if (menuTrigger) {
    menuTrigger.onclick = function() {
        if (menuContainer) {
            menuContainer.classList.toggle('open');
            if (menuTrigger) {
                menuTrigger.classList.toggle('is-active')
                body.classList.toggle('lock-scroll')
            }
        }
    }
}
