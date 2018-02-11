package bar8;
/*
 * 	演示自己编写的stack
 * 
 */
public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		for(String str: "My dog has fleas".split(" "))
			stack.push(str);
		
		while(!stack.empty())
			System.out.print(stack.pop()+" ");
		
		
	}	
}
