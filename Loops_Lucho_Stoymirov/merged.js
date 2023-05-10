
const mergeStrings = (word1,word2) => {
  word1;
  word2;
  var mixed = '';
  const biggerNum = Math.max(word1.length, word2.length);

  for (var i = 0; i < biggerNum; i++) {
    if (i < word1.length) {
      mixed += word1.charAt(i);
    }
    if (i < word2.length) {
      mixed += word2.charAt(i);
    }
  }

console.log(mixed); 
}

mergeStrings("ABC", "DEF");