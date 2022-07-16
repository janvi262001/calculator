
public class Calculator {

	public int calculate(String input) {
		// TODO Auto-generated method stub
		String[] nums=input.split(",");
		
		if(isEmpty(input))
		{
			return 0;
		}
		if(input.length()==1)
		{
			return 0;
		}
		else
		{
			return getSum(nums[0],nums[1]);
		}
	}
	
	private int getSum(String num1,String num2)
	{
		return Integer.parseInt(num1) + Integer.parseInt(num2);
	}
	
	private boolean isEmpty(String input)
	{
		return input.isEmpty();
	}
	
	private int convertToInt(String input)
	{
		return Integer.parseInt(input);
	}
	

}
