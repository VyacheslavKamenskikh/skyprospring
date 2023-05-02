import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Car car1 = context.getBean("t1", Car.class);
        car1.start();
        Bus bus1 = context.getBean("t3", Bus.class);
        bus1.start();
        Pickup pickup1 = context.getBean("t2", Pickup.class);
        pickup1.start();
        Driver driver1 = context.getBean("driver1", Driver.class);
        driver1.startTheCar();
        Driver driver2 = context.getBean("driver2", Driver.class);
        driver2.startTheCar();
        Driver driver3 = context.getBean("driver3", Driver.class);
        driver3.startTheCar();
    }
}