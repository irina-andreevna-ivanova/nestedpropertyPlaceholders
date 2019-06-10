import com.irs.mybeans.Bean1;
import com.irs.mybeans.Bean2;
import com.irs.mybeans.Bean3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 11.06.2010
 * Time: 12:19:14
 * To change this template use File | Settings | File Templates.
 */
public class Runner7 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configs/spring-config5.xml");
        Bean2 b2 = (Bean2) context.getBean("bean2");
        Bean3 b3 = (Bean3) context.getBean("bean3");
        System.out.println("b2.getBean1().getB1str1() = " + b2.getBean1().getB1str1());
        System.out.println("b3.getBean2().getBean1().getB1str1() = " + b3.getBean2().getBean1().getB1str1());
    }
}
