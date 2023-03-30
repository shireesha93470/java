import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
 
public class Temp2 {
    public static void main(String[] args) 
    {
        String urlPathName = "http://jericho.htmlparser.net/docs/index.html";
        String resultant = ContentOfWebsite(urlPathName);
        //System.out.println(resultant.length());
        int paraStart=0;
        int paraEnd=0;
        int count=1;
        paraStart=findParagraphStart(0, resultant);
        paraEnd=findParagraphEnd(0,resultant);
           
           while(paraStart!=-1&&paraEnd!=-1)
           {
            	System.out.println(count++);
          
            	printparagraph(paraStart,paraEnd,resultant);
          
            	paraStart=paraStart+3;
            	paraEnd=paraEnd+3;
          
            	paraStart=findParagraphStart(paraStart,resultant);
            	paraEnd=findParagraphEnd(paraEnd,resultant);
          
           }
          
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
                outLine += inputLine.trim();
            }
            br.close();

        } catch (MalformedURLException e) { 
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outLine;
    }
    
    public static int findParagraphStart(int start,String str)
    {
           
            while(start<str.length()-3)
            {
                 if(str.charAt(start)== '<' && str.charAt(start+1)== 'p'  && str.charAt(start+2)== '>')
                 {
                   
                    return start+3;
                    
                 } 
                    start++;
            }
                    
                    return -1;
             
                    
           
     }
    public static int findParagraphEnd(int end,String str)
    {
          
         
          while(end<str.length()-3)
          {
                 if(str.charAt(end)== '<' && str.charAt(end+1)== '/'  && str.charAt(end+2)== 'p' && str.charAt(end+3)=='>')
                 {
                 
                    return end+3;
                    
                 } 
                    end++;
          }
                    return -1;
           
    }
        
     public static void printparagraph(int start,int end,String str)
     {
             for(int i=start;i<end;i++)
             {
             	     
             	     System.out.print(str.charAt(i));
             	     
             }
                     System.out.println("");
     }
        
        
        
       
   
}

    
  
