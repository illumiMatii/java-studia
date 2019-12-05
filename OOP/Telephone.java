package OOP;

public class Telephone {

    String brand;
    String model;
    int memory;
    static String owner;
    private String serialnum; //LEFT ALT + INSERT

    void setSerialnum(String serialnum){
        if(serialnum.length() < 5) System.out.println("Za krótki numer seryjny");
        else this.serialnum = serialnum;
    }

    String getSerialnum(){
        return serialnum;
    }

    Telephone(String brand, String model, int memory){
        this.brand = brand;
        this.model = model;
        this.memory = memory;
    }

    Telephone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
}

/* public class Smartphone extends Telephone {
    int camera;
    String system;

    Telephone(String brand, String model, String owner, int memory, int camera, String system){
        super(brand, model, owner, memory);
        this.camera = camera;
        this.system = system;
    }
} */
