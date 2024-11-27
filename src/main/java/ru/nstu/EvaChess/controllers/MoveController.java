package ru.nstu.EvaChess.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nstu.EvaChess.controllers.dto.CreateMoveRequest;
import ru.nstu.EvaChess.controllers.dto.GetTokenRequest;
import ru.nstu.EvaChess.models.Move;

@RestController
@RequestMapping("/move")
@Slf4j
@RequiredArgsConstructor
public class MoveController {
    @PostMapping
    public Move getToken(@RequestBody CreateMoveRequest createMoveRequest){

        return null;
    }
}
