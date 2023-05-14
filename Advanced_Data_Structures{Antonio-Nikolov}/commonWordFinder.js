const commonString = (string) => {
  //regex pattern to exclude everything except lowercase letters from a-z
  const words = string.toLowerCase().match(/[a-z]+/g);

  const wordsObj = {};

  for (let word of words) {
    //if wordObj contains curr word => increment, else setting value to 1
    if (wordsObj[word]) {
      wordsObj[word]++;
    } else {
      wordsObj[word] = 1;
    }
  }

  let counter = 0;
  let commonWord = "";

  for (let word in wordsObj) {
    if (wordsObj[word] > counter) {
      counter = wordsObj[word];
      commonWord = word;
    }
  }
  return `"${commonWord}" appears ${counter} times`;
};

console.log(
  commonString(
    "The quick brown fox jumped over the lazy dog. The lazy dog slept all day."
  )
);