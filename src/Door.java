public class Door {
    private String shape;
    private Dimensions dimension;

    public Door(String shape, Dimensions dimension) {
        this.shape = shape;
        this.dimension = dimension;
    }

    public String getShape() {
        return shape;
    }

    public Dimensions getDimension() {
        return dimension;
    }
}
