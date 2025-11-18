package id27608.q3;

public class Taxpayer extends Entity {
    private String tin;
    private String taxpayerName;
    private String address;

    public Taxpayer(int id, String tin, String taxpayerName, String address) {
        super(id);
        if (tin == null || tin.isEmpty()) {
            throw new IllegalArgumentException("TIN cannot be empty");
        }
        if (taxpayerName == null || taxpayerName.isEmpty()) {
            throw new IllegalArgumentException("Taxpayer name cannot be empty");
        }
        this.tin = tin;
        this.taxpayerName = taxpayerName;
        this.address = address;
    }

    public String getTin() {
        return tin;
    }

    public String getTaxpayerName() {
        return taxpayerName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Taxpayer{" + "id=" + id + ", tin=" + tin + ", name=" + taxpayerName 
               + ", address=" + address + '}';
    }
}
