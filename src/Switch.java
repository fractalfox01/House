public class Switch {
    private Light rmLight;
    private Bulb myLightBulb;

    public Switch(Light rmLight, Bulb rmLightBulb) {
        this.rmLight = rmLight;
        this.myLightBulb = rmLightBulb;
    }

    public Light getRmLight() {
        return rmLight;
    }

    public Bulb getRmLightBulb() {
        return myLightBulb;
    }
}
