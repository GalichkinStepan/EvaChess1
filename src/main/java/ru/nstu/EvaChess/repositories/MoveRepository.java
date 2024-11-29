package ru.nstu.EvaChess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nstu.EvaChess.models.Move;
import ru.nstu.EvaChess.models.Token;
import ru.nstu.EvaChess.models.User;

@Repository(value = "moveRepository")
public interface MoveRepository extends JpaRepository<Move, Long> {

    @Query(value = "SELECT * FROM moves WHERE moves.tree_id = ?1 AND moves.number = 0 LIMIT 1", nativeQuery = true)
    public Move getNullMove(long treeId);

}
