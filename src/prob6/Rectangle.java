package prob6;

public class Rectangle extends Shape implements Resizable{
	public Rectangle(double w, double h){
		super.width=w;
		super.height=h;
	}
	public double getArea(){
		 return width*height;
	}
	public double getPerimeter(){
		return (width+height)*2;
	}
	public void resize(double r){
		super.width*=r;
		super.height*=r;
	}

}
