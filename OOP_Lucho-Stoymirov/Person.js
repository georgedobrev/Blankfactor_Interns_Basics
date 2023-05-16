class Person{
    constructor(name, age, courses){
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    addCourse(newCourse){
        var courses = this.courses;
        courses = courses.push(newCourse);
    }

    removeCourse(removedCourse){
        var match = this.courses.indexOf(removedCourse);
        if(match === -1){
            return false;
        }else{
            this.courses.splice(match, 1);
            return true;
        }
    }

    getCourses(){
        
        return this.courses;
    }

    getAge(){
        return this.age;
    }

    getName(){
        return this.name;
    }

}





