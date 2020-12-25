public class Automobile {

    private Integer vehicleID;
    private Float miles;
    private Integer maintenanceMonth;
    private Integer maintenanceDay;
    private Integer maintenanceYear;

    public Automobile(Integer _vehicleID, Float _miles, Integer _maintenanceMonth, Integer _maintenanceDay, Integer _maintenanceYear){
        vehicleID = _vehicleID;
        miles = _miles;
        maintenanceMonth = _maintenanceMonth;
        maintenanceDay = _maintenanceDay;
        maintenanceYear = _maintenanceYear;
    }
    
    public Integer getVehicleID( ) { return vehicleID; }
    public Float getMiles( ) { return miles; }
    public String getMaintenanceDate( ) {
        return maintenanceMonth + "/" + maintenanceDay + "/" + maintenanceYear;
    }



}
