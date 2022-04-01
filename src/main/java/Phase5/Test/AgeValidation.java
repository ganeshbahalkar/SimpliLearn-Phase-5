package Phase5.Test;

public class AgeValidation {
	public String ageValidator(int age) {
		if(age>=18) {
			return "valid age to vote";
		}
		else {
			return "not valid to vote";
		}
	}
}
