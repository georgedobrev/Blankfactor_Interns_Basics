function clockWiseMatrix (matrix){
let newMatrix=[]
let reversedMatrix=matrix.reverse()
for(let i=0;i<reversedMatrix.length;i++){
    newMatrix.push([])
   for(let k=0;k<reversedMatrix.length;k++){
    newMatrix[i].push(reversedMatrix[k][i])
   }
    
}

console.log(newMatrix)
}

clockWiseMatrix([[1,2,3],[4,5,6],[7,8,9]])