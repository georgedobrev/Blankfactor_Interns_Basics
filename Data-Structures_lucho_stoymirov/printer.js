function print(tasks, paper) {
    let x = tasks;
    let y = paper;
    let counter = 0;
    while(counter <= x.length && x.length) {
        if(x[0] === y[0]){
            counter = 0;
            x.shift();
            y.shift();
        } else {
            counter++;
            let firstItem = x[0];
            x.shift()
            x.push(firstItem);
        }
    }

    if (counter > x.length) {
        console.log(x.length)
    } else {
        console.log("SUCCESS")
    }
}

let tasks = [1,1,0,1];
let paper = [1,0,0,1];

print(tasks, paper);