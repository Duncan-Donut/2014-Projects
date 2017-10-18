//Duncan Rowe
//10/11/16 Ability to enter and return tax information

public class TaxReturn{
	
	//Variables
	public String socialSecurity;
	public String lastName;
	public String firstName;
	public String address;
	public String city;
	public String state;
	public String zipCode;
	public int annualIncome;
	public String martialStatus;
	private static double taxLiability;
	
	//Constructor
	public TaxReturn(String number,String lName,String fName,String place,String area,String stateArea,String zip,int income,String martial){
		socialSecurity = number;
		lastName = lName;
		firstName = fName;
		address = place;
		city = area;
		state = stateArea;
		zipCode = zip;
		annualIncome = income;
		martialStatus = martial;
	}
	
	//Methods
	public static void taxLiability(int income, String martial){
		
		if(income >= 0 && income <= 20000){
			if(martial.equals("single") || martial.equals("Single")){
				taxLiability = income * .15;
			}
			if(martial.equals("married") || martial.equals("Married")){
				taxLiability = income * .14;
			}
		}
		else if(income >= 20001 && income <= 50000){
			if(martial.equals("single") || martial.equals("Single")){
				taxLiability = income * .22;
			}
			if(martial.equals("married") || martial.equals("Married")){
				taxLiability = income * .20;
			}
		}
		else{
			if(martial.equals("single") || martial.equals("Single")){
				taxLiability = income * .3;
			}
			if(martial.equals("married") || martial.equals("Married")){
				taxLiability = income * .28;
			}
		}
		
	}
	
	public double getTaxLiability(){
		return taxLiability;
	}
	public void setTaxLiability(double tax){
		 taxLiability = tax;
	}
	
}
