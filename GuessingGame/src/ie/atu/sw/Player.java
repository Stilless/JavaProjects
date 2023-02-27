package ie.atu.sw;

public class Player {
	private int num;
	
	public void guess() {
		num = (int) (Math.random() * 10); //generate number between 0 - 9 and assigns to num
		System.out.println("I'm guessing number " + num);
	}
	public int getNumber() {
		return num;
		
	}
}
