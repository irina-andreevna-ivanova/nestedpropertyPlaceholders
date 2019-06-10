import com.irs.mybeans.Bean1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 11.06.2010
 * Time: 11:30:47
 * To change this template use File | Settings | File Templates.
 */
public class Runner2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configs/spring-config1.xml");
        Bean1 b1 = (Bean1) context.getBean("boo1");
        System.out.println("b1.sss = " + b1.sss);
        System.out.println("b1.getB1str1() = " + b1.getB1str1());
    }
}
