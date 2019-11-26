public class Class20191126 {
	// arguments are passed using the text field below this editor   
	public static void main(String[] args)   {     
		Rectangle r = new Rectangle(4.0, 5.0);     
		System.out.println(r.toString());     
		Triangle t = new Triangle(3.0, 4.0);     
		System.out.println(t.toString());   
	} 
}  

interface Shape{   
	double getArea(); 
}  

class Rectangle implements Shape{   
	private double length;   
	private double width;   
	public Rectangle(double length, double width){     
		this.length = length;     
		this.width = width;   
	}   
	public double getArea(){   	
		return length * width;   
	}   
	public String toString(){   	
		return "This is Rectangle\nArea : " + String.valueOf(this.getArea()) + "\n";   
	}  
}  

class Triangle implements Shape{   
	private double base;   
	private double height;   
	public Triangle(double base, double height){     
		this.base = base;     
		this.height = height;   
	}   
	public double getArea(){   	
		return base * height * 0.5;   
	}   
	public String toString(){   	
		return "This is Triangle\nArea : " + String.valueOf(this.getArea()) + "\n";   
	}  
}
