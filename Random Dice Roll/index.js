// A simple Roll Dice Project

const hideDice = document.querySelector(".diceImage");
hideDice.classList.add("hidden");
const btnRoll = document.querySelector(".btn");


btnRoll.addEventListener("click", function() {
    // Generating A random dice btnRoll
    const dice = Math.floor(Math.random()*6)+1;
    // console.log(dice);

    // Display the dice according to RandomNumber
    hideDice.classList.remove("hidden");
    hideDice.src = `image/dice${dice}.jpeg`;
})

