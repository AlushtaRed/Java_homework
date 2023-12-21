package final_homework;

public class Laptop {
    
    String model;
    Integer hd;
    Integer ram;
    String os;
    
    @Override
    public String toString(){
        return "Model: " + model + ", HD: " + hd + ", ОЗУ: " + ram + ", ОС: " + os;
    }
    
}
