
public class TrackRecorder {
    public static void main(String[] args) {
        Car c = new Car("Alex_Zhou",2010, "MAZDA","MAZDASPEED3", 4, 199.9, 2.3, "Yes", 10, 99,0,55);
        
        System.out.println("Welcome to AZ Track, Your socre is:\n");
        System.out.println("Racer Name: " + c.getName());
        System.out.println("Car Year: " + c.getYear());
        System.out.println("Car Make: " + c.getMake());       
        System.out.println("Car Model: " + c.getModel());
        System.out.println("Car Speed: " + c.getSpeed() + " MPH");
        System.out.println("Car Engine Cynlinder: " + c.getEngineCynlinder() + " Cylinders");
        System.out.println("Car Engine Size: " + c.getEngineSize());
        System.out.println("Car Turbo: " + c.getTurbo());
        System.out.println("Time: " + c.getSs() + "." + c.getSss());
        System.out.println("React Time: " + c.getSs_R() + "." + c.getSss_R());

        
        System.out.println("\n" + "Hope You Do Better In Next One");
    }
}
