package exercise.quesetion31;

import java.util.Iterator;
import java.util.Random;

public class RandomShapeGenerator implements Iterable<Shape>{
	private static Random rand = new Random();
	private final int number;//用迭代器生成元素的数量
	public RandomShapeGenerator(int number) {
		this.number = number;
	}
	@Override
	public Iterator<Shape> iterator() {
		return new Iterator<Shape>() {
			private int index = 0;
			@Override
			public boolean hasNext() {
				return index < number;
			}

			@Override
			public Shape next() {
				index++;
				return RandomShapeGenerator.this.next();
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}	
			
		};
	}
	
	private Shape next(){
		switch(rand.nextInt(3)){
			default:
			case 0:
				return new Circle();
			case 1:
				return new Triangle();
			case 2:
				return new Square();
		}
	}
	
	public static void main(String[] args) {
		RandomShapeGenerator randomShapeGenerator = new RandomShapeGenerator(10);
		for(Shape shape : randomShapeGenerator){
			System.out.println(shape);
		}
	}
}
