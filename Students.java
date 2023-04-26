package org.system;

public class Students {
	

	public void getStudentInfo()
	{
		System.out.println("DOB: Dec 11");
	}
	

	public void getStudentInfo(int id, String name)
	{
		System.out.println(id);
		System.out.println(name);

	}
	
	public void getStudentInfo(String email, String Ph)
	{
		System.out.println(email);
		System.out.println(Ph);
	}
	

	public static void main(String[] args) {
		
		Students st = new Students();
		st.getStudentInfo();
		st.getStudentInfo(11,"Bharathy");
		st.getStudentInfo("bharathyps.88@gmail.com", "9500070561");
		
		

	}

}
