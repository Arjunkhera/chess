package com.example.chess.service;

import com.example.chess.exceptions.InvalidMoveException;
import com.example.chess.model.Piece;
import com.example.chess.model.Position;

public interface MovePiece {

  boolean move(Piece startPiece, Piece endPiece, Position startPosition, Position endPosition)
      throws InvalidMoveException;
}
