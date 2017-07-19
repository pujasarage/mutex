import java.io.*;
class StringDemo	
{
	public static void main(String args[]) throws Exception
{
	System.out.println("Enter string :");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input=br.readLine();
	input=input.toUpperCase();
	int consonentCount=getConsonentCount(input);
	System.out.println("ConsonentCount :"+consonentCount);
	int vowelCount=getVowelCount(input);
	System.out.println("VowelCount :"+vowelCount);

}
	static boolean isVowel(char ch)
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
	int cCount=0;
	for(char c:inputArray)
	{	
		if(!isVowel(c))
		{
			cCount++;
		}
	 	
	}
	return cCount;
	}
	static int getVowelCount(String input)
	{
	char inputArray[]=input.toCharArray();
	int vCount=0;
	for(char c:inputArray)
	{
		if(isVowel(c))
		{
			vCount++;
		}		
	}
	return vCount;
}
}

