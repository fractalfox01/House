public class Room {

    private Window window;
    private Carpet carpet;
    private Door door;
    private Fan fan;
    private FanSwitch fanSwitch;
    private RoomArea roomArea;
    private Switch myLightSwitch;
    private Bulb myLightBulb;

    public Room() {
        System.out.println("Null Room Created");
    }

    public Room(Window window, Carpet carpet, Door door, Fan fan, RoomArea roomArea, Switch myLightSwitch, Bulb myLightBulb) {

        this.window = window;
        this.carpet = carpet;
        this.door = door;
        this.fan = fan;
        this.roomArea = roomArea;
        this.myLightSwitch = myLightSwitch;
        this.myLightBulb = myLightBulb;
    }

    public void turnOnLights(){
        flipSwitch("On");
    }

    public void turnOffLights(){
        flipSwitch("Off");
    }

    private void flipSwitch(String lightValue){
        myLightBulb.setBulbStatus(lightValue);
        System.out.println("Light has been turned " + myLightBulb.getBulbStatus());
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
