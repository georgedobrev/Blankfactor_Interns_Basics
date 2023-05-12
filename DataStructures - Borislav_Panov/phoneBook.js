class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    append(value) {
        const node = new Node(value);
        if (!this.head) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.length++;
    }

    removeHead() {
        if (!this.head) {
            return null;
        }
        const value = this.head.value;
        this.head = this.head.next;
        this.length--;
        return value;
    }

    insertAt(position, value) {
        if (position < 0 || position > this.length) {
            return false;
        }

        const node = new Node(value);
        if (position === 0) {
            node.next = this.head;
            this.head = node;
            if (!this.tail) {
                this.tail = node;
            }
        } else if (position === this.length) {
            this.tail.next = node;
            this.tail = node;
        } else {
            let current = this.head;
            let previous = null;
            let index = 0;
            while (index < position) {
                previous = current;
                current = current.next;
                index++;
            }
            previous.next = node;
            node.next = current;
        }

        this.length++;
        return true;
    }

    removeAt(position) {
        if (position < 0 || position >= this.length) {
            return null;
        }

        let value;
        if (position === 0) {
            value = this.head.value;
            this.head = this.head.next;
            if (!this.head) {
                this.tail = null;
            }
        } else {
            let current = this.head;
            let previous = null;
            let index = 0;
            while (index < position) {
                previous = current;
                current = current.next;
                index++;
            }
            value = current.value;
            previous.next = current.next;
            if (!current.next) {
                this.tail = previous;
            }
        }

        this.length--;
        return value;
    }

    toArray() {
        const array = [];
        let current = this.head;
        while (current) {
            array.push(current.value);
            current = current.next;
        }
        return array;
    }
}

const phoneBook = new LinkedList();

phoneBook.append("+359 88 432 1243");
phoneBook.append("+359 88 471 0455");
phoneBook.append("+359 88 909 0943");
phoneBook.insertAt(3, "+359 83 74 84 84");
phoneBook.append("+359 88 432 0112");
phoneBook.append("+359 88 352 0649");

console.log(phoneBook.toArray());

phoneBook.removeAt(2);

console.log(phoneBook.toArray());
