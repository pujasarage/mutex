class Calculator
{
	double subtract(double doubleNum1,double doubleNum2)
	{
	double subtract=(doubleNum1-doubleNum2);
	return subtract;
	}
	float addition(float floatNum1,float floatNum2)
	{
		 float addition=(floatNum1+floatNum2);
		return addition;
	}
	int multiply(int intNumber1,int intNumber2)
	{
		int multiply=(intNumber1*intNumber2);
		return multiply;
	}
public static void main(String args[])
{
	Calculator cal=new Calculator();
	int multiply=cal.multiply(10,20);
	float addition=cal.addition(10f,20f);
	double subtract=cal.subtract(20,10);
	System.out.println("Multiplication:"+multiply);
	System.out.println("Addition:"+addition);
	System.out.println("subtraction:"+subtract);
}
}
