package final_homework;

public class Laptop {
    
    String model;
    Integer hd;
    Integer ram;
    String os;
    
    @Override
    public String toString(){
        return "ОЗУ: " + ram  + ", HD: " + hd + ", ОС: " + os + ", Model: " + model;
    }
    
}
