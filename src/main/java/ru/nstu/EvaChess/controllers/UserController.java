package ru.nstu.EvaChess.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nstu.EvaChess.controllers.dto.GetTokenRequest;
import ru.nstu.EvaChess.controllers.dto.UserCreateRequest;
import ru.nstu.EvaChess.models.Token;
import ru.nstu.EvaChess.models.User;
import ru.nstu.EvaChess.repositories.UserRepository;
import ru.nstu.EvaChess.services.UserService;

@RestController
@RequestMapping("/user")
@Slf4j
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @PostMapping
    @CrossOrigin(origins = "http://localhost:9000")
    public ResponseEntity<User> createUser(@RequestBody UserCreateRequest userCreateRequest) {
        User user = userService.create(userCreateRequest);
        return new ResponseEntity<>(user, HttpStatus.CREATED); //TODO: Доделать плохой статус
    }

    @PostMapping("/javaconfig")
    public ResponseEntity<User> createUserConfig(@RequestBody UserCreateRequest userCreateRequest) {
        User user = userService.create(userCreateRequest);
        return new ResponseEntity<>(user, HttpStatus.CREATED); //TODO: Доделать плохой статус
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:9000")
    public User getUser(@PathVariable("id") long id){
        return userService.getByToken("yedLISdDfIoPXfStESVv");
    }

    @GetMapping("/javaconfig")
    public User getUserConfig(){ // @PathVariable("id") long id
        return userService.getByToken("yedLISdDfIoPXfStESVv");
    }

    @PostMapping("/token")
    @CrossOrigin(origins = "http://localhost:9000")
    public String getToken(@RequestBody GetTokenRequest getTokenRequest){
        return userService.createToken(getTokenRequest);
    }

    @PostMapping("/javaconfig/token")
    public String getTokenConfig(@RequestBody GetTokenRequest getTokenRequest){
        return userService.createToken(getTokenRequest);
    }

}
