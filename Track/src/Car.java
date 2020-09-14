
public class Car {
    public static int year;
    public static int engine_cylinder;
    public static String make;
    public static String model;
    public static double speed;
    public static double engine_size;
    public static String turbo;

    
    public Car(int y,String m,String m1,int ec,double s, double es,String t) {
        Car.year = y;
        Car.make = m;
        Car.model = m1;
        Car.engine_cylinder = ec;
        Car.speed = s;
        Car.engine_size = es;
        Car.turbo = t;
        
    }
  
    public double getSpeed() {
        return Car.speed;
    }
    
    public String getMake() {
        return Car.make;
    }
    
    public String getModel() {
        return Car.model;
    }

    public int getYear() {
        return Car.year;
    }
    
    public int getEngineCynlinder() {
        return Car.engine_cylinder;
    }
    
    public double getEngineSize() {
        return Car.engine_size;
    }
    
    public String getTurbo() {
        return Car.turbo;
       
    }

    
}