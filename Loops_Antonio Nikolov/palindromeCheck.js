const palindromeCheck = (input) => {

    //parsing input to string
const parsedInput = input.toString();
    //string to arr, reversing the arr, back to str
let reversedInput = parsedInput.split('').reverse().join('');
    
if(parsedInput === reversedInput){
    return true
}else{
    return false
}
}

console.log(palindromeCheck(121))