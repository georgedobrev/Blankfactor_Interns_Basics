function task2 (){
let phoneNums=['359 83 34 54 34','359 13 72 82 54','359 53 24 39 30','359 82 14 14 81','359 83 14 84 81','359 83 75 85 14']
phoneNums.splice(3,0,'359 83 74 84 84')
console.log(phoneNums)
phoneNums.splice(2,1)
console.log(phoneNums)
}
task2()