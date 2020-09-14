
public class Car {
    public static String name;
    public static int year;
    public static int engine_cylinder;
    public static String make;
    public static String model;
    public static double speed;
    public static double engine_size;
    public static String turbo;
    public static int ss;	//seconds for the timing
    public static int sss;	//milliseconds for the timing
    public static int ss_R;
    public static int sss_R;


    
    public Car(String n,int y,String m,String m1,int ec,double s, double es,String t,
    		int ss, int sss, int ss_R, int sss_R) {
        Car.name = n;
    	Car.year = y;
        Car.make = m;
        Car.model = m1;
        Car.engine_cylinder = ec;
        Car.speed = s;
        Car.engine_size = es;
        Car.turbo = t;
        Car.ss = ss;
        Car.sss = sss;
        Car.ss_R = ss_R;
        Car.sss_R = sss_R;
        
    }
  
    public String getName() {
    	return Car.name;
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
    
    public int getSs() {
        return Car.ss;
    }
    
    public int getSss() {
        return Car.sss;
    }
    
    public int getSs_R() {
        return Car.ss_R;
    }
    
    public int getSss_R() {
        return Car.sss_R;
    }

    
}