package com.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.sortingutil.SortingUtil;

public class MySortingUtilConsumer {

	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

	public static void main(String[] args) {
		SortingUtil util = new SortingUtil();
		List<String> sorted = util.sort(List.of("Venky", "Deepu", "Pranav", "Kishan"));
		logger.info(sorted.toString());
	}
}
