package org.example;

    public class Doctor extends Person {
        private String specialization;
        private String doctorId;

        public Doctor(Person person, String specialization, String doctorId) {
            super(person.getName(), person.getAge());
            this.specialization = specialization;
            this.doctorId = doctorId;
        }

        public String getSpecialization() {
            return specialization;
        }

        public String getDoctorId() {
            return doctorId;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Specialization: " + specialization + ", Doctor ID: " + doctorId);
        }
    }


