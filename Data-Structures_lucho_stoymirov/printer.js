const print = (tasks, paper) => {
    
    let counter = 0;
    while(counter <= tasks.length && tasks.length) {
        if(tasks[0] === paper[0]){
            counter = 0;
            tasks.shift();
            paper.shift();
        } else {
            counter++;
            const firstItem = tasks[0];
            tasks.shift()
            tasks.push(firstItem);
        }
    }

    if (counter > tasks.length) {
        console.log(tasks.length)
    } else {
        console.log("SUCCESS")
    }
}

let tasks = [1,1,0,1];
let paper = [1,0,0,1];

print(tasks, paper);