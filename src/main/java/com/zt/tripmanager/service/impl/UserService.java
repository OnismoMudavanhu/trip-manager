package com.zt.tripmanager.service.impl;

import com.zt.tripmanager.domain.User;
import com.zt.tripmanager.repository.UserRepo;
import com.zt.tripmanager.service.api.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.Optional;

@Service
public class UserService implements IUserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @Override
    public String saveUser(User user, BindingResult result) {
        Optional<User> userByEmail = userRepo.findUserByEmail(user.getEmail());

        if (userByEmail.isPresent()){
            return "redirect:/register?failed";
        }else{

            User newUser = User.builder()
                    .email(user.getEmail())
                    .password(user.getEmail())
                    .role(user.getRole())
                    .username(user.getUsername())
                    .build();
            userRepo.save(newUser);
        return "redirect:/register?success";
        }
    }
}
