package com.freeTirage.apitirage.ApiTirage.service;

import com.freeTirage.apitirage.ApiTirage.models.User;

import java.util.List;

public interface UserService {
    User creerUser(User user);
    User update(User user);
    User findById(Long id);
    void Delete(Long id);

    User GetFirstname(String firstname);
    List<User> getAll();

}
