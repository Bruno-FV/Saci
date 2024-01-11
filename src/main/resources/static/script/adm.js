function toggleMenu() {
    const menu = document.getElementById('menu');
    const content = document.getElementById('content');

    if (menu.style.left === "0px" || menu.style.left === "") {
        menu.style.left = "-250px";
        content.style.marginLeft = "0";
    } else {
        menu.style.left = "0";
        content.style.marginLeft = "250px";
    }
}

function openTab(tabName) {
    const tabs = ['visualizar', 'adicionar', 'remover','sair'];

    tabs.forEach(tab => {
        const tabContent = document.getElementById(tab);
        tabContent.style.display = tab === tabName ? 'block' : 'none';
    });
}