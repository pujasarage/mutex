import java.io.*;
class StringDemo	
{
	public static void main(string args[])
	BufferedReader br = new BufferedReader(new InputStream(System.in));
	String input=br.readLine();
	String input=input.toUpperCase();
	int consonentCount=getConsonentCount(input);
	System.out.println("ConsonentCount :"+consonentCount);
	int vowelCount=getVowelCount(input);
	System.out.println("VowelCount :"+vowelCount);


	Ststic bool isVowel(char ch)
	{
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			return true;
		}
		return false;
	}	
	static int getConsonentCount(String input)
	{
	char inputArray[]=input.toCharArray();
	int count=0;
	for(char c:CharArray)
	{	
		if(!isVowel())
		{
			count++;
		}//return count;
	 	
	}
	}
	static int getVowelCount(String input)
	{
	char inputArray[]=input.toCharArray();
	int vCount=0;
	for(char c:CharArray)
	{
		if(isVowel())
		{
			count++;
		}		
	}
	}//return count;
}
