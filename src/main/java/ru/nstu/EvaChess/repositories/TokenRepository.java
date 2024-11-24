package ru.nstu.EvaChess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nstu.EvaChess.models.Token;
import ru.nstu.EvaChess.models.User;

@Repository(value = "tokenRepository")
public interface TokenRepository extends JpaRepository<Token, Long> {
    @Query(value = "SELECT *" +
            "FROM tokens" +
            "WHERE tokens.token = ?1" +
            "LIMIT 1", nativeQuery = true)
    public Token getTokenByString(String token);
}
