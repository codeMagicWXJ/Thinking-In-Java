package exercise.quesetion27;

public class Test {
	public static void main(String[] args) {
		QueueOffer<Command> qo = new QueueOffer<>();
		qo.offer(new Command("a"));
		qo.offer(new Command("b"));
		qo.offer(new Command("c"));
		qo.offer(new Command("bsdfsd"));
		
		QueueRemove.poll(qo.queue());
		QueueRemove.poll(qo.queue());
		QueueRemove.poll(qo.queue());
		QueueRemove.poll(qo.queue());
	}
}
