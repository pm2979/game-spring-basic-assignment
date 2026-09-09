package com.gamebasic.game.dto;

import com.gamebasic.game.entity.GamePhase;
import com.gamebasic.game.entity.GameStatus;
import lombok.Getter;

import java.util.List;

@Getter
public class GameSummaryResponse {
    Long id;
    String playerName;
    int currentFloor;
    int currentHp;
    GamePhase phase;
    GameStatus status;

    public GameSummaryResponse(
            Long id,
            String playerName,
            int currentHp,
            int currentFloor,
            GamePhase phase,
            GameStatus status
    ) {
        this.id = id;
        this.playerName = playerName;
        this.currentHp = currentHp;
        this.currentFloor = currentFloor;
        this.phase = phase;
        this.status = status;
    }
}
