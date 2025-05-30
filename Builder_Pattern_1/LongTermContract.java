public class LongTermContract implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public void buildContractID() {
        this.contractID = "LONG-" + System.currentTimeMillis();
    }

    @Override
    public void buildPropertyID() {
        this.propertyID = "PROP-202";
    }

    @Override
    public void buildTenantID() {
        this.tenantID = "TEN-202";
    }

    @Override
    public void buildRentAmount() {
        this.rentAmount = 900.0;
    }

    @Override
    public Contract signContract() {
        return this;
    }

    @Override
    public String toString() {
        return "LongTermContract{" +
                "contractID='" + contractID + '\'' +
                ", propertyID='" + propertyID + '\'' +
                ", tenantID='" + tenantID + '\'' +
                ", rentAmount=" + rentAmount +
                '}';
    }
}
