package ru.nstu.EvaChess.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.nstu.EvaChess.controllers.dto.CreateMoveRequest;
import ru.nstu.EvaChess.controllers.dto.GetTokenRequest;
import ru.nstu.EvaChess.controllers.dto.MoveResponse;
import ru.nstu.EvaChess.models.Move;
import ru.nstu.EvaChess.services.MoveService;

import java.util.List;

@RestController
@RequestMapping("/move")
@Slf4j
@RequiredArgsConstructor
public class MoveController {

    private final MoveService moveService;

    @PostMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public MoveResponse createMove(@RequestBody CreateMoveRequest createMoveRequest){
        return moveService.createMove(createMoveRequest);
    }

    @GetMapping("/tree/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public MoveResponse getNullMove(@PathVariable("id") long treeId){
        return moveService.getNullMove(treeId);
    }

    @GetMapping("/next/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<MoveResponse> getAllNextMove(@PathVariable("id") long moveId){
        return moveService.getAllNextMoves(moveId);
    }

    @GetMapping("/random/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public MoveResponse getRandomNextMove(@PathVariable("id") long moveId){
        return moveService.getRandomNextMove(moveId);
    }
}
