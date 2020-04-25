public class StudyGroup {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Jan", "Sobieski", "trener");
        persons[1] = new Person("Grzegorz", "Brzęczyszczykiewicz", "student");
        persons[2] = new Person("Jola", "Lojalna", "studentka");

        System.out.println("prowadzący zajęcia:\n" + persons[0].getFirstName() + " "
                + persons[0].getLastName()
                + "," + persons[0].getOccupation());

        System.out.println("kursant 1:\n" + persons[1].getFirstName() + " "
                + persons[1].getLastName()
                + "," + persons[1].getOccupation());

        System.out.println("kursant 2:\n" + persons[2].getFirstName() + " "
                + persons[2].getLastName()
                + "," + persons[2].getOccupation());

    }
}
