package com.lambda;

public class LambdaDemo{
	public static void main(String arg[])
	{
		//Boiler plate code here
		/**We are using same expression which is already available in interface
		 * like LambdaExpression (name of class or interface), method name "show()",
		 * parentheses and curly brackets
		 * **/		
		LambdaExpression le = new LambdaExpression()
				{
					@Override
					public void show() {
						System.out.println("typical show method");
						
					}
				};
		
		//Lambda Expression
		/**removed boiler plate code**/
		le = () -> System.out.println("show Method");
		
		le.show();
		
		//Typical declaration
		new Thread(new Runnable() {
		    @Override
		    public void run() {
		        System.out.println("Business logic");
		    }
		}).start();
		
		
		//Lambda Expression
		new Thread(
	            () ->   {
	                        System.out.println("Business logic");
	                    }
	         ).start();
	}

	

}
