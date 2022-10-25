public abstract class Vehicle {

    // Attributes  
    private String brand;  
    private int kilometers;  

    // Constructor
    public Vehicle(String brand, int kilometers) {  
        this.brand = brand;  
        this.kilometers = kilometers;  
    }

    // getters and setters  
    public String getbrand() {  
        return this.brand;  
    }

    public void setbrand(String brand) {  
        this.brand = brand;  
    }

    public int getkilometers() {  
        return this.kilometers;  
    }

    public void setkilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    // methods
    public abstract String doStuff();


}
