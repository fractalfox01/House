public class RoomArea {
    private int Width;
    private int height;
    private int depth;

    public RoomArea(int width, int height, int depth) {
        Width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return Width;
    }

    public String getRoomArea(){
        int height = getHeight();
        int width = getWidth();
        int depth = getDepth();
        int area = ( height * width * depth);

        return "Area of Room is: " + area;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
