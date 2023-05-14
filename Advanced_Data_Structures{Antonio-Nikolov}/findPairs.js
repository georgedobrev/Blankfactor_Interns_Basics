const findPairs = (arr, target) => {
    const obj = {};
    const pairs = [];
  
    for (let i = 0; i < arr.length; i++) {
      const num = arr[i];
      const remainder = target - num;
      if (remainder in obj) {
        pairs.push([remainder, num]);
      } else {
        obj[num] = "iterated";
      }
    }
    return pairs.map((pair) => `(${pair[0]}, ${pair[1]})`).join(", ");
  };
  
  console.log(findPairs([1, 2, 3, 4, 5], 7));