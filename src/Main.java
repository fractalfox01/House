public class Main{

    public static void main(String[] args){

        Window myWindow = new Window("Square",4, 2);
        Carpet myCarpet = new Carpet();
        Door myDoor = new Door();
        Fan myFan = new Fan();
        Lights myLight = new Lights();
        LightSwitch mySwitch = new LightSwitch();
        RoomArea rmArea = new RoomArea(12,8,12);

        Room myRoom = new Room(myWindow,myCarpet,myDoor,myFan,myLight,mySwitch,rmArea);
        System.out.println();
    }
}
