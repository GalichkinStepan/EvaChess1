package ru.nstu.EvaChess.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nstu.EvaChess.controllers.dto.UserCreateRequest;
import ru.nstu.EvaChess.models.User;
import ru.nstu.EvaChess.repositories.UserRepository;

@Service(value = "userService")
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User create(UserCreateRequest userInfo){
        User newUser = new User(userInfo.login(), userInfo.password());

        try {
            userRepository.getUserByLogin(userInfo.login());
            userRepository.save(newUser);
            return newUser;
        }
        catch (Exception ex){
            return new User();
        }
    }

    public User get(long id){
        try{
            User user = userRepository.findById(id).get();
            return user;
        }
        catch (Exception ex)
        {
            return new User();
        }
    }
}
