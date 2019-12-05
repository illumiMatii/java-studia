package OOPSEC;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("Przed ustawieniem współrzędnych:");
        System.out.println("X: " + point.getParams().x);
        System.out.println("Y: " + point.getParams().y);

        point.setParams(241,233);
        System.out.println("Po ustawieniu współrzędnych:");
        System.out.println("X: " + point.getParams().x);
        System.out.println("Y " + point.getParams().y);
    }
}
