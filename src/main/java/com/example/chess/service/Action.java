package com.example.chess.service;

import com.example.chess.exceptions.InvalidMoveException;
import com.example.chess.model.Position;
import com.example.chess.model.State;

public interface Action {

  boolean move(State state, Position startPosition, Position endPosition)
      throws InvalidMoveException;
}
