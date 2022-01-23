package com.example.chess.model;

import com.example.chess.constants.Color;
import java.util.ArrayDeque;
import java.util.Deque;
import lombok.Data;

@Data
public class Game {
  private User whitePlayer;
  private User blackPlayer;
  private Color turn;
  private Deque<State> moves;

  public Game() {
    this.turn = Color.WHITE;
    this.moves = new ArrayDeque<>();
  }
}
