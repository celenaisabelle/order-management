import java.util.ArrayList;

public class WaxingSalonOrderSystem {
    public static void main(String[] args) {
        // Create ArrayLists for each service category
        ArrayList<FacialWaxing> facialWaxingServices = new ArrayList<>();
        ArrayList<BodyWaxing> bodyWaxingServices = new ArrayList<>();
        ArrayList<AddOnService> addOnServices = new ArrayList<>();

        // Add services to the lists
        facialWaxingServices.add(new FacialWaxing("Eyebrow Shaping", 15.00, 15));
        facialWaxingServices.add(new FacialWaxing("Upper Lip Wax", 10.00, 10));

        bodyWaxingServices.add(new BodyWaxing("Full Leg Wax", 50.00, 60));
        bodyWaxingServices.add(new BodyWaxing("Underarm Wax", 20.00, 20));

        addOnServices.add(new AddOnService("Soothing Gel Application", 5.00, 5));
        addOnServices.add(new AddOnService("Exfoliating Scrub", 7.00, 10));

        // Example of displaying services
        /* System.out.println("Facial Waxing Services:");
        for (FacialWaxing service : facialWaxingServices) {
            System.out.println(service);
        }

        System.out.println("\nBody Waxing Services:");
        for (BodyWaxing service : bodyWaxingServices) {
            System.out.println(service);
        }

        System.out.println("\nAdd-On Services:");
        for (AddOnService service : addOnServices) {
            System.out.println(service);
        } */
    }
}
