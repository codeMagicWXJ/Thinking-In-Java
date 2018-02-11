package bar8;

public abstract class Event {
	private long eventTime;
	protected final long delayTime;//ÑÓ³ÙÊ±¼ä
	public Event(long delayTime){
		this.delayTime = delayTime;
		start();
	}
	
	
	public void start() {
		eventTime = System.currentTimeMillis()+delayTime;
	}
	
	public boolean ready(){
		return System.currentTimeMillis() >= eventTime;
	}
	
	public abstract void action();
}
