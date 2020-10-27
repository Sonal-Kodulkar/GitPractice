package com.example.demo.userBeanAndUserService;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserInfoService {

    private static List<User> users = new ArrayList<>();
    private  static  int userCounter=4;
    static {
        users.add(new User(1,"Perennial",new Date()));
        users.add(new User(2,"system",new Date()));
        users.add(new User(3,"Pune",new Date()));
        users.add(new User(4,"Satara",new Date()));
    }

    public static List<User> findAll() {
        return users;
    }

    public User save(User user)
    {
        if(user.getId()==null)
        {
           user.setId(++userCounter);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id)
    {
        for(User user:users)
        {
            if(user.getId()==id)
            {
                return user;
            }
        }

        return null;
    }

    public User deleteId(int id)
    {
        Iterator<User> iterator = users.iterator();
          while (iterator.hasNext())
            {
                User users = iterator.next();
                if(users.getId()==id)
                {
                    iterator.remove();
                    return users;
                }

            }
          return null;
    }

    public void sample()
    {

    }
}

