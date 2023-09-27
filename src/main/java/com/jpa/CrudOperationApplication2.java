package com.jpa;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.UserRepositry;
import com.jpa.entities.User; // Import User from the correct package

@SpringBootApplication
public class CrudOperationApplication2 {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CrudOperationApplication2.class, args);
        
        UserRepositry userRepository = context.getBean( UserRepositry.class); 
        
       /*  Create and save user1
       User user18 = new User();
        user18.setFirstName("Akas");
        user18.setLastName("Gadakh");
        user18.setAge(20);
        user18.setAddress("Gadakh Vasti");
        user18.setSalary(45000);*/
        
        //user1 = userRepository.save(user18);
        //System.out.println(user18);
        
        User user19 = new User();
        user19.setFirstName("Ravi");
        user19.setLastName("More");
        user19.setAge(21);
        user19.setAddress("Rahuri");
        user19.setSalary(78000);
        
        user19 = userRepository.save(user19);
        System.out.println(user19);
        
        // Create and save user2
      /*  User user2 = new User();
        user2.setFirstName("Krushna");
        user2.setLastName("Musmade");
        user2.setAge(22);
        user2.setAddress("Deolali Pravara");
        user2.setSalary(60000);
        
        user2 = userRepository.save(user2);
        System.out.println(user2);
        
        // Create and save user3
        User user3 = new User();
        user3.setFirstName("Nilesh");
        user3.setLastName("Kade");
        user3.setAge(22);
        user3.setAddress("Deolali Pravara");
        user3.setSalary(70000);
        
        user3 = userRepository.save(user3);
        System.out.println(user3);
        
        // Create and save user4
        User user4 = new User();
        user4.setFirstName("Vishal");
        user4.setLastName("Kadam");
        user4.setAge(22);
        user4.setAddress("Babulgav");
        user4.setSalary(80000);
        
        user4 = userRepository.save(user4);
        System.out.println(user4);*/
        
        //UPDATE
     //  Optional<User> optional = userRepository.findById(2);
       
      // User user = optional.get();
       //user.setFirstName("Rahul");
       //user.setLastName("Kadu");
      // user.setAge(25);
     //  user.setAddress("Pune");
     //  user.setSalary(8500000);
       
    //   System.out.println(user);
    //  User result = userRepository.save(user);
       
    //   System.out.println(result);
     
        
        
        //Delte
        userRepository.deleteById(12);
        System.out.println("Deleted");
        
    List<User> users=  userRepository.findByfirstName("Krushna");
     
     users.forEach(e->System.out.println(e));
        
      List<User>  user1= userRepository.getAllUser();
      
      
      for (User user2 : user1) {   
    	  
    	  
    	  System.out.println(user2);
    	  
    	 
		
	}
       
    }
}