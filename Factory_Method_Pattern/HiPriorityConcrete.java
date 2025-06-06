import java.time.LocalDate;

public class HiPriorityConcrete implements RequestProduct {
    private String priority;
    private String status;
    private LocalDate expireDay;

    @Override
    public void setPriority() {
        priority = "Emergency";
    }

    @Override
    public void setStatus() {
        status = "Accept";
    }

    @Override
    public void setExpire() {
        expireDay = LocalDate.now();
    }

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");
    }
}
