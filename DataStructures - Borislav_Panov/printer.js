const unableToComplete = (tasks, papers) => {
    const unfinishedTasks = [];

    for (let i = tasks.length - 1; i >= 0; i--) {
        const task = tasks[i];
        if (task === papers[i]) {
            tasks.splice(i, 1);
        } else {
            unfinishedTasks.push(task);
        }
    }
    return unfinishedTasks;
};



console.log(unableToComplete([0,0,0,1], [0,0,0,1]))