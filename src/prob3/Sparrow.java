package prob3;

public class Sparrow extends Bird {
	public void fly(){
		System.out.println("참새("+getName()+")는 날아 다닙니다.");
	}
	public void sing(){
		System.out.println("참새("+getName()+")가 소리내어 웁니다.");
	}
	public String toString() {
		String s= "참새의 이름은 "+super.getName()+"입니다.";
		return s;
	}
}
