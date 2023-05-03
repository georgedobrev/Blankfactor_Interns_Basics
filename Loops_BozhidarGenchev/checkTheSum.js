function checkSum (firstWord,secondWord,targetWord){

let firstWordArr=firstWord.split('')

let firstWordSum=firstWordArr.reduce((a,x)=>{
    if(x!=='a'){
        a+=x.charCodeAt()-97
    }
   return a;
   
},0)
let secondWordArr=secondWord.split('')

let secondWordSum=secondWordArr.reduce((a,x)=>{
    if(x!=='a'){
        a+=x.charCodeAt()-97
    }
   return a;
},0)

let tergetWordArr=targetWord.split('')

let targetWordSum=tergetWordArr.reduce((a,x)=>{
    if(x!=='a'){
        a+=x.charCodeAt()-97
    }
   return a;
},0)



return firstWordSum+secondWordSum===targetWordSum;

}
console.log(checkSum("acb","cba","cdb"))