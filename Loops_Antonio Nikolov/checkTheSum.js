const checkSum = (firstWord, secondWord, targetWord) => {
  return (
    charCodeSum(firstWord) + charCodeSum(secondWord) === charCodeSum(targetWord)
  );
};
const charCodeSum = (str) => {
  let sum = 0;
  for (let i = 0; i < str.length; i++) {
    if (str[i] !== "a") {
      sum += str[i].charCodeAt(0) - 97;
    }
  }
  return sum;
};
console.log(checkSum("bbb", "bbb", "bbb"));
