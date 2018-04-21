package com.abhishek.tutorial.udemy.graph.webcrawler;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WebCrawler {
	private Queue<String> queue;
	private List<String> discoveredWebsiteList;
	
	public WebCrawler()
	{
		queue=new LinkedList<>();
		discoveredWebsiteList= new LinkedList<>();
	}
   public void discoverWeb(String root)
   {
	   queue.add(root);
	   discoveredWebsiteList.add(root);
	   
	   while(!queue.isEmpty())
	   {
		   String v = queue.remove();
		  // String rawHtml = readUrl(v); 
	   }
	   
   }
}
