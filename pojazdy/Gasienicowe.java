package pojazdy;

public class Gasienicowe extends Vehicle {

    private int moc;

    Gasienicowe(int year, String engineType, String color, int weight, int moc){
        super(year, engineType, color, weight);
        this.moc = moc;
    }

    void setMoc(int moc){
        this.moc = moc;
    }

    int getMoc(){
        return this.moc;
    }

    static String uruchomSilnik(){
        return Vehicle.uruchomSilnik();
    }
}
