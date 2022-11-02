package com.zt.tripmanager.service.api;

import com.zt.tripmanager.domain.User;
import com.zt.tripmanager.domain.dto.LoginDTO;
import org.springframework.validation.BindingResult;

public interface IUserService {
    String saveUser(User user, BindingResult result);
    String login(LoginDTO loginDTO, BindingResult result);
}
