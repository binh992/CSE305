import java.util.List;
import java.util.ArrayList;

class PropertyInfo {
    private String name;
    private String ownerName;
    private String location;

    public PropertyInfo(String name, String ownerName, String location) {
        this.name = name;
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }
}

class Property {
    private PropertyInfo info;
    private double rentAmount;

    public Property(PropertyInfo info, double rentAmount) {
        this.info = info;
        this.rentAmount = rentAmount;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public PropertyInfo getInfo() {
        return info;
    }
}

class ReportFormatter {
    public void printProperty(Property property) {
        PropertyInfo info = property.getInfo();
        System.out.println("Property: " + info.getName());
        System.out.println("Rent Amount: $" + property.getRentAmount());
        System.out.println("Owner: " + info.getOwnerName());
        System.out.println("Location: " + info.getLocation());
        if (property.getRentAmount() > 2000) {
            System.out.println("This is a premium property.");
        } else {
            System.out.println("This is a standard property.");
        }
        double yearlyRent = property.getRentAmount() * 12;
        System.out.println("Yearly Rent: $" + yearlyRent);
        System.out.println("--------------------");
    }
}

class FinancialReport {
    private String reportTitle;
    private List<Property> properties;
    private double totalRent;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void generateReport() {
        ReportFormatter formatter = new ReportFormatter();
        totalRent = 0;
        System.out.println("Financial Report: " + reportTitle);
        System.out.println("----------------------------");
        for (Property property : properties) {
            formatter.printProperty(property);
            totalRent += property.getRentAmount();
        }
        System.out.println("Total Rent Amount: $" + totalRent);
    }
}

public class ReportGenerator {
    public static void main(String[] args) {
        PropertyInfo info1 = new PropertyInfo("Apartment A", "John Doe", "City Center");
        PropertyInfo info2 = new PropertyInfo("House B", "Jane Smith", "Suburb");
        PropertyInfo info3 = new PropertyInfo("Condo C", "Bob Johnson", "Downtown");

        Property property1 = new Property(info1, 1500.0);
        Property property2 = new Property(info2, 2000.0);
        Property property3 = new Property(info3, 1800.0);

        List<Property> propertyList = List.of(property1, property2, property3);
        FinancialReport report = new FinancialReport("Monthly Rent Summary", propertyList);
        report.generateReport();
    }
}
