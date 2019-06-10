import com.irs.mybeans.Bean1;
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
public class Runner4 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configs/spring-config3.xml");
        Bean1 b1 = (Bean1) context.getBean("bean1");
        System.out.println("b1.sss = " + b1.sss + "; b1.b1str1 = "+ b1.getB1str1());
    }
}
