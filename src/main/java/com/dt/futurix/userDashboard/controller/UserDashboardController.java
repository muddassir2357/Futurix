package com.dt.futurix.userDashboard.controller;

import com.dt.futurix.userDashboard.dao.UserDataRepositoryService;
import com.dt.futurix.userDashboard.model.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/futurix")
public class UserDashboardController {

    @Autowired
    UserDataRepositoryService userDataRepositoryService;

    @GetMapping(path = "/test")
    public String test() {
        return "Hello";
    }

    @GetMapping(path = "/getuserdata/{userId}")
    public UserData getUserData(@PathVariable int userId) {
        UserData userData = new UserData().setUserId(userId);
        userData.setUserAnalyticsData(userDataRepositoryService.getUserAnalyticsData(userId))
                .setUserPersonalData(userDataRepositoryService.getUserPersonalData(userId));
        return userData;
    }

//    @GetMapping(path = "/getUserData")
//    public UserPersonalData getUserData(@RequestParam String userId){
//
//    }
//
//    @GetMapping(path = "/getUserAnalyticsData")
//    public UserPersonalData getUserData(@RequestParam String userId){
//
//    }
}
