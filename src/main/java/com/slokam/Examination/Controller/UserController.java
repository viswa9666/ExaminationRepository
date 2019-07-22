package com.slokam.Examination.Controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.slokam.Examination.Service.UserService;
import com.slokam.Examination.entity.UserPojo;

@RestController
@RequestMapping("user")
@CrossOrigin

public class UserController {
	@Autowired
	private UserService userservice;
	
	@PostMapping
	public ResponseEntity SaveuserData(@RequestBody UserPojo userpojo){
		userservice.SaveUserData(userpojo);
		
		return new ResponseEntity(HttpStatus.OK);
	}
	@GetMapping("/all")
	public String GetUserAll(){
		String s=userservice.someThing();
		//List<UserPojo>userlist=userservice.GetUserAll();
		//ResponseEntity<List<UserPojo>> re=new ResponseEntity<List<UserPojo>>(userlist, HttpStatus.OK);
		return s;
		
	}
	@PostMapping("/savefile")
	public void SaveFile(@RequestParam("upload")MultipartFile multipart){
		System.out.println(multipart.getOriginalFilename());
		System.out.println(multipart.getSize());
		System.out.println(multipart.getContentType());
		
			
		
		try {
			multipart.transferTo(new File("D:\\UploadFilesSpring\\fileupload\\"+multipart.getOriginalFilename()));
			//String content=new String (multipart.getBytes(),"UTF-8");
			//System.out.println("content====>"+content);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	@GetMapping("/image/{imagefile}")
	public FileSystemResource GetImage(@PathVariable String imagefile){ 
	FileSystemResource file=new FileSystemResource("C:\\Users\\Public\\Pictures\\Sample Pictures\\"+imagefile);
	return file;
		
		
	}
	@GetMapping("/imagenames")
	public String[] GetimageNames(){
		File file=new File("C:\\Users\\Public\\Pictures\\Sample Pictures");
		return file.list();
	}
	
}
