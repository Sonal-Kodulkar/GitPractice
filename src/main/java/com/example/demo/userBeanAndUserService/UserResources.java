package com.example.demo.userBeanAndUserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;



import java.net.URI;
import java.util.List;

@RestController
public class UserResources {

    @Autowired
    private UserInfoService service;


    @GetMapping(path = "/users")
    public List<User> retrieveAll()
    {
        return service.findAll();
    }

//    @GetMapping(path="/users/{id}")
//    public void retrieveOne(@PathVariable int id)
//    {
//        User user = service.findOne(id);
//        if(user==null)
//
//            throw new userNotFoundException("id:"+id);                  // If enter id is not present then it will throw exception
//        EntityModel<User> userEntityModel= new EntityModel<>(user);
//        ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAll());
//        userEntityModel.add(linkTo.withRel("add-users"));
//        return ;
//    }

    @PostMapping(path = "/users")
    public void createUser(@RequestBody User user)
    {
        User savedUSer = service.save(user);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{/id}")
                .buildAndExpand(savedUSer.getId()).toUri();
        ResponseEntity.created(location).build();

    }

    @DeleteMapping(path="/users/delete/{id}")
    public User delete(@PathVariable int id)
    {
        User users = service.deleteId(id);
        if(users==null)

            throw new userNotFoundException("id:"+id);
        return  users;

    }

    @GetMapping(path="/user/all")
    public @ResponseBody List<User> listAllUser()
    {
        return service.findAll();
    }


}
