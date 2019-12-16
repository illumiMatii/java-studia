package pojazdy;

public class Osobowy extends Kolowe {

    private int iloscOsob;
    Osobowy(int year, String engineType, String color, int weight, int rozmiarOpony, int iloscOsob){
        super(year, engineType, color, weight, rozmiarOpony);
        this.iloscOsob = iloscOsob;
    }

    void setIloscOsob(int iloscOsob){
        if(iloscOsob < 1) System.out.println("Niepoprawne dane");
        else this.iloscOsob = iloscOsob;
    }

    int getIloscOsob(){
        return this.iloscOsob;
    }
}
