package pojazdy;

public class Szynowe extends Vehicle {

    Szynowe(int year, String engineType, String color, int weight){
        super(year, engineType, color, weight);
    }

    static String uruchomSilnik(){
        return "Uruchomiono silnik pojazdu szynowego";
    }

}
