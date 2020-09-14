
public class TrackRecorder {
    public static void main(String[] args) {
        Car c = new Car(2010, "MAZDA","MAZDASPEED3", 4, 199.9, 2.3, "Yes");
        
        System.out.println("Welcome to AZ Track, Your socre is:\n");
        System.out.println("Car Year: " + c.getYear());
        System.out.println("Car Make: " + c.getMake());       
        System.out.println("Car Model: " + c.getModel());
        System.out.println("Car Speed: " + c.getSpeed() + " MPH");
        System.out.println("Car Engine Cynlinder: " + c.getEngineCynlinder() + " Cylinders");
        System.out.println("Car Engine Size: " + c.getEngineSize());
        System.out.println("Car Turbo: " + c.getTurbo());
        
        System.out.println("\n" + "Hope You Do Better In Next One");
    }
}
