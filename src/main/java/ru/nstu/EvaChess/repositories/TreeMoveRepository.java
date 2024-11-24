package ru.nstu.EvaChess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nstu.EvaChess.models.TreeMove;
import ru.nstu.EvaChess.models.User;

@Repository(value = "treeMoveRepository")
public interface TreeMoveRepository extends JpaRepository<TreeMove, Long> {
}
