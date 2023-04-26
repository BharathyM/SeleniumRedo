package org.system;

public class Desktop extends Computer {
	
	public void desktopSize()
	{
		System.out.println("Method from Desktop class!!");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop sz = new Desktop();
		sz.ComputerModel();
		sz.desktopSize();

	}

}
