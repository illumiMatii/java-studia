package pojazdy;

/*
10. Pod dodaniu final do Klasy Octavia i utworzeniu nowej Klasy
    dziedziczącej z Klasy Octavia pojawia się błąd:
    - Cannot inherit from final 'pojazdy.Octavia'.

 */

public class Octavia extends Skoda {
    Octavia(int year, String engineType, String color, int weight, int rozmiarOpony, int iloscOsob){
        super(year, engineType, color, weight,rozmiarOpony, iloscOsob);
    }
}
