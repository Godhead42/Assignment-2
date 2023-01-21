import java.util.ArrayList;
public class Wagon {
    private String id;
    private String type;
    private String maxCapacity;

    public void setId(String id) { this.id = id; }

    public String getId() { return id; }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getMaxCapacity() { return maxCapacity; }

    public void setMaxCapacity(String maxCapacity) { this.maxCapacity = maxCapacity; }

    public Wagon(String id, String type, String maxCapacity) {
        this.id = id;
        this.type = type;
        this.maxCapacity = maxCapacity;
    }
    public Wagon(){

    }
}
