const mergeTwoString = (word1, word2) => {
    let splitWord1 = word1.split('');
    let splitWord2 = word2.split('');
    let arr = [];
    for (let i = 0; i < splitWord1.length; i++) {
        let first = splitWord1[i].concat(splitWord2[i])
        arr.push(first);
    }

    
    return arr.join();

    
}


console.log(mergeTwoString("abc", "pqr"));