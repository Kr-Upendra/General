// This project is about the changing the backgroundColor by generating a random hex code color

const hexValue = document.querySelector(".hex-value");
const btn = document.querySelector(".btn");
const body = document.querySelector("body");
const hexNumber = ["A", "B", "C", "D", "F", "E", 0, 1, 2, 3, 4, 6, 5, 7, 8, 9];

hexValue.textContent = "#ffffff";

btn.addEventListener("click", hexColor);

function hexColor() {
  let hex = "#";

  for (let i = 0; i < 6; i++) {
    const randomHex = Math.floor(Math.random() * hexNumber.length);
    hex += hexNumber[randomHex];
  }

  btn.style.backgroundColor = hex;
  hexValue.textContent = hex;
  body.style.backgroundColor = hex;
}
