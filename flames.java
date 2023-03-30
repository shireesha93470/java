class main{

public static char[] flamesArray = {'f','l','a','m','e','s'};

public static void main(String[] args)
{
	int dupliValues = findRemainderValue("durga" , "bhavana");
	System.out.println(dupliValues);
	scratchUntilOnlyOneFlameIsLeft(dupliValues);
}	

public static int rotate(int totalCount, int pos, int length)
	{
		pos = pos - 1;
		for(int i=1;i<=totalCount;i++)
		{
			pos = rotateBy1(pos, length);	
		}
		
		return pos;
	}
	
public static int rotateBy1(int pos, int length)
{
	if(pos == length)
	{
		return 1;
	}
	
	else
	{
		return ++pos;
	}
}

public static void scratchUntilOnlyOneFlameIsLeft(int flameCount)
{
	int toScratch = flameCount % 6 ;
	
	if(flameCount == 6)
	{
		toScratch = 6;
	}
	
	System.out.println(toScratch);
		
	scratchFlames(toScratch - 1, 6);
	
	for(int i = 5; i > 0;i--)
	{
		toScratch = rotate(flameCount,toScratch, i);
		System.out.println(toScratch);
		scratchFlames(toScratch - 1, i);
	}	
}

public static int findRemainderValue(String str1 , String str2)
{
	char[] s1Array = str1.toCharArray();

	char[] s2Array = str2.toCharArray();

	int countDuplicateChar = 0;


	for(int i=0 ;i< s1Array.length;i++)
	{

    		for(int j= 0 ; j < s2Array.length;j++)
    		{
        		if(s1Array[i] == s2Array[j] && s1Array[i] !='!')
        		{
            			countDuplicateChar= countDuplicateChar + 2;
            			s1Array[i] = '!';
            			s2Array[j] = '!';
           
        		}
       
    		}
	}
	return s1Array.length + s2Array.length - countDuplicateChar;
	
}

public static void scratchFlames(int position, int curLength)
{
	String currentFlamesArray = "";
	flamesArray[position] = '!';
	for(int i=0;i<curLength;i++)
	{
		if(flamesArray[i] != '!')
		{
			currentFlamesArray = currentFlamesArray + flamesArray[i]; 
		}
	}
	
	flamesArray = currentFlamesArray.toCharArray();
	System.out.println(flamesArray);
}
}
