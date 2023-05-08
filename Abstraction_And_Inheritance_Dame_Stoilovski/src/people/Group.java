package people;

import attractions.TouristAttraction;

public class Group implements TourGroup{
    private int groupSize;
    private double groupDiscount;
    private TouristAttraction attraction;

    private String groupType;

    public Group(int groupSize, TouristAttraction attraction) {
        this.groupSize = groupSize;
        this.setGroupType();
        this.setGroupDiscount();
        this.attraction = attraction;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupDiscount() {
        if (this.groupType.equals("Big")) {
            this.groupDiscount = 0.25;
        } else if (this.groupType.equals("Medium")) {
            this.groupDiscount = 0.15;
        } else {
            this.groupDiscount = 0.1;
        }
    }


    public String getGroupType() {
        return groupType;
    }

    public void setGroupType() {
        if (this.getGroupSize() > 50) {
            this.groupType = "Big";
        } else if (this.groupSize > 20) {
            this.groupType = "Medium";
        } else {
            this.groupType = "Small";
        }
    }

    @Override
    public double groupExpenses() {
        double expenses = this.groupSize * attraction.getTicketPrice() + this.groupSize * attraction.getGuideBookPrice();
        expenses -= expenses * this.groupDiscount;
        return expenses;
    }
}
