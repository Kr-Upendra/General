// var randomNumber1 = Math.floor(Math.random() * 6) + 1; 
// // console.log(randomNumber1);

// var randomDice = "dice" + randomNumber1 + ".jpeg";
// // console.log(randomDice);

// var randomDiceSource = "image/" + randomDice;
// // console.log(randomDiceSource);

// // let image = document.querySelectorAll("img")[1];
// // // console.log(image);
// // image.setAttribute("src", randomDiceSource);
// document.querySelector("button").addEventListener("click", myFunction);

// function myFunction() {
//     document.querySelectorAll("img")[1].setAttribute("src", randomDiceSource);
//     // image.setAttribute("src", randomDiceSource);
// }

// const randomNumber1 = Math.floor(Math.random() * 6) +1;
// const randomDice = "dice" + randomNumber1 + ".jpeg";
// const randomDiceSource = "image/" + randomDice;
// const btn1 = document.querySelector(".btn");
// const diceImage = document.querySelectorAll("img")[1];
 
// btn1.addEventListener("click", function() {
//     diceImage.setAttribute("img", randomDiceSource);
// })
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

