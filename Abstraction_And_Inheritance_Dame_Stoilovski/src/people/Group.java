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
        if (this.groupType.equals("big")) {
            this.groupDiscount = 0.25;
        } else if (this.groupType.equals("medium")) {
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
            this.groupType = "big";
        } else if (this.groupSize > 20) {
            this.groupType = "medium";
        } else {
            this.groupType = "small";
        }
    }

    @Override
    public double groupExpenses() {
        double expenses = this.groupSize * attraction.getTicketPrice() + this.groupSize * attraction.getGuideBookPrice();
        expenses -= expenses * this.groupDiscount;
        return expenses;
    }

    @Override
    public String toString() {
        return "The group is " + this.groupType + ", " + this.groupSize + " number of people. " +
                "Total cost for the group to visit the " + this.attraction.getName() + " will be "
                + this.groupExpenses() + " leva.\n" + attraction.getInfo();
    }
}
