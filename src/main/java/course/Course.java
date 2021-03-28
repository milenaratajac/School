package course;

public class Course {
    private String name;
    private int numberOfClasses;
    private String codeName;
    
    public String getName (){
        return this.name;
    }
    public void setName (String newName){
        this.name = newName;
    }
    public int getNumberOfClasses (){
        return this.numberOfClasses;
    }
    public void setNumberOfClasses (int newNumberOfClasses){
        this.numberOfClasses = newNumberOfClasses;
    }
    public String getCodeName (){
        return this.codeName;
    }
    public void setCodeName (String newCodeName){
        this.codeName = newCodeName;
    }
    public Course (){
        this.name = "QA";
        this.codeName = "Initial level";
        this.numberOfClasses = 80;
    }
    public Course (String name, int numberOfClasses, String codeName){
        this.name = name;
        this.codeName = codeName;
        this.numberOfClasses = numberOfClasses;
    }
    public void info (){
        System.out.println("Naziv kursa: " + this.name);
        System.out.println("Šifra kursa: " + this.codeName);
        System.out.println("Broj časova: " + this.numberOfClasses);
        System.out.println("");
        
    }
    
}
