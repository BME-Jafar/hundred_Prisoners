package hundred_Prisoners;

public class App {
	private final Prison prison;
	private final int numberOfAttempts;
	int numberOfSuccess;
	int numberOfFailings;

	public App(int NumberOfPrisoners, int numberOfAttempts) {
		this.prison = new Prison(NumberOfPrisoners);
		this.numberOfAttempts = numberOfAttempts;
		numberOfSuccess = 0;
		numberOfFailings = 0;
	}

	public void run() {
		for (int i = 0; i < numberOfAttempts; i++) {
			prison.resetTheGame();
			if (prison.playTheGame())
				numberOfSuccess++;
			else
				numberOfFailings++;
		}
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		float ratio = (float) numberOfSuccess / (numberOfSuccess+numberOfFailings);
		return "[numberOfSuccess=" + numberOfSuccess + ", numberOfFailings=" + numberOfFailings + ", ratio=" + ratio
				+ "]";
	}

}
