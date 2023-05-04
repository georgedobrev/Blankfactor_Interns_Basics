function checkSum (firstWord,secondWord,targetWord){

const firstWordArr=firstWord.split('')

const firstWordSum=firstWordArr.reduce((a,x)=>{
    if(x!=='a'){
        a+=x.charCodeAt()-97
    }
   return a;
   
},0)
const secondWordArr=secondWord.split('')

const secondWordSum=secondWordArr.reduce((a,x)=>{
    if(x!=='a'){
        a+=x.charCodeAt()-97
    }
   return a;
},0)

const tergetWordArr=targetWord.split('')

const targetWordSum=tergetWordArr.reduce((a,x)=>{
    if(x!=='a'){
        a+=x.charCodeAt()-97
    }
   return a;
},0)



return firstWordSum+secondWordSum===targetWordSum;

}
console.log(checkSum("acb","cba","cdb"))

//newSolutionWithArrowFunc
const checkSum = (firstWord, secondWord, targetWord) => {
  const charCodeSum = (str) => {
    let sum = 0;
    for (let i = 0; i < str.length; i++) {
      if (str[i] !== 'a') {
        sum += str[i].charCodeAt(0) - 97;
      }
    }
    return sum;
  }
  return charCodeSum(firstWord) + charCodeSum(secondWord) === charCodeSum(targetWord);
}
console.log(checkSum("acb", "cba", "cdb"));
