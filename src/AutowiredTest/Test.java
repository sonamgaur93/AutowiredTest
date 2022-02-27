package AutowiredTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		  Resource r=new ClassPathResource("AutowiredTest/applicationContext.xml");
		  BeanFactory be=new XmlBeanFactory(r);
		  A ab=(A)be.getBean("a");
		  ab.display();
		}  

}
