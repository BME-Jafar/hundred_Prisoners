package hundred_Prisoners;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Room {
	ArrayList<Box> boxList = new ArrayList<Box>();
	public Room(int NumberOfPrisoners) {
		List<Integer> Numbers = IntStream.range(0, NumberOfPrisoners).boxed().toList(); // From 1 to NumberOfPrisoners
		for (int i = 0; i < NumberOfPrisoners; i++) {
			boxList.add(new Box(Numbers.get(i)));
		}
	}

	public void shuffleTheBoxes(int NumberOfPrisoners) {
		Collections.shuffle(this.boxList);
	}

	public ArrayList<Box> getBoxList() {
		return boxList;
	}

	@Override
	public String toString() {
		return "Room [boxList=" + boxList + "]";
	}

}
