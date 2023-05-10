
const checkPalindrome = number => {
    const numText = String(number);
    const size = numText.length;
    for (var i = 0; i < size / 2; i++){
        if(numText[i] !== numText[size - 1 - i]){
            return false;
        }
    }
    return true;
}

console.log(checkPalindrome(12321));