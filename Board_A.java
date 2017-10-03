package Observer_Pattern_My;

public class Board_A implements mObserver{
	private Board board;
	
	public Board_A(Board board) {
		this.board = board;
		board.add(this);
	}

	@Override
	public void update(String writer, String title, String txt) {
		System.out.println("\n[ISeulBoard]--------------------------------");
		System.out.println(writer + " : " + title + "\n" + txt);
	}
	
}
