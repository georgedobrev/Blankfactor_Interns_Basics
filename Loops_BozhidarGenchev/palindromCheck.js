function palindromeCheck (palindrome) {
    
if(palindrome.toString()===palindrome.toString().split('').reverse().join('')){
    return 'yes'
}
    return 'no'


}
console.log(palindromeCheck(222))
