package com.example.chess.service.impl;

import com.example.chess.exceptions.InvalidMoveException;
import com.example.chess.model.Piece;
import com.example.chess.model.Position;
import com.example.chess.model.State;
import com.example.chess.service.Action;
import com.example.chess.service.MovePiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionImpl implements Action {

  @Autowired
  MovePiece movePiece;

  @Override
  public boolean move(State state, Position startPosition, Position endPosition)
      throws InvalidMoveException {

    Piece startPiece = state.getPositionPieceMap().getOrDefault(startPosition, null);
    Piece endPiece = state.getPositionPieceMap().getOrDefault(endPosition, null);

    if(startPiece == null) {
      throw new InvalidMoveException("No piece present at start position");
    }

    return movePiece.move(startPiece, endPiece, startPosition, endPosition);
  }
}
