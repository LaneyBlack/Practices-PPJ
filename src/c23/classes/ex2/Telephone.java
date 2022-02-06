package c23.classes.ex2;

public class Telephone {
    private String communicationInterface;
    private String color;

    public Telephone(String communicationInterface, String color) {
        this.communicationInterface = communicationInterface;
        this.color = color;
    }

    public void call (String phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    public void showCallsHistory() {
        System.out.println("No history");
    }

    public String getCommunicationInterface() {
        return communicationInterface;
    }

    public void setCommunicationInterface(String communicationInterface) {
        this.communicationInterface = communicationInterface;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "communicationInterface='" + communicationInterface + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
