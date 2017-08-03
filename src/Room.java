public class Room {

    private Window window;
    private Carpet carpet;
    private Door door;
    private Fan fan;
    private FanSwitch fanSwitch;
    private RoomArea roomArea;

    public Room() {
        System.out.println("Null Room Created");
    }

    public Room(Window window, Carpet carpet, Door door, Fan fan, RoomArea roomArea) {

        this.window = window;
        this.carpet = carpet;
        this.door = door;
        this.fan = fan;
        this.roomArea = roomArea;
    }

    public void TurnonLight(){

    }

    public RoomArea getRoomArea() {
        return roomArea;
    }

    public Window getWindow() {
        return window;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Door getDoor() {
        return door;
    }

    public Fan getFan() {
        return fan;
    }

}
