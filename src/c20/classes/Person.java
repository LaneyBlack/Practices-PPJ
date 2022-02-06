package c20.classes;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name) {
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
    public static Person getOlder(Person user1, Person user2) {
        if (user1.getBirthYear() > user2.getBirthYear())
            return user2;
        else
            return user1;
    }

    public static Person getOldest(Person[] users) {
        Person oldest = users[0];
        for (Person tmp : users)
            oldest = getOlder(oldest, tmp);
        return oldest;
    }

    public static Person[] sortPeopleYoungToOld(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < people.length; j++)
                if (people[minIndex].getBirthYear() < people[j].getBirthYear())
                    minIndex = j;
                Person tmp = people[i];
                people[i] = people[minIndex];
                people[minIndex] = tmp;
        }
        return people;
    }

    public static Person[] sortPeopleOldToYoung(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < people.length; j++)
                if (people[minIndex].getBirthYear() > people[j].getBirthYear())
                    minIndex = j;
            Person tmp = people[i];
            people[i] = people[minIndex];
            people[minIndex] = tmp;
        }
        return people;
    }
}
