package Observer_Pattern_My;

public interface Board {
	public void add(mObserver observer);
	public void delete(mObserver observer);
	public void notifyObserver();

}
