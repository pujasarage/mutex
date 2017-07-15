import java. io.*;
class BufferedRd{
	public static void main(String a[]) throws Exception
	{
		System.out.println("enter number");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int number=Integer.parseInt(br.readLine());
	System.out.println("number is"+number);
}
}
