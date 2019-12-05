package OOP;

public class Main {
    public static void main(String[] args) {
        Telephone Smart1 = new Telephone("Samsung", "Galaxy S5", 64);
        Telephone.owner = "Chad Supercool";
        System.out.println("Właściciel telefonu "+ Smart1.brand + " " + Smart1.model + " to " + Telephone.owner);
        Smart1.setSerialnum("567893");
        System.out.println("Numer seryjny tego telefonu to: " + Smart1.getSerialnum());

        Telephone Smart2 = new Telephone("Xiaomi", "Najlepszy", 123123123);
        Telephone.owner = "Xiądz Robak";
        System.out.println("Właściciel telefonu "+ Smart2.brand + " " + Smart2.model + " to " + Telephone.owner);
        Smart2.setSerialnum("512065");
        System.out.println("Numer seryjny tego telefonu to: " + Smart2.getSerialnum());

        Telephone Tele1 = new Telephone("Motorola", "Razr");
        System.out.println(Tele1);

    }
}
