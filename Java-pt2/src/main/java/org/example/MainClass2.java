public class MainClass2 {
    public static void main(String[] args) {
        Job softwareEngineer = new Job("Senior Software Engineer", 180000);
        Person person = new Person("Areeb Nehas", 23, softwareEngineer);
        person.displayInfo();
    }
}
