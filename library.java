import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.io.FileWriter;

public class Temp2 {
    public static void main(String[] args) 
    {   
    
    String footBallData = "";
        
        String[] footBallWebsites = { "/home/jtbb/Desktop/Library/Library.1/1 (1).pdf","/home/jtbb/Desktop/Library/Library.1/shireeshareddy.b2002@gmail.com.pdf","2pdf","/home/jtbb/Desktop/Library/Library.1/3.pdf","/home/jtbb/Desktop/Library/Library.1/4.pdf"};
        
        for (int i=0; i < footBallWebsites.length; i++)
        {
        	try
        	{
        		footBallData = footBallData + ContentOfWebsite(footBallWebsites[i]); 	
        	}
        	catch(Exception e)
        	{
        		System.out.println(e.getMessage());
        	}
        }
       
     	writeDataToFile(footBallData);
    	
    
       
        
        
        
      
        
        System.out.println(footBallData.length());
        
        //writeDataToFile(data);
        writeDataToFile(footBallData);
    }
    public static String ContentOfWebsite(String urlPath){
        String outLine = "";
        try {
            // get URL content
            
            String a = urlPath;
            URL url = new URL(a);
            URLConnection conn = url.openConnection();
 
            // open the stream and put it into BufferedReader
            BufferedReader br = new BufferedReader(
                               new InputStreamReader(conn.getInputStream()));
 
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                outLine += inputLine;
            }
            br.close();

        } catch (MalformedURLException e) { 
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outLine;
    }
    
    public static void writeDataToFile(String str)
    {
	try 
	{
		FileWriter myWriter = new FileWriter("Library.txt");
		myWriter.write(str);
		myWriter.close();
		System.out.println("Successfully wrote to the file.");
	} 
	catch (IOException e) 
	{
		System.out.println("An error occurred.");
		e.printStackTrace();
	}

    }
}
