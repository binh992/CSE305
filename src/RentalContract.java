public class RentalContract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    public void createContract(String contractID, String propertyID, String tenantID, double rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    public boolean terminateContract() {
        System.out.println("Contract " + contractID + " terminated.");
        return true;
    }

    public String getContractID() {
        return contractID;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public String getTenantID() {
        return tenantID;
    }

    public double getRentAmount() {
        return rentAmount;
    }

}
