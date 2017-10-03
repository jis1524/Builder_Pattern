package Observer_Pattern_My;

public class MainClass {
	public static void main(String[] args) {
		WriteTXT write = new WriteTXT();
		
		Board_A AA = new Board_A(write);
		Board_B BB = new Board_B(write);
		Board_C CC = new Board_C(write);

		
		write.setNewWrtie("leader", "첫번째", "빌더패턴을 공부하고 예제를 만드세요.");
		write.setNewWrtie("leader", "두번째", "옵저버패턴을 공부하고 예제를 만드세요.");
	}
}
