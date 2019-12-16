package pojazdy;

public class Czolg extends Gasienicowe {

    Czolg(int year, String engineType, String color, int weight, int moc){
        super(year, engineType, color, weight, moc);
    }

    static String uruchomSilnik(){
        return Gasienicowe.uruchomSilnik();
    }

    /*
    11. Pod dodaniu final do Klasy Gasienicowe i dodaniu metody uruchomSilnik() do Klasy Czolg
        wyswietla błąd:
        - cannot inherit from final pojazdy.Gasienicowe.
     */
}
