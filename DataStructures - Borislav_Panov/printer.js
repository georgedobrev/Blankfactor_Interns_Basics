const unableToComplete = (tasks, papers) => {
    const unfinishedTasks = [];
    for (let i = tasks.length - 1; i >= 0; i--) {
        const task = tasks[i];
        if (task === papers[i]) {
            tasks.splice(i, 1);
            papers.splice(i, 1)
        } else {
            unfinishedTasks.unshift(task);
        }
    }
    let k = 0;
    while (unfinishedTasks.length > 0) {
        if (unfinishedTasks.includes(papers[k])) {
            const index = unfinishedTasks.indexOf(papers[k]);
            unfinishedTasks.splice(index, 1);
        }
        k++;
        if (k >= papers.length) {
            break;
        }
    }

    return unfinishedTasks;
};

console.log(unableToComplete([1,1,0,0], [0,1,0,1]))
console.log(unableToComplete([0,0,0,1], [0,0,0,1]))
console.log(unableToComplete([1,1,1,1], [0,0,0,1]))
console.log(unableToComplete([1,1,0,0], [0,0,0,1]))
console.log(unableToComplete([0,1,1,1], [1,1,1,1]))
