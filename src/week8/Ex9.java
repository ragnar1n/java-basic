package week8;

public class Ex9 {
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        VehicleRegister register = new VehicleRegister();
        register.add(reg1, "Arto");
        register.add(reg3, "Jürgen");

        System.out.println("Owner of plate1: " + register.get(reg1));
        System.out.println("Owner of plate2: " + register.get(reg2));
        System.out.println("Owner of plate3: " + register.get(reg3));

        register.printRegistrationPlates();
        System.out.println("Owners:");
        register.printOwners();
    }
}
