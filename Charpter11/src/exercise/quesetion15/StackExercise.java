package exercise.quesetion15;

import bar8.Stack;

/*
 * 	����stack����ϵ������
 *  "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---"
 * 	����+��ʾ�����������ĸѹ��ջ������-��ʾ������ջ������ĸ����ӡ��
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
