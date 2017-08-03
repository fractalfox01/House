public class FanSwitch {
    private boolean fanStatus;

    public FanSwitch(boolean fanStatus) {
        this.fanStatus = fanStatus;
    }

    public boolean isFanStatus() {
        if(this.fanStatus){
            System.out.println("Fan is On");
        }
        else{
            System.out.println("Fan is Off");
        }
        return this.fanStatus;
    }
}
