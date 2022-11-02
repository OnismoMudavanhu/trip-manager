package com.zt.tripmanager.service.api;

import com.zt.tripmanager.domain.User;
import org.springframework.validation.BindingResult;

public interface IUserService {
    String saveUser(User user, BindingResult result);
}
