package week1.day2;

public class Car {
	
	public String CarBrand(String brand)
	{
		 return brand;
	}
	
	public int RegNum(int regnum)
	{
		 return regnum;
	}
	
	public boolean isPuncture(boolean b)
	{
		return b;
		 
	}
	
	public int mul(int a,int b , int c)
	{
		int prod =a*b*c;
		return prod;
	}
	
	public String GetModel(String model)
	{
		return model;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car obj = new Car();
		
		String brand = obj.CarBrand("Honda");
		System.out.println("Car Brand is :"+brand);
		
		int regnum =obj.RegNum(1234);
		System.out.println("Car Registration Number is :"+regnum);
		
		boolean status =obj.isPuncture(true);
		System.out.println("Car Puncture Status is :"+status);
		
		int prod = obj.mul(5, 6, 7);
		System.out.println("Product of 3 numbers is :"+prod);
		
		String model = obj.GetModel("Amaze");
		System.out.println("Car model is : "+model);
		
		
		
		
		
	}

}
