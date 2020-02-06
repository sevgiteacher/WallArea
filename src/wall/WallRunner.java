package wall;

public class WallRunner {

  public static void main(String[] args){
	  
	  Wall wall = new Wall(5,4);
	  System.out.println("area = " + wall.getArea());
	  
	  wall.setHeight(-1.5);
	  System.out.println("widht = " + wall.getWidth());
	  System.out.println("height = " + wall.getHeight());
	  System.out.println("area = " + wall.getArea());
	  
	  wall.setHeight(6);
	  wall.setWeight(-3.8);
	  System.out.println("widht = " + wall.getWidth());
	  System.out.println("height = " + wall.getHeight());
	  System.out.println("area = " + wall.getArea());
	  
	  wall.setHeight(4);
	  wall.setWeight(5.2);
	  System.out.println("widht = " + wall.getWidth());
	  System.out.println("height = " + wall.getHeight());
	  System.out.println("area = " + wall.getArea());
	  
	  
	  
	  
	  
	  
	    }
}
