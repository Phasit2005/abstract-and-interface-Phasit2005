public class TestDelivery {
    public static void main(String[] args) {
        double weight = 10; // กิโลกรัม

        Deliverable express = new ExpressDelivery();
        Deliverable economy = new EconomyDelivery();

        System.out.println("บริการ : "+((ExpressDelivery) express).getServiceType());
        System.out.println("คำสั่ง (น้ำหนัก " + weight + " กก.) : "+ express.calculateShippingCost(weight) + " บาท \n");

        System.out.println("บริการ : "+((EconomyDelivery) economy).getServiceType());
        System.out.println("คำสั่ง (น้ำหนัก " + weight + " กก.) : "+ economy.calculateShippingCost(weight) + " บาท \n");
    }
}
