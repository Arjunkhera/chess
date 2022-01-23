package com.example.chess.service.impl;

import com.example.chess.constants.Color;
import com.example.chess.constants.PieceType;
import com.example.chess.exceptions.InvalidMoveException;
import com.example.chess.model.Piece;
import com.example.chess.model.Position;
import com.example.chess.service.MovePiece;
import org.springframework.stereotype.Service;

@Service
public class MovePieceImpl implements MovePiece {

  public boolean move(Piece startPiece, Piece endPiece, Position startPosition,
      Position endPosition) throws InvalidMoveException {

    if (startPiece.getPieceType().equals(PieceType.PAWN)) {
      return validatePawn(startPiece, endPiece, startPosition, endPosition);
    }

    throw new InvalidMoveException("Invalid state provided");
  }

  private boolean validatePawn(Piece piece, Piece endPiece, Position startPosition,
      Position endPosition) throws InvalidMoveException {

    if (piece.getColor().equals(Color.WHITE)) {
      if (startPosition.getY() == 2) {

        if(endPiece == null) {
          return endPosition.getY() == startPosition.getY() + 1;
        } else if(startPosition.getX() == 'a') {
          return true;
        } else if(startPosition.getX() == 'h') {

        } else {

        }

      } else {

      }
    } else if (piece.getColor().equals(Color.BLACK) && startPosition.getY() == 7) {

    }

    throw new InvalidMoveException("Invalid state provided");
  }
}
