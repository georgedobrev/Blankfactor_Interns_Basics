package Zoo;

public abstract class InfoAboutTheAnimal {
    protected boolean isVenomous;


    public InfoAboutTheAnimal(boolean isVenomous) {
        this.isVenomous = isVenomous;
    }
    public boolean isVenomous() {
        return isVenomous;
    }


    }



