function countUnfinishedTasks(tasks, papers) {
  let unfinishedTasks = 0;
  let remainingPapers = papers.slice();

  for (let i = 0; i < tasks.length; i++) {
    const taskPaper = tasks[i];
    const availableIndex = remainingPapers.indexOf(taskPaper);

    if (availableIndex !== -1) {
      remainingPapers.splice(availableIndex, 1);
    } else {
      unfinishedTasks++;
    }
  }

  return unfinishedTasks;
}


