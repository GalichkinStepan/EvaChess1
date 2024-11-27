package ru.nstu.EvaChess.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nstu.EvaChess.controllers.dto.CreateMoveRequest;
import ru.nstu.EvaChess.models.Move;
import ru.nstu.EvaChess.repositories.MoveRepository;

@Service(value = "moveService")
@RequiredArgsConstructor
public class MoveService {

    private final MoveRepository moveRepository;

    public Move createMove(CreateMoveRequest createMoveRequest){
        Move move = new Move();
        return null;
    }
}
