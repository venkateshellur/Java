package com.UdemyLearnJava.LearnSpringFrameweork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.UdemyLearnJava.LearnSpringFrameweork.Game.GameRunner;
import com.UdemyLearnJava.LearnSpringFrameweork.Game.GamingConsole;
import com.UdemyLearnJava.LearnSpringFrameweork.Game.MarioGame;
import com.UdemyLearnJava.LearnSpringFrameweork.Game.PacMan;
import com.UdemyLearnJava.LearnSpringFrameweork.Game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class))
		{
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
	}

}
