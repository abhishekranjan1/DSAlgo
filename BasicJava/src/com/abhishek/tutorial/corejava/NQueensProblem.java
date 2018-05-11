package com.abhishek.tutorial.corejava;

public class NQueensProblem{
	private int numOfQueens;
	private int [][] chessTable;
	
	public NQueensProblem(int numOfQueens) {
		
		this.numOfQueens = numOfQueens;
		chessTable= new int[numOfQueens][numOfQueens];
	}
	public void solve()
	{
		if(setQueens(0))
		{
			printQueens();
		}
		else
		{
			System.out.println("Sorry the solution is not found!!!!");
		}
	}
	
	public void printQueens()
	{
		for(int i=0;i<numOfQueens;i++)
		{
			for(int j=0;j<numOfQueens;j++)
			{
				if(chessTable[i][j]==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
	}
	
	public boolean setQueens(int colIndex)
	{
		if(colIndex==numOfQueens)
		{
			return true;
		}
		for(int rowIndex=0;rowIndex<numOfQueens;rowIndex++)
		{
			if(isPlaceValid(rowIndex,colIndex))
			{
				chessTable[rowIndex][colIndex]=1;
				if(setQueens(colIndex+1))
				{
					return true;
				}
				//Backtrack to the previous column and set it's value to '0'
				chessTable[rowIndex][colIndex]=0;
			}
		}
	return false;
		
	}
	
	public boolean isPlaceValid(int rowIndex, int colIndex)
	{
		
		for(int i=0;i<colIndex;i++)
		{
			if(chessTable[rowIndex][i]==1) return false;
		}
		for(int i=rowIndex,j=colIndex; i>0 && j>0;--i,--j)
		{
			if(chessTable[i][j]==1) return false;			
		}
		for(int i=rowIndex, j=colIndex;i<numOfQueens && j>0; i++,j--)
		{
			if(chessTable[i][j]==1) return false;			
		}
		return true;
		
	}
	
}
