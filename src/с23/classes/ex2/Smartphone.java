package с23.classes.ex2;

public class Smartphone extends MobilePhone {
    private Person[] friends = new Person[0];

    public Smartphone(String communicationInterface, String color) {
        super(communicationInterface, color);
    }

    public void addFriend(Person person) {
        Person[] tmp = friends;
        friends = new Person[tmp.length + 1];
        for (int i = 0; i < tmp.length; i++) {
            friends[i] = tmp[i];
        }
        friends[friends.length - 1] = person;
    }

    public void call(Person person){
        System.out.println("Calling " + person.getPhoneNumber());
        addFriend(person);
    }
    public void showFriendsList() {
        System.out.println("List of friends: ");
        for (Person person : friends) {
            System.out.println("\t" + person.toString());
        }
    }
}
