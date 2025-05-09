import java.util.ArrayList;

public class PropertyOwner {
    private User user;
    private ArrayList<Property> properties;

    public PropertyOwner(User user) {
        this.user = user;
        this.properties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        properties.add(property);
    }

    public void removeProperty(Property property) {
        properties.remove(property);
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public User getUser() {
        return user;
    }
}
