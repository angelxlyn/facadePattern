package facadePattern;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        
        frontDesk.handleServiceRequest("valet", "ALV-2903");
        frontDesk.handleServiceRequest("housekeeping", 314);
        frontDesk.handleServiceRequest("cart", 2);
    }
}