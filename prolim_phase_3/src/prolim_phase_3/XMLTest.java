package prolim_phase_3;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
@SuppressWarnings("deprecation")
public class XMLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("./applicationContext.xml");
		BeanFactory B=new XmlBeanFactory(r);
		Address A= (Address) B.getBean("a1");
		Employee E= (Employee) B.getBean("e1");
		E.show();
//		
	}

}
