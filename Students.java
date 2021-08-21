package week3.day3;

public class Students {

	
public void getStudentInfo()
{
	int id=121;
	System.out.println("Student Id:"+ id);
			
}
public void getStudentInfo(int id)
{
	System.out.println("Student Id:"+ id);
	}
public void getStudentInfo(int id ,String name)
	{
		System.out.println("Student Id is"+ id);
		System.out.println("Student Name is"+ name);
		
	}

public void getStudentInfo(String email,long phoneno)
{
System.out.println("Student Email:"+ email);
System.out.println("Student PhoneNumber:"+ phoneno);
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Students studobj=new Students();
	studobj.getStudentInfo();
	studobj.getStudentInfo(201);
	studobj.getStudentInfo(300,"Saran");
	studobj.getStudentInfo("test@gmail.com",9678123458L);
	
}
}
