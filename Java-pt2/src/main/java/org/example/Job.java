public class Job {
    String title;
    double salary;

    public Job(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public void displayJobInfo() {
        System.out.println("Title: " + title);
        System.out.println("Salary: $" + salary);
    }
}
