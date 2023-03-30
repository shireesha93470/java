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
        
        String[] footBallWebsites = { "https://www.goal.com/en","https://www.101greatgoals.com/","https://www.fourfourtwo.com/","https://www.thisisanfield.com/","https://www.fastscore.com/","https://sportslens.com/","https://www.transfermarkt.com/","https://www.marca.com/en/","https://www.uefa.com/","https://www.bbc.com/sport/football","https://www.espn.in/football/","https://www.sportsmole.co.uk/","https://www.empireofthekop.com/","https://www.whoscored.com/","https://www.caughtoffside.com/","https://www.calciomercato.com/","https://talksport.com/football/","https://www.skysports.com/football/news","https://www.theguardian.com/football","https://int.soccerway.com/","https://sports.yahoo.com/","https://www.soccernews.com/","https://www.talkchelsea.net/","https://www.footballparadise.com/","https://www.insideworldfootball.com/","https://coachingsoccerweekly.com/","https://www.rossoneriblog.com/","https://www.avillafan.com/","https://www.starsandstripesfc.com/","https://www.bet-bonuscode.co.uk/events/","https://injuriesandsuspensions.com/","https://www.realmadridnews.com/","https://www.westhamtillidie.com/","https://www.tribalfootball.com/","https://supersport.com/football/news","https://thisisfutbol.com/","https://football-italia.net/","https://thesefootballtimes.co/","https://forzaitalianfootball.com/","https://www.eurosport.com/football/","https://www.football365.com/"};
        
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
    	
    
       
        
        
        
        //String data=(resultant + resultant1+ resultant3 + resultant4 + resultant5 + resultant6 + resultant7 + resultant8 + resultant9 + resultant10 + resultant11 + resultant12 + resultant13 + resultant14 + resultant15 + resultant16 + resultant17 + resultant18 + resultant19);
        
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
		FileWriter myWriter = new FileWriter("footBall.txt");
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
