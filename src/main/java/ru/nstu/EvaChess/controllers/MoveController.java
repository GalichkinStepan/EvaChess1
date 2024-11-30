package ru.nstu.EvaChess.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.nstu.EvaChess.controllers.dto.CreateMoveRequest;
import ru.nstu.EvaChess.controllers.dto.GetTokenRequest;
import ru.nstu.EvaChess.models.Move;
import ru.nstu.EvaChess.services.MoveService;

@RestController
@RequestMapping("/move")
@Slf4j
@RequiredArgsConstructor
public class MoveController {

    private final MoveService moveService;

    @PostMapping
    @CrossOrigin(origins = "http://localhost:9000")
    public Move createMove(@RequestBody CreateMoveRequest createMoveRequest){
        return moveService.createMove(createMoveRequest);
    }

    @GetMapping("/tree/{id}")
    @CrossOrigin(origins = "http://localhost:9000")
    public Move getNullMove(@PathVariable("id") long treeId){
        return moveService.getNullMove(treeId);
    }

    //TODO: Получить все ходы из данного
    //TODO: Получить случайный ход из данного
    //TODO: Не отправлять объекты, только ссылки
}
