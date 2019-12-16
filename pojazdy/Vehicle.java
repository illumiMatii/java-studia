package pojazdy;

/*
 12. Modifier 'private' not allowed here.
 13. Modifier 'protected' not allowed here.
 */

public class Vehicle {
    int year;
    String engineType;
    String color;
    int weight;

    static String uruchomSilnik(){
        return "Silnik uruchomiono";
    }

    Vehicle(int year, String engineType, String color, int weight){
        this.year = year;
        this.engineType = engineType;
        this.color = color;
        this.weight = weight;
    }

    //Setters
    void setYear(int year){
        this.year = year;
    }

    void setEngineType(String engineType){
        this.engineType = engineType;
    }

    void setColor(String color){
        this.color = color;
    }

    void setWeight(int weight){
        this.weight = weight;
    }

    //Getters
    int getYear(){
        return this.year;
    }

    String getEngineType(){
        return this.engineType;
    }

    String getColor(){
        return this.color;
    }

    int getWeight(){
        return  this.weight;
    }

}
