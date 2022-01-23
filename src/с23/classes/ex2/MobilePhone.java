package с23.classes.ex2;

public class MobilePhone extends Telephone{
    private String [] callsHistory = new String[10];

    public MobilePhone(String communicationInterface, String color) {
        super(communicationInterface, color);
    }

    @Override
    public void call(String phoneNumber){
        System.out.println("Calling " + phoneNumber);
        for (int i = callsHistory.length-1; i > 0 ; i--) {
            callsHistory[i] = callsHistory[i-1];
        }
        callsHistory[0] = phoneNumber;
    }

    @Override
    public void showCallsHistory(){
        for (int i = 0; i < callsHistory.length ; i++) {
            if (callsHistory[i]!=null)
                System.out.println(i+1 + " " + callsHistory[i]);
        }
    }
}
