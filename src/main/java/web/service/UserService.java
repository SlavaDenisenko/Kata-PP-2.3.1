package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void removeUserById(Long id);
    List<User> listUsers();
    User findById(Long id);
    void updateUser(User user);
}
