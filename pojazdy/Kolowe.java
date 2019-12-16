package pojazdy;

public class Kolowe extends Vehicle {



    int rozmiarOpony;

    public Kolowe(int year, String engineType, String color, int weight, int rozmiarOpony){
        super(year, engineType, color, weight);
        this.rozmiarOpony = rozmiarOpony;
    }

    void setRozmiarOpony(int rozmiarOpony){
        if(rozmiarOpony < 13) System.out.println("Podałeś za mały rozmiar opony.");
        else this.rozmiarOpony = rozmiarOpony;
    }

    int getRozmiarOpony(){
        return this.rozmiarOpony;
    }

    static String uruchomSilnik(String engineType){
        return "Uruchomiono silnik " + engineType;
    }

}
