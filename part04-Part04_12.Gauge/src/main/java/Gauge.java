public class Gauge {
    private int value = 0;

    public Gauge() {
    }

    public void increase() {
        if (value < 5) {

            this.value++;
        }
    }

    public void decrease() {
        if (value > 0) {

            this.value--;
        }
    }

    public int value() {
        return  this.value;
    }

    public boolean full() {
        return this.value == 5 ? true : false;
    }
}
