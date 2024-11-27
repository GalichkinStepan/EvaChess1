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

import java.util.List;

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
    public List<TreeMove> getAllTrees(@RequestHeader("token") String token){
        return treeMoveService.getAllTree(token);
    }
}
