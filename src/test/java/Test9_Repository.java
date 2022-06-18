import com.fzg.entity.Repository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test9_Repository {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-annotation.xml");
        Repository repository = context.getBean("myRepo",Repository.class);
        System.out.println(repository);
//        String[] names = context.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
    }
}
