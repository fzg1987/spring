import com.fzg.controller.MyController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10_IoC {
    private static final double score = 90;
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
        MyController controller = context.getBean("controller",MyController.class);
        String result = controller.doController(score);
        System.out.println(result);
    }
}
