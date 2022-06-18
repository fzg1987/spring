import com.fzg.entity.Car;
import com.fzg.ioc.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test0_Resource {
    public static void main(String[] args) {
        ApplicationContext context = new MyClassPathXmlApplicationContext("spring-resource.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(car);
    }
}
