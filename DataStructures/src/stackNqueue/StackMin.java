package stackNqueue;

public class StackMin extends Stack {

	Stack s2;
	
	public StackMin(){
		s2 = new Stack();
	}
	
	public void push(int item){
		if(item <= min()){
			s2.push(item);
		}else{
			super.push(item);
		}
	}
	
	public Object pop(){
		int value = (int) super.pop();
		
		if(value == min()){
			s2.pop();
		}
		return value;
		
	}
	
	public int min(){
		if(s2.isEmpty()){
			return Integer.MAX_VALUE;
		}
		else{
			return (int) s2.peek();
		}
	}
}
