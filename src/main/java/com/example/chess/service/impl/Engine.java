package com.example.chess.service.impl;

import com.example.chess.constants.EngineStatus;
import com.example.chess.model.Game;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Engine implements Runnable {

  private Game game;
  private EngineStatus engineStatus = EngineStatus.RUNNING;

  public void initEngine(Game game) {
    this.game = game;
  }

  @Override
  public void run() {

    while (engineStatus.equals(EngineStatus.RUNNING)) {
      try {
        System.out.println("Running");
        Thread.sleep(3000);

        System.out.println("Running");
        Thread.sleep(3000);

        // Take input from user

        this.engineStatus = EngineStatus.TERMINATED;
        System.out.println("Terminated");
      } catch (InterruptedException interruptedException) {
        interruptedException.printStackTrace();
      }
    }
  }
}
