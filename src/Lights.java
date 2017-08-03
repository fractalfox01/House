public class Lights {
    private int size;
    private String Lumens;
    private LightSwitch ltSwitch;

    public Lights(int size, String lumens, LightSwitch ltSwitch) {
        this.size = size;
        Lumens = lumens;
        this.ltSwitch = ltSwitch;
    }

    public int getSize() {
        return size;
    }

    public String getLumens() {
        return Lumens;
    }

    public LightSwitch getLtSwitch() {
        return ltSwitch;
    }


}
