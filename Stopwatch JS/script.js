

window.onload = function() {
    var seconds = 00;
    var tens = 00;
    var increaseSeconds = document.querySelector("#seconds");
    var increaseTens = document.querySelector("#tens");
    var startButton = document.querySelector(".start-button");
    var stopButton = document.querySelector(".stop-button");
    var resetButton = document.querySelector(".reset-button");
    var Interval;

    startButton.onclick = function() {
        clearInterval(Interval);
        Interval = setInterval(startTimer, 10);
    }

    stopButton.onclick = function() {
        clearInterval(Interval);
    }

    resetButton.onclick = function() {
        clearInterval(Interval);
        seconds = "00";
        tens = "00";
        increaseTens.innerHTML = tens;
        increaseSeconds.innerHTML = seconds;
    }

    function startTimer() {
        tens++;

    
        if (tens < 9) {
        increaseTens.innerHTML = "0" + tens;
        }

        if (tens > 9) {
        increaseTens.innerHTML = tens;
        }

        if (tens > 99) {
        seconds++;
        increaseSeconds.innerHTML = "" + seconds;
        tens = 0;
        increaseTens.innerHTML = "0" + 0;
        
        }
        if (seconds < 9) {
            increaseSeconds.innerHTML = seconds;
        }
    }
}