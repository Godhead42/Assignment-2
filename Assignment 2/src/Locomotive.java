import java.util.ArrayList;
public class Locomotive {
    private String id;
    private String speed;
    private String emptyCapacity;
    private String timeInWay;
    private String direction;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSpeed () {
            return speed;
        }

        public void setSpeed ( String speed) {
           this.speed = speed;
        }

        public String getEmptyCapacity () {
            return emptyCapacity;
        }

        public void setEmptyCapacity ( String emptyCapacity){
            this.emptyCapacity = emptyCapacity;
        }

    public String getTimeInWay() {
        return timeInWay;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setTimeInWay(String timeInWay) {
        this.timeInWay = timeInWay;
    }
    public Locomotive() {}

    Locomotive(String speed, String emptyCapacity,String id,String direction,String timeInWay) {
        this.timeInWay = timeInWay;
        this.speed = speed;
        this.emptyCapacity = emptyCapacity;
        this.direction = direction;
        this.id = id;
    }
}