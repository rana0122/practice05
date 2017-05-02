package prob5;


public class MyStack {
	int count=0;
	int top=-1;
	String [] stack;

	public MyStack(int num){
		count=num;
		stack = new String[count]; 
	}
	
	public void push(String s){
		if(top<count-1){ //stack[0,1,2]<3
			stack[++top]=s;
		}else{
			doubleArray();
			stack[++top]=s;
		}
		
	}

	public String pop()throws MyStackException{
		if(top!=-1){return stack[top--];}
		else throw new MyStackException();
		
	}
	public boolean isEmpty(){
		if(top==-1) return true;
		else return false;
	}
	
	public void doubleArray(){
			String[] temp = new String[count];
			// 기존 배열 복사
			for(int i=0; i<count;i++)
				temp[i]=stack[i];
			//두배크기의 배열 생성후 재저장
			stack=new String[count*=2];
			for(int i=0; i<temp.length;i++){
				stack[i]=temp[i];
			}
	}
	

}
