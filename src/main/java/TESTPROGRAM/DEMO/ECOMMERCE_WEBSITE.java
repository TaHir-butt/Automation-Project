package TESTPROGRAM.DEMO;

//Inheritance Parent(ECOMMERCE_WEBSITE) , Child(checkOutScriting)

public class ECOMMERCE_WEBSITE extends checkOutScriting{

	public static void main(String[] args) throws InterruptedException 
	{
		ECOMMERCE_WEBSITE callFunction = new ECOMMERCE_WEBSITE();
		
		callFunction.checkOut();
		
	}

}
