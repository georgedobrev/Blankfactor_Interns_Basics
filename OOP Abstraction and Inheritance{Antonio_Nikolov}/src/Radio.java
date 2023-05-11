public class Radio implements AudioSystem{

    @Override
    public void playMusic() {
        System.out.println("Z-Rock radio playing in the background!");
    }

    @Override
    public void stopMusic() {
        System.out.println("Radio turned off");
    }
}
