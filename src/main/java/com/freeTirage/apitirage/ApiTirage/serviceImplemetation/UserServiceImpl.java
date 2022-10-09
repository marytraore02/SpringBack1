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
  public User update(User user) {
    return userRepository.save(user);
  }

  @Override
  public User findById(Long id) {
    return userRepository.findById(id).get();
  }

  @Override
  public void Delete(Long id) {
      userRepository.deleteById(id);
  }


  @Override
  public User GetFirstname(String firstname) {
    return userRepository.findByFirstname(firstname);
  }
  @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
