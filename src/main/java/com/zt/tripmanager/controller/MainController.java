package com.zt.tripmanager.controller;

import com.zt.tripmanager.domain.User;
import com.zt.tripmanager.domain.dto.LoginDTO;
import com.zt.tripmanager.service.api.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private IUserService iUserService;

    public MainController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/register/save")
    public String registration(
            @ModelAttribute("user") User user,
            BindingResult result,
            Model model){

        return iUserService.saveUser(user, result);
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login(
            @ModelAttribute("user") LoginDTO loginDTO,
            BindingResult result,
            Model model
    ){
        return iUserService.login(loginDTO, result);
    }

}
