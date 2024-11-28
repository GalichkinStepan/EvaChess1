package ru.nstu.EvaChess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.nstu.EvaChess.models.User;

import java.time.LocalDateTime;

@Repository(value = "userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM users WHERE users.login = ?1 LIMIT 1", nativeQuery = true)
    public User getUserByLogin(String login);



}
