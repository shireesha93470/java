import java.io.*;
import java.util.Scanner;

class searchEngine
{
  
  public static void main(String[] args)
  {
 	String masterData = readFileData("movie.txt");
 	
 	int resultsCount = 1;
 	
 	String keyword = "Nani";
 	
 	String[] resultsData = getKeyword(keyword, masterData);
 	
	for(int i=1;i<resultsData.length;i++)
	{
		String title = getTitleFromTheData(resultsData[i]);
		title=title.replace("%20"," ");
	
		if(title != "")
		{
			String url = getUrlLinks(resultsData[i]);
			if(url != "")
			{
				String img =getImageTags(resultsData[i]);
				if(img != "")
				{
				
				          System.out.println("RESULT # " + resultsCount++);
				          System.out.println("****");
				          System.out.println("TITLE : " + keyword + " " + title);
				          System.out.println("URL : " + " " + url);
				          System.out.println("IMG :" +" " + img);
				          System.out.println("***");
				}
				else
				{
					System.out.println("RESULT # " + resultsCount++);
				          System.out.println("****");
				          System.out.println("TITLE : " + keyword + " " + title);
				          System.out.println("URL : " + " " + url);
				}
				
				System.out.println("");
				System.out.println("");
			}
		}
	}
 	
  }
  
  public static String getTitleFromTheData(String answer)
  {
  	String title=answer.split("\"")[0];
  	if(title.length() > 50 && !title.contains("<") && !title.contains(".") && !title.contains("-") && !title.contains("&") && !title.contains("$"))
  	{
  		return title;
  	}
  	return"";
  	
  }

  public static String getUrlLinks(String answer)
  {
  	String links="";
  	if(answer.split("href").length<2)
  	{
  		return links;
  	}
  	links= answer.split("href")[1].split("\"")[1];
  
  	if(!links.startsWith("http"))
  	{
  		return" ";
  	}
  	return links;
  }
  
 
  public static String getImageTags(String answer)
  {
  	String image="";
  	if(answer.split("<img src").length<2)
  	{
  		return image;
  	}
  	image=answer.split("<img src")[1].split("\"")[1];
  	return image;
  }
  
  
  public static String[] getKeyword(String answer, String masterData)
  {
  	if(masterData == null)
  	{
  		return null;
  	}
  	
  	return masterData.split(answer);
  }
  
 
 
 public static String readFileData(String fileName)
 {
	String data = " ";
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
