class DateModifier {
    constructor(date1,date2){
      this.date1=new Date(date1)
      this.date2=new Date(date2)
    }
    calculateDiff(){
      const diffTime = Math.abs(this.date2 - this.date1);
      const diffDays = Math.ceil(diffTime / (1000 * 60 * 60 * 24));
  
      return diffDays
    }
  }
  
  let newDateDiff= new DateModifier('2023-05-01', '2023-05-03')
  console.log(newDateDiff.calculateDiff())