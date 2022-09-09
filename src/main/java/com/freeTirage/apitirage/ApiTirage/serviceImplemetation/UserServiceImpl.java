package com.freeTirage.apitirage.ApiTirage.serviceImplemetation;

import com.freeTirage.apitirage.ApiTirage.models.User;
import com.freeTirage.apitirage.ApiTirage.repository.UserRepository;
import com.freeTirage.apitirage.ApiTirage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User creerUser(User user) {
        // TODO Auto-generated method stub
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
