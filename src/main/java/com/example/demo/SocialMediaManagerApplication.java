package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages="com.example.demo")
public class SocialMediaManagerApplication {

    @Autowired
    private static UserRepository repository;
    
	public static void main(String[] args) {
		SpringApplication.run(SocialMediaManagerApplication.class, args);
                
//                User newUser = new User();
//                newUser.setUserName("fahadff");
//                newUser.setPassword("password");
//                newUser.setEmail("ffa110@psu.edu");
//                newUser.setIsAuth(true);
//                
//                repository.save(newUser);
//                
//                System.out.print("Added ====> " +repository.findByUserName("fahadff"));
                
	}
}
