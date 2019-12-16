package pojazdy;

public class Sedan extends Osobowy {

    private String model;
    private String symbol;
    Sedan(int year, String engineType, String color, int weight, int rozmiarOpony, int iloscOsob, String model, String symbol){
        super(year, engineType, color, weight,rozmiarOpony, iloscOsob);
        this.model = model;
        this.symbol = symbol;
    }


    void setModel(String model){
        this.model = model;
    }

    void setSymbol(String symbol){
        this.symbol = symbol;
    }

    String getModel(){
        return this.model;
    }

    String getSymbol(){
        return this.symbol;
    }
}
