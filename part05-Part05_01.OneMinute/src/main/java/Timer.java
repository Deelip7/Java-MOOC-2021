public class Timer {
    private ClockHand seconds;
    private  ClockHand hundredthsSec;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthsSec = new ClockHand(100);
    }


    public void advance() {
        this.hundredthsSec.advance();

        if (this.hundredthsSec.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + hundredthsSec;
    }


}
