package Day4;

//by default interface is public and abstract
public interface Flyable {
//public abstract interface Flyable {
	
//	float rate = 23.4f;
	public static final float rate = 23.4f;
	
//	by default method is public and abstract
	public void start();
//	public abstract void start();
	public void accelerate();
	public void turn();
	public void stop();
	
}
