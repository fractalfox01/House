public class Fan {
    private int size;
    private String color;
    private FanSwitch fanSwitch;

    public Fan(int size, String color, FanSwitch fanSwitch) {
        this.size = size;
        this.color = color;
        this.fanSwitch = fanSwitch;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public FanSwitch getFanSwitch() {
        return fanSwitch;
    }
}
