package hundred_Prisoners;

public class Box {
	private int insideNumber;
	public Box(int insideNumber) {
		this.insideNumber = insideNumber;
	}
	@Override
	public String toString() {
		return "Box [insideNumber=" + insideNumber + "]\n";
	}
	public int getInsideNumber() {
		return insideNumber;
	}
	
}
