// Service.java
public class Service {
    private String serviceName;
    private double price;
    private int duration; // Duration in minutes

    // Constructor
    public Service(String serviceName, double price, int duration) {
        this.serviceName = serviceName;
        this.price = price;
        this.duration = duration;
    }

    // Getters and Setters
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // toString method for easy display
    @Override
    public String toString() {
        return serviceName + " - $" + price + " - " + duration + " min";
    }
}