package com.example.chess.model;

import com.example.chess.constants.Color;
import com.example.chess.constants.PieceState;
import com.example.chess.constants.PieceType;
import lombok.Data;

@Data
public class Piece {
  private int ID;
  private PieceType pieceType;
  private Color color;
  private PieceState pieceState;
  private Position position;
}
