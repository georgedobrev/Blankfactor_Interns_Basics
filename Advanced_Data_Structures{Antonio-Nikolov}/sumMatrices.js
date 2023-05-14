const sumMatrices = (matrix1, matrix2) => {
    const matricesSum = [];
  
    if (
      matrix1.length !== matrix2.length ||
      matrix1[0].length !== matrix2[0].length
    ) {
      console.log("Matrices should be with the same size.");
      return;
    }
  
    const sumRows = (row1, row2) => {
      const result = [];
      for (let i = 0; i < row1.length; i++) {
        result.push(row1[i] + row2[i]);
      }
      return result;
    };
  
    for (let i = 0; i < matrix1.length; i++) {
      matricesSum.push(sumRows(matrix1[i], matrix2[i]));
    }
  
    console.log(matricesSum);
  };
  
  sumMatrices(
    [
      [1, 2, 3],
      [4, 5, 6],
    ],
    [
      [7, 8, 9],
      [10, 11, 12],
    ]
  );