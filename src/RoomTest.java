public class RoomTest {
    public static void main(String[] args) {
        Room room1 = new Room(20, 30, true);
        System.out.println("Pokój ma: " + room1.getYardage() + " m2");
        System.out.println("Pokój ma temperaturę: " + room1.getCurrentTemperature() + " C" );
        System.out.println("Czy pokój posiada klimatyzator?: " + room1.isAirConditioner());
    }
}


