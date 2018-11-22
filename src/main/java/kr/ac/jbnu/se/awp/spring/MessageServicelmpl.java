package kr.ac.jbnu.se.awp.spring;

import org.springframework.stereotype.Component;

@Component
public class MessageServicelmpl implements IMessageService{
	public String getMessage() {
		return "Hello World!";
	}

}
