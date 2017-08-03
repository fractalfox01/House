public class LightSwitch {
    private boolean ltStatus;

    public LightSwitch(boolean ltStatus) {
        this.ltStatus = ltStatus;
    }

    public boolean isLtStatus() {
        if(this.ltStatus){
            System.out.println("Light is On");
        }
        else{
            System.out.println("Light is Off");
        }
        return ltStatus;
    }
}
