package com.abhishek.tutorial.udemy.graph.mazesolver;

public class FileReaderCustom {
	
	private String fileName;
	private int startPoint;
	private int endPoint;
	
	private int[][] map;
	
	
	
	public FileReaderCustom(String fileName, int startPoint, int endPoint) {
		super();
		this.fileName = fileName;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	
	public void parseFile()
	{
		
	}
	
	public int getStartPositionRow()
	{
		return -1;
	}
	
	public int getStartPositionCol()
	{
		return -1;
	}
	
	public int[][] getMap()
	{
		return map;
	}

}
