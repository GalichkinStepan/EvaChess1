package ru.nstu.EvaChess.controllers.dto;

import lombok.Builder;
import lombok.extern.jackson.Jacksonized;

@Builder
@Jacksonized
public record MoveResponse(long id, long number, long treeId, String positionAfter, String nameMove, Boolean colorWhite, long preventMove) {
}
