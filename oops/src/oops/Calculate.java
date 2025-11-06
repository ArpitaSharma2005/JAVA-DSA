package oops;
class Overload
{
	int average(int val1,int val2,int val3) 
	{
		return (val1+val2+val3)/3;
	}
	
	int average(int val1,int val2,int val3,int val4) 
	{
		return (val1+val2+val3+val4)/4;
	}
	
	double average(double val1,double val2,double val3,double val4) 
	{
		return (val1+val2+val3+val4)/4;
	}
}
public class Calculate {

	public static void main(String[] args) {
		
		Overload ol = new Overload();
		System.out.println("Average Is: "+ol.average(30,40,50));
		System.out.println("Average Is: "+ol.average(60,40,50,60));
		System.out.println("Average Is: "+ol.average(60.25,40.15,50.50,60.98));
	}

}