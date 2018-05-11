package com.abhishek.tutorial.udemy.graph.mazesolver;

import java.io.FileReader;

public class MazeSolverClient {

	public static void main(String[] args) {
		
		FileReaderCustom fileReader = new FileReaderCustom("map.txt", 5, 5);
		fileReader.parseFile();
		MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(),fileReader.getStartRow(),fileReader.getStartCol());
		mazeSolver.findWayOut();
		
	}
}