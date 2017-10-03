package Observer_Pattern_My;

public class Board_B implements mObserver{
	public Board board;
	
	public Board_B(Board board) {
		this.board = board;
		board.add(this);
	}
	
	@Override
	public void update(String writer, String title, String txt) {
		System.out.println("\n[kjgBoard]--------------------------------");
		System.out.println(writer + " : " + title + "\n" + txt);
	}
	

}
