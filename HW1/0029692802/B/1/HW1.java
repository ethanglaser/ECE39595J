public class HW1 {
    public static void main(String[ ] args) {

        Automobile car1 = new Automobile(123456789, 250000f, 1, 1, 1972);
        Automobile car2 = new Automobile(987654321, 1278f, 6, 14, 2020);
        System.out.println(car1.getVehicleID());
        System.out.println(car1.getMiles());
        System.out.println(car1.getMaintenanceDate());

        System.out.println(car2.getVehicleID());
        System.out.println(car2.getMiles());
        System.out.println(car2.getMaintenanceDate());
    }
}
