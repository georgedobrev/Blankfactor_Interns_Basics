class Contact {
    constructor(phoneNumber) {
      this.phoneNumber = phoneNumber;
      this.next = null;
    }
  }
  
  class PhoneBook {
    constructor() {
      this.head = null;
      this.tail = null;
      this.length = 0
    }
  
    addContact(phoneNumber) {
      const newContact = new Contact(phoneNumber);
      if (!this.head) {
        this.head = newContact;
        this.tail = newContact
      } else {
        this.tail.next = newContact
        this.tail = newContact

        this.length++
      }
    } 

    insertContactAtPosition(position, phoneNumber) {
      const newContact = new Contact(phoneNumber);
      if (position === 0) {
        newContact.next = this.head;
        this.head = newContact;
      } else {
        let current = this.head;
        let count = 0;
        while (count < position - 1 && current) {
          current = current.next;
          count++;
        }
        if (!current) {
          console.log("Invalid position");
          return;
        }
        newContact.next = current.next;
        current.next = newContact;
      }
    }
  
    removeContactAtPosition(position) {
      if (!this.head) {
        console.log("Phone book is empty");
        return;
      }
      if (position === 0) {
        this.head = this.head.next;
      } else {
        let current = this.head;
        let count = 0;
        while (count < position - 1 && current) {
          current = current.next;
          count++;
        }
        if (!current || !current.next) {
          console.log("Invalid position");
          return;
        }
        current.next = current.next.next;
      }
    }
  
    printAllContacts() {
        let current = this.head;
        while (current) {
          console.log(`${current.phoneNumber}`);
          current = current.next;
        }
      }
  }
  
  // Example usage
  const phoneBook = new PhoneBook();
  phoneBook.addContact("+359 12 74 24 84");
  phoneBook.addContact("+359 11 11 22 44");
  phoneBook.addContact("+359 99 18 99 11");     //this one to be removed
  phoneBook.addContact("+359 44 74 24 84");
  phoneBook.addContact("+359 88 33 44 55");

  phoneBook.insertContactAtPosition(3,"+359 83 74 84 84");
  phoneBook.removeContactAtPosition(2);

  phoneBook.printAllContacts();
