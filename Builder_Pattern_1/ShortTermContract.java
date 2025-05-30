public class ShortTermContract implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public void buildContractID() {
        this.contractID = "SHORT-" + System.currentTimeMillis();
    }

    @Override
    public void buildPropertyID() {
        this.propertyID = "PROP-303";
    }

    @Override
    public void buildTenantID() {
        this.tenantID = "TEN-303";
    }

    @Override
    public void buildRentAmount() {
        this.rentAmount = 700.0;
    }

    @Override
    public Contract signContract() {
        return this;
    }

    @Override
    public String toString() {
        return "ShortTermContract{" +
                "contractID='" + contractID + '\'' +
                ", propertyID='" + propertyID + '\'' +
                ", tenantID='" + tenantID + '\'' +
                ", rentAmount=" + rentAmount +
                '}';
    }
}
