// Interface 1: Visitable
class Visitable {
    visit() {
        throw new Error("Method 'visit()' must be implemented.");
    }
}

// Interface 2: Ratable
class Ratable {
    rate(rating) {
        throw new Error("Method 'rate()' must be implemented.");
    }
}

// Abstract class: TouristSpot
class TouristSpot {
    constructor(name) {
        if (new.target === TouristSpot) {
            throw new TypeError("Cannot construct Abstract instances directly");
        }
        this.name = name;
    }

    getDescription() {
        throw new Error("Method 'getDescription()' must be implemented.");
    }
}

// Inheriting class 1: Sight
class Sight extends TouristSpot {
    constructor(name, description) {
        super(name);
        this.description = description;
        this.visitors = 0;
        this.totalRating = 0;
        this.numberOfRatings = 0;
    }

    // Implementing Visitable interface
    visit() {
        this.visitors += 1;
    }

    // Implementing Ratable interface
    rate(rating) {
        this.totalRating += rating;
        this.numberOfRatings += 1;
    }

    getDescription() {
        return this.description;
    }

    getAverageRating() {
        return this.numberOfRatings > 0 ? this.totalRating / this.numberOfRatings : 0;
    }
}

// Inheriting class 2: TouristGroup
class TouristGroup extends TouristSpot {
    constructor(name, size) {
        super(name);
        this.size = size;
        this.visitedSights = [];
    }

    // Implementing Visitable interface
    visit(sight) {
        this.visitedSights.push(sight);
        sight.visit();
    }

    // Implementing Ratable interface
    rate(sight, rating) {
        sight.rate(rating);
    }

    getDescription() {
        return `A tourist group named ${this.name} with ${this.size} members.`;
    }
}


const eiffelTower = new Sight("Eiffel Tower", "An iconic iron tower located in Paris, France.");
console.log(eiffelTower.getDescription()); 

const touristGroup = new TouristGroup("Explorers", 5);
touristGroup.visit(eiffelTower);
touristGroup.rate(eiffelTower, 5);
console.log(touristGroup.getDescription()); 
console.log(eiffelTower.getAverageRating()); 
