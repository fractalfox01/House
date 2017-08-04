public class Main{

    public static void main(String[] args){

        Bulb myLightBulb = new Bulb("On");
        Dimensions myLightDimension = new Dimensions(1,1,1);
        Light myLight = new Light("White", myLightDimension, myLightBulb);
        Dimensions windowDimension = new Dimensions(4,2,1);
        Switch myLightSwitch = new Switch(myLight,myLightBulb);
        Window myWindow = new Window("Square", windowDimension);
        Carpet myCarpet = new Carpet("blue", new Dimensions(10,1,10));
        Dimensions doorDimension = new Dimensions(2,8,1);
        Door myDoor = new Door("Square",doorDimension);
        FanSwitch fanSwitch = new FanSwitch(true);
        Fan myFan = new Fan(54,"Brown", fanSwitch);
        RoomArea rmArea = new RoomArea(12,8,12);

        Room myRoom = new Room(myWindow,myCarpet,myDoor,myFan,rmArea,myLightSwitch,myLightBulb);
        myRoom.turnOnLights();
        myRoom.turnOffLights();




    }
}
