public class Main{

    public static void main(String[] args){

        Dimensions windowDimension = new Dimensions(4,2,1);
        Window myWindow = new Window("Square", windowDimension);
        Carpet myCarpet = new Carpet("blue", new Dimensions(10,1,10));
        Dimensions doorDimension = new Dimensions(2,8,1);
        Door myDoor = new Door("Square",doorDimension);
        FanSwitch fanSwitch = new FanSwitch(true);
        Fan myFan = new Fan(54,"Brown", fanSwitch);
        LightSwitch ltSwitch = new LightSwitch(true);
        Lights myLight = new Lights(24,"3000K", ltSwitch);
        RoomArea rmArea = new RoomArea(12,8,12);

        Room myRoom = new Room(myWindow,myCarpet,myDoor,myFan,myLight,ltSwitch,rmArea);

        myRoom.TurnonLight();


    }
}
