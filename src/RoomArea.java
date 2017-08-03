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

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
