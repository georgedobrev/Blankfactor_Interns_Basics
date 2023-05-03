const newPrinter = (tasks, paper) =>  {
    let br = 0;
    while (paper.length > 0 && br <= paper.length + 1) {
        if (paper[paper.length - 1] === tasks[0]) {
            paper.pop();
            tasks.shift();
            br = 0;
        } else {
            tasks.push(tasks.shift());
            br++;
        }
    }
    return tasks.length;
}


console.log(newPrinter([1,1,0,0], [0,1,0,1]))
console.log(newPrinter([0,0,0,1], [0,0,0,1]))
console.log(newPrinter([1,1,1,1], [0,0,0,1]))
console.log(newPrinter([1,1,0,0], [0,0,0,1]))
console.log(newPrinter([0,1,1,1], [1,1,1,1]))
console.log(newPrinter([1,1,1,0,0,1],[1,0,0,0,1,1]))