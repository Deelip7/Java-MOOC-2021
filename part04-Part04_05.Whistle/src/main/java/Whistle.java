public class Whistle {
    private String sound;

    public Whistle(String whistleSound){
        this.sound = whistleSound;
    }

    public void sound(String sound){
        this.sound = sound;
    }

    public void sound() {
        System.out.println(this.sound);
    }
}
