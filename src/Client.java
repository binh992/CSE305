
import java.util.Random;

public class Client {
    private Random random = new Random();

    public Contract requestCreateRentalContract(Contract builder) {
        builder.buildContractID("" + random.nextInt(10));
        builder.buildPropertyID("" + random.nextInt(10));
        builder.buildRentAmount(random.nextDouble(10));
        builder.buildTenantID("" + random.nextInt(10));
        return builder.signContract();
    }
}
