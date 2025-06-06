import java.time.LocalDate;

public class MidPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private LocalDate expireDay;

    @Override
    public void setPriority() {
        priority = "Medium";
    }

    @Override
    public void setStatus() {
        status = "Accepted";
    }

    @Override
    public void setExpire() {
        expireDay = LocalDate.now().plusMonths(1);
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated completion date is " + expireDay);
    }
}
