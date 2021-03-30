package main;

import student.Student;

public class Main {

    public static void main(String[] args) {
        Student s = new Student ();
          
        s.setFirstName("Petar");
        s.setLastName("Petrović");
        s.setYearOfBirth(1990);
        s.getCourse();
        s.getComputer();
        s.getComputer().setPrecessTact(4.0);
        s.getComputer().setMemory(16.0);
        s.getComputer().setHardDrive(2000);
        s.getCourse().setName("QA");
        s.getCourse().setNumberOfClasses(40);
        s.getComputer().setOperatingSystem("Linux");
        
        s.info();
    
}
}
