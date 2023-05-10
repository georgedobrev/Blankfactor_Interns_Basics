
const checkTargetWord = (firstWord, secondWord, targetWord) => {
    var sum1 = null;
    var sum2 = null;
    var sum3 = null;
    var isTargetHit = false;
    for (var i = 0; i < firstWord.length; i++) {
        sum1 += firstWord.charCodeAt(i) - 97;
    }
    for (var i = 0; i < secondWord.length; i++) {
        sum2 += secondWord.charCodeAt(i) - 97;
    }
    for (var i = 0; i < targetWord.length; i++) {
        sum3 += targetWord.charCodeAt(i) - 97;
    }
    if (sum1 + sum2 === sum3) {
        isTargetHit = true;
    }
console.log(isTargetHit)
}


checkTargetWord("abc", "bac", "cdb");