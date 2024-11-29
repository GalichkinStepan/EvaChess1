package ru.nstu.EvaChess.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nstu.EvaChess.controllers.dto.CreateMoveRequest;
import ru.nstu.EvaChess.models.Move;
import ru.nstu.EvaChess.models.TreeMove;
import ru.nstu.EvaChess.repositories.MoveRepository;
import ru.nstu.EvaChess.repositories.TreeMoveRepository;

@Service(value = "moveService")
@RequiredArgsConstructor
public class MoveService {

    private final MoveRepository moveRepository;
    private final TreeMoveRepository treeMoveRepository;

    public Move createMove(CreateMoveRequest createMoveRequest){
        Move move = new Move(
                treeMoveRepository.findById(createMoveRequest.treeId()).get(),
                createMoveRequest.positionAfter(),
                moveRepository.findById(createMoveRequest.preventMoveId()).get(),
                createMoveRequest.colorWhite()
        );
        return move;
    }

    public Move createNullMove(TreeMove tree){
        return moveRepository.save(new Move(tree ,"baseFEN", null, 0));
    }

    public Move getNullMove(long idTree){
        return moveRepository.getNullMove(idTree);
    }
}
