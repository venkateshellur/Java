package com.UdemyLearnJava.LearnSpringFrameweork;

import com.UdemyLearnJava.LearnSpringFrameweork.Game.GameRunner;
import com.UdemyLearnJava.LearnSpringFrameweork.Game.MarioGame;
import com.UdemyLearnJava.LearnSpringFrameweork.Game.PacMan;
import com.UdemyLearnJava.LearnSpringFrameweork.Game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		var game = new PacMan();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		
		new GameRunner(new PacMan()).run();
	}

}
