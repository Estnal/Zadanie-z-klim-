public class Room {
    private double yardage;
    private double currentTemperature;
    private boolean airConditioner;
    private double minTemperature = 15;


    public Room(double yardage, double currentTemperature, boolean airConditioner) {
        this.yardage = yardage;
        this.currentTemperature = currentTemperature;
        this.airConditioner = airConditioner;
    }
    double getCurrentTemperature(){
        return currentTemperature;
    }
    double getYardage(){
        return yardage;
    }

    boolean isAirConditioner() {
        return airConditioner;
    }

    boolean isTemperatureLimit() {
        if (airConditioner) {
            return true;
        }

        if ((currentTemperature - 1) > minTemperature) {
            return true;


        } else {
            return false;
        }
    }
}














