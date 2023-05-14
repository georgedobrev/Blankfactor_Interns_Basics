const rotateMatrix = (matrix) => {
    
  for (let i = 0; i < matrix.length; i++) {
    for (let j = i; j < matrix.length; j++) {
      const temp = matrix[i][j];
      matrix[i][j] = matrix[j][i];
      matrix[j][i] = temp;
    }
  }

  for (let i = 0; i < matrix.length; i++) {
    for (let j = 0; j < matrix.length / 2; j++) {
      const temp = matrix[i][j];
      matrix[i][j] = matrix[i][matrix.length - j - 1];
      matrix[i][matrix.length - j - 1] = temp;
    }
  }

  for (let i = 0; i < matrix.length; i++) {
    console.log(matrix[i].join(" "));
  }
};

rotateMatrix([
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
]);
