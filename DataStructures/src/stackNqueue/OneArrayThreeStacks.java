package stackNqueue;

import org.junit.Test;

public class OneArrayThreeStacks{
	int stackSize = 5;
	String[] array = new String[stackSize * 3]; // three stacks
	int position;
	int[] points = {0,0,0};
	
	void push(int stackNum, String item){
		position = stackNum * stackSize + points[stackNum];
		points[stackNum]++;
		array[position] = item; 
	}
	
	String pop(int stackNum){
		position = stackNum * stackSize + points[stackNum] + 1;
		points[stackNum]--;
		if(points[stackNum] == -1){
			return "stack " + stackNum + " is empty"; 
		}else{
			return array[position];
		}
	}
	
	@Test
	public void test3_1() {
		OneArrayThreeStacks s = new OneArrayThreeStacks();
		s.push(0, "12");
		s.push(0, "13");
		s.push(0, "14");
		s.push(1, "1");
		s.push(1, "2");
		System.out.println(s.pop(0));
		System.out.println(s.pop(0));
		System.out.println(s.pop(0));
		System.out.println(s.pop(0));
		System.out.println(s.pop(1));
		System.out.println(s.pop(1));
		System.out.println(s.pop(1));



}
}