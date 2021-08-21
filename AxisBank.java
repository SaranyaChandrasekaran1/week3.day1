package week3.day3;

public class AxisBank extends bankInfo{

	@Override
public void deposit()
{
	
	System.out.println("Axis Bank Deposit Amount");
}
public static void main(String[] args) {
	AxisBank obj=new AxisBank();
	obj.saving();
	obj.fixed();
	obj.deposit();
	
			
	// TODO Auto-generated method stub
	}

}
