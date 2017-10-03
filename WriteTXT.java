package Observer_Pattern_My;

import java.util.ArrayList;
import Observer_Pattern_My.mObserver;

public class WriteTXT implements Board{
	private ArrayList<mObserver> observers;
	private String writer;
	private String title;
	private String txt;
	
	public WriteTXT() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void add(mObserver observer) {
		observers.add(observer);
	}
	
	@Override
	public void delete(mObserver observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
		
	}

	@Override
	public void notifyObserver() {
		for (mObserver mObserver : observers) {
			mObserver.update(writer, title, txt);
		}
	}
	
	public void setNewWrtie(String writer, String title, String txt) {
		this.writer = writer;
		this.title = title;
		this.txt = txt;
		notifyObserver();
	}
}
