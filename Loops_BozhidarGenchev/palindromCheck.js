function palindromeCheck (x) {
    
if(x.toString()===x.toString().split('').reverse().join('')){
    return 'yes'
}
    return 'no'


}
console.log(palindromeCheck(222))