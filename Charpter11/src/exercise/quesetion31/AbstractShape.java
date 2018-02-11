package exercise.quesetion31;

public abstract  class AbstractShape implements Shape{
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
