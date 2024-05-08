package com.Quizz.Quizz.Controller;

import com.Quizz.Quizz.Model.People;
import com.Quizz.Quizz.Service.PeopleService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("home")
public class PeopleController {
    @Autowired
    PeopleService peopleService;
    @GetMapping("allusers")
    public List<People> allUsersController(People people){

        return peopleService.allusers(people);
    }

    @GetMapping("{id}")
    public People userByid(@PathVariable Integer id){
        return peopleService.userById(id);
    }
    @PostMapping("adduser")
    public ResponseEntity< String> addUser(@RequestBody People user){
        return new ResponseEntity<>( peopleService.adduser(user), HttpStatus.CREATED  );
    }

    @PutMapping("updateuser/{id}")
    public void updateuser(@PathVariable Integer id,@RequestBody People user){
         user.setId(id);
          peopleService.updateUser(user);
    }
    @DeleteMapping("deluser/{id}")
    public void delUser(@PathVariable Integer id){
        peopleService.delUserById(id);
    }
}
