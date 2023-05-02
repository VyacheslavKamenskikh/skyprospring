import org.springframework.beans.factory.annotation.Autowired;

public class Driver {

    private String name;

    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport= transport;
    }


    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }

    public void startTheCar() {
        System.out.println(name + " сел(а) в " + transport.getModel());
        transport.start();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "car=" + transport +
                '}';
    }
}