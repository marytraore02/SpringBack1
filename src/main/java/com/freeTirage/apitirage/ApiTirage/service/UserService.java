package com.freeTirage.apitirage.ApiTirage.service;

import com.freeTirage.apitirage.ApiTirage.models.User;

import java.util.List;

public interface UserService {
    User creerUser(User user);

    List<User> getAll();
}
