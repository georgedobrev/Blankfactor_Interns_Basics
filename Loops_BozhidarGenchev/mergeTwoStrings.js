function mergeStrings(word1,word2){
let str=""
for(let i=0 ;i<word1.length;i++){
   str+=word1[i]
   str+=word2[i]
}
console.log(str)
}
mergeStrings('abc','pqr')