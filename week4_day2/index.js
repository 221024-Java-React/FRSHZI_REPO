
//1
function calAge (age) {
    if(age==0) return 0;
    else return age*365;
}

console.log(calAge(65));

//2
var finalScore = (score1, score2)=> score1*2 + score2*3;

console.log(finalScore(1,1));

//3
let numbers = [1,2,3,4,5];

var reversedArray=  (nums) => nums.reverse();

console.log(reversedArray([]));

//4
const Votes  =  { upVotes:2 , downVotes:33};

var getVoteCounts = (votes)=>  votes.upVotes- votes.downVotes;

console.log(getVoteCounts(Votes));

//5
function newWord (word) {
 return word.slice(1);
}

console.log(newWord("apple"));

//6
var arrayOfChars = ["a", "b", "c", "d", "e", "f"];
var arrayToString = (args) => args.toString().split(',').join('');

console.log(arrayToString(arrayOfChars));

//7
function findIndex(array ,string)
{
    return array.indexOf(string);
}

var arrayOfString = ["a", "g", "y", "d"];

console.log(findIndex(arrayOfString, 'g'));

//8
var absolute = (n)=> n<0?n*-1:n;

console.log(absolute(10));

//9
function getSavingStrategy(salary)
{
 console.log(salary*0.5+  " on needs");
 console.log(salary*0.3+  " on wants");
 console.log(salary*0.2+  " on savings");
}

getSavingStrategy(100);

//10
var cityFacts = {
    name: "Paris",
    population: "2,140,526",
    continent: "Europe"};

    var getCityFacts = (city)=> {
console.log(`${city.name} has a population of ${city.population} and is situated in ${city.continent}`);
    } 
console.log(getCityFacts(cityFacts));

