import com.fzg.aop.Cal;
import com.fzg.aop.MyInvocationHandler;
import com.fzg.aop.impl.CalImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test11_Cal {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
        Cal cal = context.getBean("calImpl",Cal.class);
        System.out.println(cal.add(10,3));
        System.out.println(cal.sub(10,3));
        System.out.println(cal.mul(10,3));
        System.out.println(cal.div(10,3));
    }
}
