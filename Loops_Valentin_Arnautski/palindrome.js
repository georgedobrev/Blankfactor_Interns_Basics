function palindrome(num) {
    let isPalindrome = false;
    const reversedNumber = num.toString().split('').reverse().join('');
  
    return num.toString() === reversedNumber
  }
  
  palindrome(123321);