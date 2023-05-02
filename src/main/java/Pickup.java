import java.util.Objects;

public class Pickup extends Transport {
    private String model;
    public Pickup(String model){
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pickup pickup = (Pickup) o;
        return Objects.equals(model, pickup.model);
    }

    // Добавляем метод hashCode для корректного сравнения объектов
    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}