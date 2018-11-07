package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeansApp {
    public static void main(String[] args) {
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans/beans.xml"));
        Person person = (Person)beanFactory.getBean("person");
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans/beans.xml");
//        Person person = (Person)ctx.getBean("person");
        System.out.println(person);
    }

}
