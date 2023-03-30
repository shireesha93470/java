import java.io.*;
import java.util.Scanner;

class Result
{
  public static void main(String[] args)
  {
 	String masterData = readFileData("Engine.txt");
 	
 	returnFirstSearchResult("Virat Kohli", masterData); 
 	
 	
  }
  
  public static void returnFirstSearchResult(String keyword, String crawledData)
  {
  	String[] results = crawledData.split(keyword);
  	
  	
  	
  	
  	for (int i=0; i < results.length; i++)
  	{
  	
  		
  		printUrls("<a href=", results[i]);
  		try
  		{
  			Thread.sleep(3000);
  		}
  		catch(Exception e)
  		{
  		}
  	}
  	
  	
  }
  public static void printUrls(String keyword, String crawledData)
  {
       String[] findUrls=crawledData.split(keyword);
       

       
       
       for(int i=0;i<findUrls.length;i++)
       {
            saparateAnchorTags("<a href = ", findUrls[i]);
       	   
           findUrls[i].split("<span");
           try
  	   {
  		Thread.sleep(3000);
  	   }
  	  catch(Exception e)
  	  {
  	  }
       }
   }
   public static void saparateAnchorTags(String keyword, String str){
       String[] saparateUrls = str.split(keyword);
       for(int i = 0; i < saparateUrls.length; i++){
       		System.out.println("...........................................................................................................................................");
       		System.out.println(saparateUrls[i].split("class=")[0]);
       }
    }
    
  
  public static String readFileData(String fileName)
  {
	String data = "";
	int lineCount = 0;
	
	try 
	{
		File myObj = new File(fileName);
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) 
		{
			lineCount++;
			data =  data + myReader.nextLine();
		}
		myReader.close();
	} 
	catch (FileNotFoundException e) 
	{
		System.out.println("An error occurred.");
		e.printStackTrace();
	}
	
	return data;
  }
  
}
