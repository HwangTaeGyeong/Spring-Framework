package xml;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        context.getBean("englishGreeter", MessageSender.class).sendMessage(new User("aasd","asd"),"asdf");
        context.getBean("englishGreeter", MessageSender.class).sendMessage(new User("aasd","asd"),"asdf");
        context.getBean("koreanGreeter", MessageSender.class).sendMessage(new User("aasd","asd"),"asdf");
        context.getBean("koreanGreeter", MessageSender.class).sendMessage(new User("aasd","asd"),"asdf");

    }
}
