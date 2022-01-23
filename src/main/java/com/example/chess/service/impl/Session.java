package com.example.chess.service.impl;

import com.example.chess.model.Game;
import com.example.chess.model.State;
import com.example.chess.model.User;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class Session {

  private static final ExecutorService engineExecutor = Executors.newSingleThreadExecutor();

  @Autowired
  private ApplicationContext applicationContext;

  @EventListener(ApplicationReadyEvent.class)
  public void startEngine() {
    Game game = new Game();

    Engine engine = applicationContext.getBean(Engine.class);
    engine.initEngine(game);

    engineExecutor.submit(engine);
  }

  private Game initializeGame() {
    Game game = new Game();

    User whitePlayer = new User();
    whitePlayer.setName("WhitePlayer");
    game.setWhitePlayer(whitePlayer);

    User blackPlayer = new User();
    blackPlayer.setName("BlackPlayer");
    game.setBlackPlayer(blackPlayer);

    game.getMoves().push(initializeState());

    return game;
  }

  private State initializeState() {
    State state = new State();
    return state;
  }
}
