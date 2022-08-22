package hundred_Prisoners;

import java.util.ArrayList;

public class Prison {
	private int numberOfPrisoners;
	private Room playingRoom;
	ArrayList <Prisoner> prisoners = new ArrayList<Prisoner>();
	public Prison(int numberOfPrisoners) {
		super();
		this.numberOfPrisoners = numberOfPrisoners;
		this.playingRoom = new Room(numberOfPrisoners);
		for (int i = 0;i < numberOfPrisoners; i++) {
			prisoners.add(new Prisoner(i));
		}

	}
	public boolean playTheGame()
	{
		for(Prisoner P : prisoners)
		{
			if(!P.pickABox(playingRoom))
				return false;
		}
		return true;
	}
	public void resetTheGame()
	{
		this.playingRoom.shuffleTheBoxes(this.numberOfPrisoners);
	}
	

}
