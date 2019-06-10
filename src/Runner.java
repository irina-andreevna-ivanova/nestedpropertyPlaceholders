import com.irs.mybeans.Bean1;
import com.irs.mybeans.Bean2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: Irina.Petrovskaya
 * Date: 10.06.2010
 * Time: 14:41:44
 * To change this template use File | Settings | File Templates.
 */
public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configs/spring-config.xml");
        Bean1 b1 = (Bean1) context.getBean("bean10");
        System.out.println("b1.getB1str1() = " + b1.getB1str1());
        Bean1 b2 = (Bean1) context.getBean("bean11");
        System.out.println("b2.getB1str1() = " + b2.getB1str1());
        System.out.println("b2.getB1str2() = " + b2.getB1str2());
        System.out.println("b1.sss = " + b1.sss);
        System.out.println("b2.sss = " + b2.sss);
        Bean2 bean2 = (Bean2) context.getBean("b2");
        System.out.println("bean2.getBean1().sss = " + bean2.getBean1().sss+ "; bean2.getDefString =" + bean2.getDefString());
    }
}
