import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.io.FileWriter;

public class library1{
    public static void main(String[] args) 
    {   
    
     	 String libraryDirectory = "/home/jtbb/Desktop/Library/Books";
     	 String[] resultArray = getAllBooks(libraryDirectory);
     	 for(int i = 0; i < resultArray.length; i++){
     		System.out.println(resultArray[i]);
     	}
    }
    

    public static String[] getAllBooks(String libraryDirectory)
    {
	  String LibraryData = "";
	  File directoryPath = new File(libraryDirectory);
	  String[] books = directoryPath.list();
			
		if(books.length != 0) {
				
		   return books;
			
		}else {
				
		   return null;
                       
                }
     }
	       		
 
}
