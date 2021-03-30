package student;

import computer.Computer;
import course.Course;

public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;
    
    public String getFirstName (){
        return this.firstName;
    }
    public void setFirstName (String newFirstName){
        this.firstName = newFirstName;
    }
    public String getLastName (){
        return this.lastName;
    }
    public void setLastName (String newLastName){
        this.lastName = newLastName;
    }
    public int getYearOfBirth (){
        return this.yearOfBirth;
    }
    public void setYearOfBirth (int newYearOfBirth){
        this.yearOfBirth = newYearOfBirth;
    }
    public Course getCourse (){
        return this.course;
    }
    public Computer getComputer (){
        return this.computer;
    }
    
    public Student (){
        this.firstName = "Petar";
        this.lastName = "Petrović";
        this.yearOfBirth = 1990;
        this.computer = new Computer ();
        this.course = new Course () ;
    }
    
    public Student (String firstName, String lastName, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
//    public Student (){ //Ne mozemo imati dve neparametrizovane metode. Naziv konstruktora je isti kao naziv Class-e! 
//        this.course = new Course ();
//        this.computer = new Computer ();
//    }
    
    public void info (){
        System.out.println("* " + "First name: " + this.firstName);
        System.out.println("* " + "Last name: " + this.lastName);
        System.out.println("* " + "Year of birth: " + this.yearOfBirth);
        System.out.println("* " + "Course name: " + course.getName() );
        System.out.println("* " + "Course number of classes: " + course.getNumberOfClasses());
        System.out.println("* " + "Process tact: " + computer.getProcessTact() + " GHz");
        System.out.println("* " + "Memory: " + computer.getMemory() + " GB");
        System.out.println("* " + "Hard drive: " + computer.getHardDrive() + " GB");
        System.out.println("");
    }      
}
        // kako postaviti bullets kockice? 
