import java.util.Objects;

public class Car extends Transport {
    private String model;
    public Car(String model){
        this.model = model;
    }
    @Override
    public void start(){
        System.out.println(this.model+" готов к работе");
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
