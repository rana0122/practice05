package prob6;

public class RectTriangle extends Shape {
	
	public RectTriangle(double w, double h){
		super.width=w;
		super.height=h;
	}
	public double getArea(){
		 return width*height*(0.5);
	}
	public double getPerimeter(){
		return width+height+Math.sqrt((width*width)+(height*height));
	}

}
