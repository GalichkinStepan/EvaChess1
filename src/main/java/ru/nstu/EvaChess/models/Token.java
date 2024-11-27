package ru.nstu.EvaChess.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tokens")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Token {

    public Token(User user, String token){
        this.user = user;
        this.tokenString = token;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "users")
    private User user;

    @Column(name = "token")
    private String tokenString;
}
