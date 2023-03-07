package exception;


class AgeNotSufficient extends Exception{
	AgeNotSufficient(int age){
		System.out.println("Age is not sufficient to vote");
	}
}

public class Custom {
	void age(int age) throws AgeNotSufficient{
        if(age<18)
            throw new AgeNotSufficient(age);
        else
            System.out.println("You are eligible to vote");
    }

	public static void main(String[] args) {
		
		Custom custom=new Custom();
		try {
			custom.age(15);
		}
		catch(AgeNotSufficient ageNotSufficient) {
			
		}

	}

}
