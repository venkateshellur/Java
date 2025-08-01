package com.UdemyLearnJava.LearnSpringFrameweork.Game;

public class GameRunner {
	
	/*
	 * MarioGame game; public GameRunner(MarioGame game){ this.game = game; }
	 */	
	
	GamingConsole game;
	public GameRunner(GamingConsole game) {this.game = game;}

	public void run() {
		System.out.println("Runnign Game:" + game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}