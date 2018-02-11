package exercise.quesetion15;

import bar8.Stack;

/*
 * 	运用stack处理系列数据
 *  "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---"
 * 	其中+表示“将后面的字母压进栈”，而-表示“弹出栈顶的字母并打印”
 * 
 */
public class StackExercise {
	
	public static void main(String[] args) {
		String resouce = 
				//"+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
				"+-+u-";
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<resouce.length();i++){
			char ch = resouce.charAt(i);
			if(ch=='+'){
				stack.push(resouce.charAt(++i));
			}
			if(ch=='-'){
				System.out.print(stack.pop());
			}
		}
		System.out.println(stack);
	}
	
	
}
