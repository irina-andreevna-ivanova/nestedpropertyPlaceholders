import com.irs.mybeans.Bean1;
import com.irs.mycomponents.Comp1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 11.06.2010
 * Time: 12:19:14
 * To change this template use File | Settings | File Templates.
 */
public class Runner5 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configs/spring-config_autowired.xml");
        Comp1 b1 = (Comp1) context.getBean("comp1");
        System.out.println("b1.getMyStr() = " + b1.getMyStr());
    }
}
