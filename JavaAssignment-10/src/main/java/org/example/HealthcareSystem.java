package org.example;

public class HealthcareSystem {
    public static void main(String[] args) {
            Person person1 = new Person("Tanveer", 18930);
        Person person2 = new Person("Salahuddin", 20);

        Patient patient = new Patient(person1, "p123", "couhing");
        Doctor doctor = new Doctor(person2, "Cardiology", "D456");

        System.out.println("Patient Information:");
        patient.displayInfo();
        System.out.println("\nDoctor Information:");
        doctor.displayInfo();
    }
}

