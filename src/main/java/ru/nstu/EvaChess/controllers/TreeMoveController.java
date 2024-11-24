package ru.nstu.EvaChess.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nstu.EvaChess.controllers.dto.UserCreateRequest;
import ru.nstu.EvaChess.models.TreeMove;
import ru.nstu.EvaChess.models.User;
import ru.nstu.EvaChess.repositories.TreeMoveRepository;
import ru.nstu.EvaChess.services.TreeMoveService;

@RestController
@RequestMapping("/tree")
@Slf4j
@RequiredArgsConstructor
public class TreeMoveController {

    private final TreeMoveService treeMoveService;

    @PostMapping
    public ResponseEntity<TreeMove> createTree(@RequestHeader("token") String token) {
        return new ResponseEntity<>(treeMoveService.createTree(token), HttpStatus.CREATED);
    }

    @GetMapping
    public User getAllTree(@RequestHeader("token") String token){
        return null; //TODO: Доделать возращение всех веток
    }
}
