package xml;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String args[]) {
        String location = "classpath:/beans.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(location);

        MessageSender englishGreeter = context.getBean("englishGreeter", MessageSender.class);
        MessageSender koreanGreeter = context.getBean("koreanGreeter", MessageSender.class);

        koreanGreeter.sendMessage(new User("asd","asd"),"asd");
        englishGreeter.sendMessage(new User("asd","asd"),"asd");
    }
}
