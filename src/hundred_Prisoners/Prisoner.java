package hundred_Prisoners;

import java.util.ArrayList;

public class Prisoner {
	private int Number;

	public Prisoner(int number) {
		Number = number;
	}

	public int getNumber() {
		return Number;
	}
	boolean pickABox(Room R1)
	{
		boolean Success = false;
		ArrayList <Box> B1 = R1.getBoxList();
		int numberOfBoxToCheck = this.Number;
		int numberOfPrisons = B1.size();
		for (int numberOfTries = numberOfPrisons/2 ;numberOfTries > 0 ; numberOfTries--)
		{
			numberOfBoxToCheck = B1.get(numberOfBoxToCheck).getInsideNumber();
			if (numberOfBoxToCheck == this.Number)
			{
				Success = true;
				break;
			}
		}
		
		return Success;
	}

}
