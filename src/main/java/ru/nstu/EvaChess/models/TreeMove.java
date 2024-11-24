package ru.nstu.EvaChess.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tree_moves")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TreeMove {

    public TreeMove(User user){
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "users")
    private User user;
}
