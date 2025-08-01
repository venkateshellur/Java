package com.UdemyLearnJava.LearnSpringFrameweork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.UdemyLearnJava.LearnSpringFrameweork.Game.GameRunner;
import com.UdemyLearnJava.LearnSpringFrameweork.Game.GamingConsole;
import com.UdemyLearnJava.LearnSpringFrameweork.Game.PacMan;

@Configuration
public class GamingConfiguration {

		@Bean
		public GamingConsole game() {
			return new PacMan();
		}

		@Bean
		public GameRunner gameRunner(GamingConsole game) {
			return new GameRunner(game);
		}
}
