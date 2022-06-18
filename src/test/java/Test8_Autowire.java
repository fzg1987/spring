import com.fzg.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test8_Autowire {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-autowire.xml");
        Person person = context.getBean("person",Person.class);
        System.out.println(person);
    }
}
