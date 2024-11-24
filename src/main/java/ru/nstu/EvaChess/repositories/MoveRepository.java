package ru.nstu.EvaChess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nstu.EvaChess.models.Move;
import ru.nstu.EvaChess.models.User;

@Repository(value = "moveRepository")
public interface MoveRepository extends JpaRepository<Move, Long> {
}
