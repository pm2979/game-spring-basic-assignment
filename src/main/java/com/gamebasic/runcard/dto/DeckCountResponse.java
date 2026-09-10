package com.gamebasic.runcard.dto;

import lombok.Getter;

@Getter
public class DeckCountResponse {
    private final Long gameId;
    private final Long deckSize;

    public DeckCountResponse(Long gameId, Long deckSize) {
        this.gameId = gameId;
        this.deckSize = deckSize;
    }
}
