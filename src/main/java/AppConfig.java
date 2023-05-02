import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name = "t1")
    public Car getCarBean(){
        return new Car("BMW");
    }
    @Bean(name = "t2")
    public Pickup getPickupBean(){
        return new Pickup("Pickup1");
    }
    @Bean(name = "t3")
    public Bus getBusBean(){
        return new Bus("Bus1");
    }

    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Вася", getCarBean());
    }

    // Создаем второй бин Driver с именем driver2
    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Петя",getPickupBean());
    }

    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Driver",getBusBean());
    }
}
