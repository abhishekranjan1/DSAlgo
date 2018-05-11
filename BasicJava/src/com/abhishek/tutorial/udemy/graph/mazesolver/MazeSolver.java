package com.abhishek.tutorial.udemy.graph.mazesolver;

public class MazeSolver {
	
	private int[][] map;
	private boolean[][] visited;
	private int startRow;
	private int startCol;
	public MazeSolver(int[][] map, int startRow, int startCol) {
		
		this.map = map;
		this.startRow = startRow;
		this.startCol = startCol;
		visited= new boolean[map.length][map[0].length];
	}
	
	public void findWayOut()
	{
		try{
			dfs(startRow,startCol);
			System.out.println("No solution found...");
		}catch(RuntimeException e){
			System.out.println("Route found to exit!!!");
		}		
	}
	
private void dfs(int i, int j){
		
	int endOfMap = this.map.length-1;	
	
	System.out.println("Visiting i="+i+", j="+j);
		
		//All the next conditions are for the break for the recursion
		if( this.map[i][j] == 3 ){		
			throw new RuntimeException();	 // if we have found the 3 "exit" we break out the iteration with an exception
		}
		
		if( visited[i][j] ) { // if it has been already visited, we just skip it
			return;
		}else if( i < 0 || i>= endOfMap ){ // out of map
			return;
		}else if( j < 0 || j>= endOfMap ){  // out of map
			return;
		}else if( this.map[i][j] == 1 ){  // if it is a wall we cannot go in that direction
			return;
		}
		
		//Recursion steps
		else{
		
			this.visited[i][j] = true;  // set the current position to visited 
			
			dfs(i+1,j); // going down
			dfs(i,j+1); // going right
			dfs(i,j-1); // going left
			dfs(i-1,j); // going up				
		}
	}
	  
	
	

}
