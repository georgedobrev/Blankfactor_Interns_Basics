const palindromeCheck = (input) => {
  //parsing input to string
  const parsedInput = input.toString();
  //string to arr, reversing the arr, back to str
  const reversedInput = parsedInput.split("").reverse().join("");

  return parsedInput === reversedInput;
};

console.log(palindromeCheck(121));
