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
    
    String masterData = "";
        
        String[] movies = {"https://idlebrain.com/index3.html","https://5movierulz.mu/","https://www.culturopedia.com/telugu-cinema/","https://ww2.ibomma.tel/telugu-movies/","https://www.zee5.com/movies","https://timesofindia.indiatimes.com/entertainment/telugu/movie-reviews","https://telanganatoday.com/telugu-cinema-penetrating-beyond-regional-boundaries","https://www.hindustantimes.com/entertainment/telugu-cinema","https://www.allmovie.com/"};
        
        for (int i=0; i < movies.length; i++)
        {
        	try
        	{
        		masterData = masterData + ContentOfWebsite(movies[i]); 	
        	}
        	catch(Exception e)
        	{
        		System.out.println(e.getMessage());
        	}
        }
       
     	writeDataToFile(masterData);
    	
    
       
        
        
        
        //String data=(resultant + resultant1+ resultant3 + resultant4 + resultant5 + resultant6 + resultant7 + resultant8 + resultant9 + resultant10 + resultant11 + resultant12 + resultant13 + resultant14 + resultant15 + resultant16 + resultant17 + resultant18 + resultant19);
        
        System.out.println(masterData.length());
        
        //writeDataToFile(data);
        writeDataToFile(masterData);
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
		FileWriter myWriter = new FileWriter("movie.txt");
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

