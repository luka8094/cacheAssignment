package luka.cache.controllers;

import luka.cache.model.Cache;
import luka.cache.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CacheController {

    Cache userCache = new Cache();

    @GetMapping("/get-user-data")
    @ResponseBody
    public String renderUserDate(@RequestParam("id") int id){

        User aNewUser = new User(id);
        String userId = "" + aNewUser.getId();

        try {

            if(userCache.has(userId) == false) {

                userCache.set(userId, aNewUser.getSlowData());

            }else if(userCache.has(userId) == true) {

                return userCache.get(userId);

            }

        }catch (InterruptedException ex){

            System.out.println("Process was interrupted");

        }

        return "This is the cache assignment";
    }
}
