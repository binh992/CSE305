public class Client {
    public void requestCreateRentalContract(Contract builder) {
        builder.buildContractID();
        builder.buildPropertyID();
        builder.buildTenantID();
        builder.buildRentAmount();
        Contract contract = builder.signContract();
        System.out.println(contract);
    }

    public static void main(String[] args) {
        Client client = new Client();

        System.out.println("=== Permanent Contract ===");
        client.requestCreateRentalContract(new PermanentContract());

        System.out.println("\n=== Long Term Contract ===");
        client.requestCreateRentalContract(new LongTermContract());

        System.out.println("\n=== Short Term Contract ===");
        client.requestCreateRentalContract(new ShortTermContract());
    }
}
