package computer;

public class Computer {
    private String operatingSystem;
    private double processTact;
    private double memory;
    private int hardDrive;
    
    public String getOperatingSystem (){
        return this.operatingSystem;
    }
    public void setOperatingSystem (String newOperatingSystem){
            this.operatingSystem = newOperatingSystem;
    }
    public double getProcessTact (){
        return this.processTact;
    }
    public void setPrecessTact (double newProcessTact){
        this.processTact = newProcessTact;
    }
    public double getMemory (){
        return this.memory;
    }
    public void setMemory (double newMemory){
        this.memory = newMemory;
    }
    public int getHardDrive (){
        return this.hardDrive;
    }
    public void setHardDrive (int newHardDrive){
        this.hardDrive = newHardDrive;
    }
    public Computer (){
        this.operatingSystem = "Linux";
        this.processTact = 2.4;
        this.memory = 16.0;
        this.hardDrive = 500;
    }
    public Computer (String operatingSystem, double processTact, double memory, int hardDrive){
        this.operatingSystem = operatingSystem;
        this.processTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }
    public void info (){
        System.out.println("Operating system: " + this.operatingSystem);
        System.out.println("Process Tact: " + this.processTact + "GHz");
        System.out.println("Memory: " + this.memory + "GB");
        System.out.println("Hard Drive: " + this.hardDrive + "GB");
        System.out.println("");
    }
}
