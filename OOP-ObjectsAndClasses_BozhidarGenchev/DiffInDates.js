class DateModifier {
  constructor() {
    this.dateFormat = "YYYY-MM-DD";
    this.diffDays = 0;
  }

  calculate(date1, date2) {
    const date1Obj = new Date(date1);
    const date2Obj = new Date(date2);

    const timeDiff = Math.abs(date2Obj.getTime() - date1Obj.getTime());
    this.diffDays = Math.ceil(timeDiff / (1000 * 3600 * 24));

    return this.diffDays;
  }
}

const modifier = new DateModifier();
const daysDifference = modifier.calculate("2023-01-01", "2023-01-10");
console.log(daysDifference);
