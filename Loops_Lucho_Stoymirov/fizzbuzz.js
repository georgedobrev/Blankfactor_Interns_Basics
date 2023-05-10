

let fizzBuzz = number =>{
    var x = number;
    var result = [];
    for (var i = 1; i <= x; i++) {
        if (i % 3 ==0 && i % 5 != 0) {
            result.push("Fizz");
        } else if (i % 5 ==0 && i % 3 != 0) {
            result.push("Buzz");
        } else if (i % 3 == 0 && i % 5 == 0) {
            result.push("FizzBuzz");
        } else {
            result.push(i);
        }
    }
    console.log(result);
}

fizzBuzz(15);