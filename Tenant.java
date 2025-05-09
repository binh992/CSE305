import java.util.ArrayList;
import java.util.List;

public class Tenant {

    private User user;
    private List<RentalContract> listOfContracts;

    public Tenant(User user) {
        this.user = user;
        this.listOfContracts = new ArrayList<>();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<RentalContract> getListOfContracts() {
        return listOfContracts;
    }

    public void requestCreateRentalContract(RentalContract contract) {
        if (contract != null) {
            listOfContracts.add(contract);
            System.out.println("Rental contract requested successfully.");
        }
    }

    public void requestTerminateRentalContract(String contractId) {
        RentalContract toRemove = null;
        for (RentalContract contract : listOfContracts) {
            if (contract.getContractID().equals(contractId)) {
                toRemove = contract;
                break;
            }
        }
        if (toRemove != null) {
            listOfContracts.remove(toRemove);
            System.out.println("Rental contract terminated successfully.");
        } else {
            System.out.println("Contract ID not found.");
        }
    }
}
