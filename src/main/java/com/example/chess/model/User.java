package com.example.chess.model;

import java.util.List;
import lombok.Data;

@Data
public class User {
  private int ID;
  private String name;
  private List<Game> game;
}
