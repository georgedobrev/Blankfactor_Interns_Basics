function task2 (){
let phoneNums=['359 83 34 54 34','359 13 72 82 54','359 53 24 39 30','359 82 14 14 81','359 83 14 84 81','359 83 75 85 14']
phoneNums.splice(3,0,'359 83 74 84 84')
console.log(phoneNums)
phoneNums.splice(2,1)
console.log(phoneNums)
}
task2()


//newSolution with linked list...

class ListNode {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}

class PhoneBook {
  constructor() {
    this.head = null;
    this.size = 0;
  }

  add(phoneNumber) {
    let newNode = new ListNode(phoneNumber);
    if (this.head === null) {
      this.head = newNode;
    } else {
      let current = this.head;
      while (current.next !== null) {
        current = current.next;
      }
      current.next = newNode;
    }
    this.size++;
  }

  insert(phoneNumber, index) {
    if (index < 0 || index > this.size) {
      throw new Error('Index out of range');
    }

    let newNode = new ListNode(phoneNumber);
    if (index === 0) {
      newNode.next = this.head;
      this.head = newNode;
    } else {
      let current = this.head;
      let prev = null;
      let i = 0;
      while (i < index) {
        prev = current;
        current = current.next;
        i++;
      }
      prev.next = newNode;
      newNode.next = current;
    }
    this.size++;
  }

  remove(index) {
    if (index < 0 || index >= this.size) {
      throw new Error('Index out of range');
    }

    if (index === 0) {
      this.head = this.head.next;
    } else {
      let current = this.head;
      let prev = null;
      let i = 0;
      while (i < index) {
        prev = current;
        current = current.next;
        i++;
      }
      prev.next = current.next;
    }
    this.size--;
  }


  print() {
    let current = this.head;
    while (current !== null) {
      console.log(current.data);
      current = current.next;
    }
  }
}


const phoneBook = new PhoneBook();


phoneBook.add('+1 555-1234');
phoneBook.add('+44 20 7123 4567');
phoneBook.add('+81 3-1234-5678');
phoneBook.insert('+359 83 74 84 84', 3); // insert at index 3
phoneBook.add('+61 2 1234 5678');
phoneBook.add('+55 21 1234-5678');


phoneBook.print();


phoneBook.remove(2);


phoneBook.print();
