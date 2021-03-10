package vantoan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vantoan.model.User;
import vantoan.repository.UserRepo;

@Service
public class UserSevice implements IUserService{
    @Autowired
    private UserRepo userRepo;
    @Override
    public User save(User user) {
        return userRepo.save(user);
    }
}
