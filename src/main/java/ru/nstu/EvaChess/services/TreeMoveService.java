package ru.nstu.EvaChess.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nstu.EvaChess.models.TreeMove;
import ru.nstu.EvaChess.repositories.TreeMoveRepository;
import ru.nstu.EvaChess.repositories.UserRepository;

@Service(value = "treeMoveService")
@RequiredArgsConstructor
public class TreeMoveService {

    private final TreeMoveRepository treeMoveRepository;
    private final UserService userService;

    public TreeMove createTree(String token) {
        return treeMoveRepository.save(new TreeMove(userService.getByToken(token)));
    }
}
