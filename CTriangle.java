class CTriangle extends CShape{
  protected double a, b, c;
  CTriangle(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public void show(){
    System.out.print("color = " + color + ", ");
    System.out.println("area = " + (a * b * 0.5));
  }
  public static void main(String args[]){
    CTriangle tria = new CTriangle(3.0, 4.0, 5.0);
    tria.setColor("red");
    tria.show();
  }
}