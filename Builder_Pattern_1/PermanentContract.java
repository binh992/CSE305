public class PermanentContract implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public void buildContractID() {
        this.contractID = "PERM-" + System.currentTimeMillis();
    }

    @Override
    public void buildPropertyID() {
        this.propertyID = "PROP-101";
    }

    @Override
    public void buildTenantID() {
        this.tenantID = "TEN-101";
    }

    @Override
    public void buildRentAmount() {
        this.rentAmount = 1200.0;
    }

    @Override
    public Contract signContract() {
        return this;
    }

    @Override
    public String toString() {
        return "PermanentContract{" +
                "contractID='" + contractID + '\'' +
                ", propertyID='" + propertyID + '\'' +
                ", tenantID='" + tenantID + '\'' +
                ", rentAmount=" + rentAmount +
                '}';
    }
}
