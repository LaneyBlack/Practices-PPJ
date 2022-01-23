package c19.classes;

public class User {
    private String name;
    private int birthYear;

    public User(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public User(String name) {
        this.name = name;
        this.birthYear = 1990;
    }

    public void show() {
        System.out.println("Name: " + name + " birth year: " + birthYear);
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    //Ex5
    public static User returnOlder(User user1, User user2) {
        if (user1.getBirthYear() > user2.getBirthYear())
            return user2;
        else
            return user1;
    }

    public static User getOldest(User[] users) {
        User oldest = users[0];
        for (User tmp : users)
            oldest = returnOlder(oldest, tmp);
        return oldest;
    }
}
