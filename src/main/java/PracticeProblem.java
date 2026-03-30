public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int min(int num,int num1,int num2){
		if (num>num1&& num1>num2){
			return num2;
		}
		else if(num>num1&& num1 <num2){
         return num1;
		}
		else if(num<num1&&num1<num2){
			return num;
		}
		else if(num<num1&&num1>num2&&num<num2){
			return num;
		}
		else{
			return num;

		}
			
		
	}
	public static Boolean isLeapYear(int num){
{
    if(num % 4 == 0){            
    if(num % 100 == 0){        
    if(num % 400 == 0){   
        return true; }       
     else {
                return false;       
            }}
        else {
            return true;           
        }}
     else {
        return false;               
    }
}
	}
}
           
	         
	
			

	

	


