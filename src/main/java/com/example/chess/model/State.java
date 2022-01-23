package com.example.chess.model;

import java.util.Map;
import lombok.Data;

@Data
public class State {
  private Map<Piece, Position> pieces;
  private Map<Position, Piece> positionPieceMap;
}
