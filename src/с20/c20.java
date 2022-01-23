package с20;

import с20.classes.*;

import static с20.classes.Person.sortPeopleOldToYoung;
import static с20.classes.Person.sortPeopleYoungToOld;

public class c20 {
    public static void main(String[] args) {
        System.out.println("---------------------------------Ex1---------------------------------");
        Corn corn = new Corn(25);
        Popcorn[] popcorn = corn.makePopcorn();
        for (int i = 0; i < popcorn.length; i++)
            System.out.println(i + " - " + popcorn[i].getTaste());
        System.out.println("---------------------------------Ex2---------------------------------");
        Person person1 = new Person("Polina", 2000);
        Person person2 = new Person("Anton", 2004);
        Person person3 = new Person("Michal", 1985);
        Person person4 = new Person("Diana", 1995);
        Person [] people = {person1, person2, person3, person4};

        people = sortPeopleYoungToOld(people);
        for (Person val : people)
            System.out.println(val.getName() + " - " + val.getBirthYear());
        System.out.println("---------------");
        people = sortPeopleOldToYoung(people);
        for (Person val : people)
            System.out.println(val.getName() + " - " + val.getBirthYear());
        System.out.println("---------------------------------Ex3---------------------------------");
        Word w1 = new Word();
        w1.addChar('g');
        w1.addChar('r');
        w1.addChar('i');
        w1.addChar('p');
        w1.show();
        System.out.println();
        System.out.println(w1.getLength());
        System.out.println("---------------------------------Ex4---------------------------------");
        PhraseTable phraseTable = new PhraseTable();
        Word w2 = new Word();
        w2.addChar('i');
        w2.addChar('s');
        Word w3 = new Word();
        w3.addChar('h');
        w3.addChar('a');
        w3.addChar('r');
        w3.addChar('d');
        phraseTable.addWordAtEnd(w1);
        phraseTable.addWordAtEnd(w2);
        phraseTable.addWordAtEnd(w3);
        phraseTable.show();
        System.out.println("----------------");
        PhraseList phraseList = new PhraseList();
        phraseList.addWordAtEnd(w1);
        phraseList.addWordAtEnd(w2);
        phraseList.addWordAtEnd(w3);
        phraseList.show();
    }
}
