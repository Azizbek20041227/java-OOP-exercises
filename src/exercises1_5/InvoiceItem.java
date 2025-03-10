package exercises1_5;

public class InvoiceItem {

    private String id;
    private String desc;
    private int qyt;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qyt, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qyt = qyt;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQyt() {
        return qyt;
    }

    public void setQyt(int qyt) {
        this.qyt = qyt;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice * qyt;
    }

    @Override
    public String toString() {
        return "InvoiceItem[id= " + id + ", desc= " + desc + ", qyt= " + qyt + ", unitPrice= " + unitPrice + ']';
    }
}
