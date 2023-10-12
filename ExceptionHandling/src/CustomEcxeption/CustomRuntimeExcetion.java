package CustomEcxeption;


class eligibilityForVOteException extends RuntimeException
{
	String msg;

	public eligibilityForVOteException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
	
}

class Voter
{
	public void Eligibility(int age) throws eligibilityForVOteException
	{
		if(age<18)
			throw new eligibilityForVOteException("You are not eligible");
		else
			System.out.println("Congo!!you may vote");
			
	}
}

public class CustomRuntimeExcetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Voter voter=new Voter();
     try {
     voter.Eligibility(10);
     }
     catch(eligibilityForVOteException e)
     {
    	 System.out.println(e.getMsg());
     }
     
	}

}
