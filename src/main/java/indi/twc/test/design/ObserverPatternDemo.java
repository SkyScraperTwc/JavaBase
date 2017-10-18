package indi.twc.test.design;

import java.util.ArrayList;
import java.util.List;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		new BinaryObserver(subject);
		new OctalObserver(subject);
		subject.setState(10);
		subject.setState(20);
	}

}

class Subject{
	private int state;
	private List<Observer> observers = new ArrayList<Observer>();
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public List<Observer> getObservers() {
		return observers;
	}
	
	private void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
}

abstract class Observer{
	public Subject subject;
	public abstract void update();
}

class BinaryObserver extends Observer {
	
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.getObservers().add(this);
	}
	@Override
	public void update() {
		System.out.println("Binary String: " + subject.getState());
	}
	
}

class OctalObserver extends Observer {
	
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.getObservers().add(this);
	}
	
	@Override
	public void update() {
		System.out.println("Octal String: " + subject.getState());
	}
	
}