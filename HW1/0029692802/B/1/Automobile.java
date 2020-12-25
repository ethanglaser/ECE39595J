public class Automobile {

    private Integer vehicleID;
    private Float miles;
    private String maintenanceDate;

    public Automobile(Integer _vehicleID, Float _miles, Integer _maintenanceMonth, Integer _maintenanceDay, Integer _maintenanceYear){
        vehicleID = _vehicleID;
        miles = _miles;
        setMaintenanceDate(_maintenanceMonth, _maintenanceDay, _maintenanceYear);
    }

    public void setMaintenanceDate (Integer month, Integer day, Integer year) {
        maintenanceDate = month + "/" + day + "/"+ year;
    }
    public Integer getVehicleID( ) { return vehicleID; }
    public Float getMiles( ) { return miles; }
    public String getMaintenanceDate( ) { return maintenanceDate; }



}
