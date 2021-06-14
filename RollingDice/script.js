"use Strict" 

// Declaring the variable
const rollDiceBtn = document.querySelector(".btn-2");
const restartBtn = document.querySelector(".btn-1");
const currentDiceNumber = document.querySelector("#diceNumber")
const diceImage = document.querySelector(".dicePicture");
const totalScore = document.querySelector("#total--score");
const HighScoreBoard = document.querySelector(".highScore");
const highScoreNumber = document.querySelector(".high-score"); 
const overlayView = document.querySelector(".overlay");


// Starting Conditions
currentDiceNumber.textContent = 0;
totalScore.textContent = 0;
highScoreNumber.textContent = 000;
diceImage.classList.add("hidden");
HighScoreBoard.classList.add("hidden");
overlayView.classList.add("hidden");


// To display the Score 
let displayTotalScore = 0;

// Adding Roll dice functionality  
rollDiceBtn.addEventListener("click", function() {
    // Generating A Random Number 
    const randomDice = Math.trunc(Math.random()*6)+1;
    console.log(randomDice);

    // showing The dice picture base on The Random dice number 
    diceImage.classList.remove("hidden");
    diceImage.src = `image/dice${randomDice}.jpeg`;


    // Showing The Randomdice roll result in the current score Section 
    currentDiceNumber.classList.remove("hidden");
    currentDiceNumber.textContent = randomDice;

    // Adding total Score base on the condition which is if dice display 1 then current score will be 0 if not then it continewly added in total score
    if (randomDice !== 1) {
        displayTotalScore += randomDice;
        totalScore.textContent = displayTotalScore;
        
    }
    // if randomDice or randomNumber is 0 then perform this function 
    else if(randomDice === 1) {
        HighScoreBoard.classList.remove("hidden");
        overlayView.classList.remove("hidden");
        totalScore.textContent = 0;
        highScoreNumber.textContent = displayTotalScore;
    }

});

// function for restarting the game 
restartBtn.addEventListener("click", function() {
    displayTotalScore = 0;
    currentDiceNumber.textContent = 0;
    totalScore.textContent = 0;
    overlayView.classList.add("hidden");
    HighScoreBoard.classList.add("hidden");
    diceImage.classList.add("hidden");
    highScoreNumber.textContent = 0;
})


// function for the Adding and hiding the instruction box 

// variables which I need to it all 
const hideBox = document.querySelector(".rules");
const getAnswer = document.querySelector(".question");
const cutBox = document.querySelector(".cencel");

// Starting Condition 
hideBox.classList.add("hidden"); 


getAnswer.addEventListener("click", function() {
    hideBox.classList.remove("hidden");
    overlayView.classList.remove("hidden");
})

cutBox.addEventListener("click", function() {
    hideBox.classList.add("hidden");
    overlayView.classList.add("hidden");
})

