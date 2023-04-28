const countUnfinishedTasks = (tasks, papers) => {
    let unfinished = 0;
    let i = 0;
  
    while (i < tasks.length) {
      if (tasks[i] === papers[0]) {
        papers.shift();
        tasks.splice(i, 1);
      } else {
        tasks.push(tasks.splice(i, 1)[0]);
        unfinished++;
      }
    }
  
    return `There was ${unfinished} unfinished tasks`;

  }
  
  const arrayOfPaper = [1, 0, 1, 0, 0, 1, 1, 1];
  const arrayOfTasks = [0, 1, 1, 0, 0, 1, 1, 1];
  console.log(countUnfinishedTasks(arrayOfTasks, arrayOfPaper));