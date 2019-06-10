import com.irs.mybeans.Bean2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 11.06.2010
 * Time: 12:19:14
 * To change this template use File | Settings | File Templates.
 */
public class Runner3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configs/spring-config2.xml");
        Bean2 b2 = (Bean2) context.getBean("bean2");
        System.out.println("b2.getBean1().sss = " + b2.getBean1().sss);
    }
}
