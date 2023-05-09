package Zoo;

public abstract class InfoAboutTheAnimal {
    protected boolean isVenomous;
    protected String name;
    protected int years;

    public InfoAboutTheAnimal(boolean isVenomous,String name,int years) {
        this.isVenomous = isVenomous;
        this.name=name;
        this.years=years;
    }

    public void setVenomous(boolean venomous) {
        isVenomous = venomous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public boolean isVenomous() {
        return isVenomous;
    }

    }



