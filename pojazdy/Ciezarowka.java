package pojazdy;

public class Ciezarowka extends Kolowe {

    private int udzwig;

    Ciezarowka(int year, String engineType, String color, int weight, int rozmiarOpony, int udzwig){
        super(year, engineType, color, weight, rozmiarOpony);
        this.udzwig = udzwig;
    }

    void setUdzwig(int udzwig){
        this.udzwig = udzwig;
    }

    int getUdzwig(){
        return this.udzwig;
    }

    public static String podniesSkrzynie(){
        return "Podnoszenie skrzyni";
    }
}
