package com.tracker.thunder.controller;


import com.tracker.thunder.controller.base.BaseController;
import com.tracker.thunder.dto.user.AppUser;
import com.tracker.thunder.entity.user.DbAppUser;
import com.tracker.thunder.service.user.UserService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(BaseController.USER)
@AllArgsConstructor
public class UserController extends BaseController {


    private final  UserService userService;


    @PostMapping(value = "/save-user")
    @ResponseBody
    public DbAppUser getUser(@RequestBody AppUser appUser) {

        return userService.createUser(appUser);
    }
}
