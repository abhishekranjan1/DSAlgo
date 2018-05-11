package com.abhishek.tutorial.udemy.graph.mazesolver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderCustom {
	
	private String fileName;
	private int startRow;
	private int startCol;
	private int noOfRows;
	private int noOfCols;
	
	private int[][] map;

	public FileReaderCustom(String fileName, int noOfRows, int noOfCols) {
		super();
		this.fileName = fileName;
		this.noOfRows = noOfRows;
		this.noOfCols = noOfCols;
		map = new int[noOfRows][noOfCols];
	}
	
	public void parseFile()
	{
		try {
			Scanner scanner = new Scanner(new File(this.fileName));
			
			while(scanner.hasNextInt())
			{
				for(int i=0;i<noOfRows;i++)
				{
				for(int j=0;i<noOfCols;j++)
				{
					map[i][j]=scanner.nextInt();
					if(map[i][j]==2)
					{
						startRow=i;
						startCol=j;
					}
				}
			}
			}
		scanner.close();		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getStartRow() {
		return startRow;
	}

	public int getStartCol() {
		return startCol;
	}

	public int[][] getMap() {
		return map;
	}
	
	
	
	
}