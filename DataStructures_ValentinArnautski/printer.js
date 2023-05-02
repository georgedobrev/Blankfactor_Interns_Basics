const countUnfinishedTasks = (tasks, papers) => {

    let counter = 0;
    while(counter <= tasks.length && tasks.length) {
        if(tasks[0] === papers[0]){
            counter = 0;
            tasks.shift();
            papers.shift();
        } else {
            counter++;
            let firstItem = tasks[0];
            tasks.shift()
            tasks.push(firstItem);
        }
    }

    if (counter > tasks.length) {
        console.log(`There are ${tasks.length} uncompleted tasks`)
    } else {
        console.log("All tasks are printed")
    }

  }
  
  const arrayOfPaper = [1, 1, 0, 0];
  const arrayOfTasks = [0, 1, 1, 0];
  console.log(countUnfinishedTasks(arrayOfTasks, arrayOfPaper));
