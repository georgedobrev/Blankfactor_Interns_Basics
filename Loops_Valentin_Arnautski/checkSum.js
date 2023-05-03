function wordValue(word) {
    
  let value = 0;

    for (let i = 0; i < word.length; i++) {
      value += word.charCodeAt(i) - 96;
    }
    return value;
  }
  
  function checkWordSum(a, b, target) {
    const sum = wordValue(a) + wordValue(b);
    return sum === wordValue(target);
  }
  
  console.log(checkWordSum('abc', 'bgm', 'hmn')); // 28 - 35
  console.log(checkWordSum('abc', 'abc', 'cfc')); // 12 - 12