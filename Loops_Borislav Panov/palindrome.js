const palindrome = (x) => {
    const arr = x.split('');
    let arr2 = [];
    for (let i = arr.length - 1; i >= 0; i--) {
        arr2.push(arr[i]);
    }
    return arr.join('') === arr2.join('');
}


console.log(palindrome('12121'));