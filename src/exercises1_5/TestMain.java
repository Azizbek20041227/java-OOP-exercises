package exercises1_5;

public class TestMain {
    public static void main(String[] args) {

        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);

        inv1.setQyt(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);  // toString();
        System.out.println("id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQyt());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());

        System.out.println("The total is: " + inv1.getTotal());
    }
}
