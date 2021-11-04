package Lesson_4.part2;

public class Main {
    public static void main(String[] args) {
        System.out.println("*PhoneBook*");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Smith", 321654);
        phoneBook.add("Jones", 778899);
        phoneBook.add("Thomson", 556611);
        phoneBook.add("Moonlike", 225588);
        phoneBook.add("Stevens", 445577);
        phoneBook.add("Smith", 665522);

        System.out.println ("Smith: " + phoneBook.get("Smith"));
        System.out.println("Jones: " + phoneBook.get("Jones"));
        System.out.println("Thomson: " + phoneBook.get("Thomson"));
        System.out.println("Moonlike: " + phoneBook.get("Moonlike"));
        System.out.println("Stevens: " + phoneBook.get("Stevens"));
    }
}
