const mergeTwoString = (word1, word2) => {
    const splitWord1 = word1.split('');
    const splitWord2 = word2.split('');
    const arr = [];
    for (let i = 0; i < splitWord1.length; i++) {
        const first = splitWord1[i].concat(splitWord2[i])
        arr.push(first);
    }


    return arr.join("");


}


console.log(mergeTwoString("abc", "pqr"));