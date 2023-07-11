let colors = [
    '#3498db',
    '#9b59b6',
    '#e74c3c',
    '#2c3e50',
    '#d35400',
]

const boxesContanier = document.querySelector(".boxes");
const score = document.querySelector(".points");
const moreButton = document.querySelector("#btn");

function renderBoxes(arr) {
    for (let i = 0; i < arr.length; i++) {
        const box = document.createElement("div");
        box.classList.add("box");
        box.style.backgroundColor = arr[i];
        boxesContanier.appendChild(box);
    }
}
renderBoxes(colors);

let totalBoxes = colors.length;

function updateScore() {
    score.innerText = totalBoxes;
}
updateScore();

boxesContanier.addEventListener("click", function(event) {
    const clickBox = event.target;
    if(clickBox.classList.contains("box")) {
        clickBox.remove();
        totalBoxes--;
        updateScore();
    }
})

moreButton.addEventListener("click", function() {
    renderBoxes(colors);
    totalBoxes += colors.length;
    updateScore();
})
