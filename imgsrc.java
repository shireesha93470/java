public static String getIMGFromResult(String result)
  {
  	
  	String img = "";
  	
	if(result.split("<img src").length < 2)
	{
		return img;
	}
	
	img = result.split("<img src")[1].split("\"")[1];
	
  	return img;
  }
  
  
  public static String getURLFromResult(String result)
  {
  	
  	String url = "";
  	
	if(result.split("href").length < 2)
	{
		return url;
	}
	
	url = result.split("href")[1].split("\"")[1];
	
	if(!url.startsWith("http"))
	{
		return "";
	}
  	
  	return url;
  }
  
  public static String getTitleFromResult(String result)
  {
  	String title = result.split("\"")[0];
  	
  	if(title.length() > 50 && !title.contains("<") && !title.contains(".") && !title.contains("-") && !title.contains("&"))
  	{
  		return title;
  	}
  	
  	return "";
  }			
  
  public static String[] getResultsArrayByKeyword(String keyWord, String masterData)
  {
  	if(masterData == null)
  	{
  		return null;
  	}
  	
  	return masterData.split(keyWord);
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
