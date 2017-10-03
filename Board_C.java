package Observer_Pattern_My;

public class Board_C implements mObserver{
	public Board board;
	
	public Board_C(Board board) {
		this.board = board;
		board.add(this);
	}

	@Override
	public void update(String writer, String title, String txt) {
		System.out.println("\n[LimdoBoard]--------------------------------");
		System.out.println(writer + " : " + title + "\n" + txt);
	}
	
}
