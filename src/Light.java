public class Light {
    private String color;
    private Dimensions dimensions;
    private Bulb myLightBulb;

    public Light(String color, Dimensions dimensions, Bulb myLightBulb) {
        this.color = color;
        this.dimensions = dimensions;
        this.myLightBulb = myLightBulb;
    }

    public String getColor() {
        return color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public Bulb getMyLightBulb() {
        return myLightBulb;
    }
}
