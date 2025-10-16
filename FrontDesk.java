package facadePattern;

public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;
    
    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }
    
    public void handleServiceRequest(String serviceType, Object... params) {
        System.out.println("\nFrontDesk received request for: " + serviceType);
        
        switch (serviceType.toLowerCase()) {
            case "valet":
                valet.pickUpVehicle((String) params[0]);
                break;
            case "housekeeping":
                houseKeeping.cleanRoom((int) params[0]);
                break;
            case "cart":
                cart.requestCart((int) params[0]);
                break;
            default:
            System.out.println("Unknown service requested.");
        }
    }
}