function checkSum (firstWord, secondWord, targetWord) {
    let sumOfFirstWord = 0;
    let sumOfSecondWord = 0;
    let sumOfThirdWord = 0;

    for (let i = 0; i < firstWord.length; i++) {
        sumOfFirstWord += firstWord.charCodeAt(i)-97;
    }
    for (let i = 0; i < secondWord.length; i++) {
        sumOfSecondWord += secondWord.charCodeAt(i)-97;
    }
    for(let i = 0; i < targetWord.length; i++) {
        sumOfThirdWord += targetWord.charCodeAt(i)-97;
    }

    

    return sumOfFirstWord + sumOfSecondWord === sumOfThirdWord;
 }


console.log(checkSum("abc", "cba", "cdb"));