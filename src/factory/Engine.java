package factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class Engine {
    private int horsePower;
    private int capacity;
    private String type;

    public Engine(int horsePower,int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }
}
