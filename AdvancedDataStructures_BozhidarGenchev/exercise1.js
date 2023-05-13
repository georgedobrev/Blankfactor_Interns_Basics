function matrixMultiplayer (matrix1,matrix2){
    let finalMatrix=[]
for(let i=0;i<matrix1.length;i++){
    finalMatrix.push([])
    finalMatrix[i][0]=matrix1[i][0]+matrix2[i][0]
    finalMatrix[i][1]=matrix1[i][1]+matrix2[i][1]
    finalMatrix[i][2]=matrix1[i][2]+matrix2[i][2]
}
console.log(finalMatrix[1])

}
matrixMultiplayer([[1,2,3],[4,5,6]],[[7,8,9],[10,11,12]])