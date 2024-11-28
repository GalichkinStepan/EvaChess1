package ru.nstu.EvaChess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nstu.EvaChess.models.TreeMove;
import ru.nstu.EvaChess.models.User;

import java.util.List;

@Repository(value = "treeMoveRepository")
public interface TreeMoveRepository extends JpaRepository<TreeMove, Long> {
    @Query(value = "SELECT * FROM tree_moves WHERE tree_moves.user_id = ?1", nativeQuery = true)
    public List<TreeMove> getAllTree(long userId);
}
