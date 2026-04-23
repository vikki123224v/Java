package com.example.jdbc;

import com.example.jdbc.entity.User;
import com.example.jdbc.entity.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcApplication implements CommandLineRunner {

    @Autowired
    private UserDao userDao;

    public static void main(String[] args) {
        SpringApplication.run(JdbcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       User user1 = new User("Jim", "jim@gmail.com", "Male", "New York");
        //User user2 = new User("Vikki", "vikki@gmail.com", "Male", "Bangalore");
        User user3=new User("vighneshwara","vigh@gmail.com","Male", "Udupi");

        boolean status = userDao.insertUser(user3);
        if (status) {
            System.out.println("User inserted successfully");
        } else {
            System.out.println("Failed to insert user");
        }

        user1 = new User("Jim Halpert", "jim@gmail.com", "Male", "California");

        status = userDao.updateUser(user1);
        if (status) {
            System.out.println("User updated successfully");
        } else {
            System.out.println("Failed to update user");
        }

        status = userDao.deletebyuserEmail("vikki@gmail.com");
        if (status) {
            System.out.println("User deleted successfully");
        } else {
            System.out.println("Failed to delete user");
        }
    }
}
