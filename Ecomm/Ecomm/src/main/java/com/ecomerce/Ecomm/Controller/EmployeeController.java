package com.ecomerce.Ecomm.Controller;
//package com.ecomerce.Ecomm.Model.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ecomerce.Ecomm.Model.User;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public void display(){
        System.out.println(" Display method ");
    }
    //public void computer(Keyboard keybord)
    @GetMapping("/user")
    public User user(){
        User user=new User("1","santhiya","santhiya@xau.com");
//        user.setId("1");
//        user.setName("Santhiya");
//        user.setEmailId("santhiya@xau.com");
        return user;

    }

    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id,@PathVariable String id2){
        return "path varaible is "+id+ ":" +id2;
    }
    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name){
        return name;

    }

}
