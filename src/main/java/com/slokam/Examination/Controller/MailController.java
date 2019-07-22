package com.slokam.Examination.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Examination.entity.UserPojo;
@RestController
@RequestMapping(name="mail")
@CrossOrigin
public class MailController {
	
//	@Autowired
	//private MailSender mail;
	
	
	
/*	@PostMapping
	public void saveExamData(@RequestBody UserPojo user){
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo("bviswa143@gmail.com");
		message.setSubject("haiii");
		message.setText("haiii viswa");
		message.setFrom("viswa9666@gmail.com");
		mail.send(message);
	}
*/

}
