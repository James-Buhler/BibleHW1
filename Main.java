package bible;

public class Main {

	public static void main(String[] args) {
		double currentDisciples = Singleton.disciples;
		double yearsPassed = 0;
		while(currentDisciples < Singleton.population) {
			currentDisciples = currentDisciples + (currentDisciples * Singleton.amountTrained);
			yearsPassed = yearsPassed + Singleton.yearsToTrain;
		}
		System.out.println(currentDisciples);
		System.out.println(yearsPassed);
	}

}
