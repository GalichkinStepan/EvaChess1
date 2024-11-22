package ru.nstu.EvaChess.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Move {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "number")
    private long number;

    @ManyToOne
    @JoinColumn(name = "tree_id")
    private TreeMove treeId;

    @Column(name = "position_after")
    private String positionAfter;

    @Column(name = "name_move")
    private String nameMove;

    @Column(name = "prevent_move")
    private Move preventMove;
}
