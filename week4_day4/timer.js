let interval;
document.getElementById("start").addEventListener("click", start);
document.getElementById("stop").addEventListener("click", stopTimer);
document.getElementById("reset").addEventListener("click", reset);
console.log("inside js file");
function start(e)
{
    e.preventDefault();
    console.log("starting");
    clearElements();
    let millis=0;
    let seconds=0;
    let minutes=0;
    interval = setInterval(()=> {
       
        millis++;
       
        document.getElementById("millis").innerHTML= millis<10?"0"+millis:millis;
        if(millis ==99)
        {
            millis =0;
            document.getElementById("seconds").innerHTML=seconds<10?"0"+seconds:seconds;
            seconds++;
            if(seconds==60)
            {
                seconds =0;
                minutes++;
                document.getElementById("seconds").innerHTML="00";
                document.getElementById("minutes").innerHTML= minutes<10?"0"+minutes:minutes;
            }
        } 
    }, 10);
}


function stopTimer()
{
    clearInterval(interval);
}


function reset()
{
    clearInterval(interval);
    clearElements();
}

function clearElements()
{
    document.getElementById("seconds").innerHTML="00";
    document.getElementById("minutes").innerHTML="00";
    document.getElementById("millis").innerHTML="00";
}