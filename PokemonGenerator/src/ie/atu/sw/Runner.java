package ie.atu.sw;

public class Runner {
public static void main(String[] args) {
	
	String [] wordListOne ={"Fiery", "Electric", "Icy", "Toxic", "Mystic", "Radiant", "Enchanted", "Nimble", "Robust", "Stealthy"};
	String [] wordListTwo = {"Mighty", "Cunning", "Wily", "Swift", "Agile", "Powerful", "Graceful", "Dazzling", "Voracious", "Ferocious"};
	String [] wordListThree = {"Pikachu", "Charizard", "Squirtle", "Bulbasaur", "Jigglypuff", "Snorlax", "Mewtwo", "Gyarados", "Eevee", "Rayquaza"};
	int wordListOneLength = wordListOne.length;
	int wordListTwoLength = wordListTwo.length; //length of array.
	int wordListThreeLength = wordListThree.length;
	
	java.util.Random randomGenerator = new java.util.Random(); //build in utility.
	
	int rand1 = randomGenerator.nextInt(wordListOneLength); //next is built in generator method.
	int rand2 = randomGenerator.nextInt(wordListTwoLength);
	int rand3 = randomGenerator.nextInt(wordListThreeLength);
	
	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]; //phrase to be used later on.
	
	System.out.println("You got " + phrase + " !!!");
	
	
}
}