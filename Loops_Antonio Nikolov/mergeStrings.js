const mergeStrings = (str1, str2) => {
  let mergedStr = "";

  let sumLength = str1.length + str2.length;

  for (let i = 0; i < sumLength; i++) {
    if (i < str1.length) {
      mergedStr += str1[i];
    }
    if (i < str2.length) {
      mergedStr += str2[i];
    }
  }
  return mergedStr;
};
console.log(mergeStrings("abc", "pqr"));
