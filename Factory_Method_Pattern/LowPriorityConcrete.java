import java.time.LocalDate;

public class LowPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private LocalDate expireDay;

    @Override
    public void setPriority() {
        priority = "Ignore";
    }

    @Override
    public void setStatus() {
        status = "Done";
    }

    @Override
    public void setExpire() {
        expireDay = LocalDate.now();
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }
}
