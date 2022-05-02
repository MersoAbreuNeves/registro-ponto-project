package com.project.ibm.config;

import java.util.Arrays;
import java.util.List;

import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.project.ibm.entities.Role;
import com.project.ibm.entities.User;
import com.project.ibm.repositories.RoleRepository;
import com.project.ibm.repositories.UserRepository;

public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {
	
	  @Autowired
	    UserRepository userRepository;

	    @Autowired
	    RoleRepository roleRepository;

	    @Autowired
	    PasswordEncoder passwordEncoder;

	    @Override
	    public void onApplicationEvent(ContextRefreshedEvent arg0) {

	        List<User> users = userRepository.findAll();

	        if (users.isEmpty()) {
	            createUser("Admin", "admin", passwordEncoder.encode("123456"), com.project.ibm.enums.Const.ROLE_ADMIN);
	            createUser("Cliente", "cliente", passwordEncoder.encode("123456"), com.project.ibm.enums.Const.ROLE_CLIENT);
	        }

	    }

	    public void createUser(String name, String email, String password, String roleName) {

	        Role role = new Role(roleName);

	        this.roleRepository.save(role);
	        User user = new User(name, email, password, Arrays.asList(role));
	        userRepository.save(user);
	    }

}
