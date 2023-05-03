function fizzBuzz(num) {
    let finalArr = []
    for (let i = 1; i <= num; i++) {
        if (i % 3 === 0 && i % 5 !== 0) {
            finalArr.push('Fizz')
        } else if (i % 5 === 0 && i % 3 !== 0) {
            finalArr.push('Buzz')
        } else if (i % 5 === 0 && i % 3 === 0) {
            finalArr.push('FizzBuzz')
        } else {
            finalArr.push(i.toString())
        }
    }
    console.log(finalArr)

}
fizzBuzz(15)