const palindrome = (x) => {
    let firstElement = String(x).charAt(0);
    let lastIndex = String(x).length;
    let lastElement  = String(x).charAt(lastIndex-1);
    
    
    
    if (firstElement == lastElement) {
        return true;
    } else {
        return "not palindrome";
    }
}


console.log(palindrome('1231231'));