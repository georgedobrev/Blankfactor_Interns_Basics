const FizzBuzz = (n) => {
    const arr = [];
    for (let i = 1; i <= n; i++) {
        if (i % 5 === 0 && i % 3 === 0) {
            arr.push("FizzBuzz")
        } else if (i % 5 === 0) {
            arr.push("Buzz")
        } else if (i % 3 === 0) {
            arr.push("Fizz");
        } else {
            arr.push(i.toString())
        }
    }
    return arr;

}


console.log(FizzBuzz(15));