package wall;

public class Wall {

    private double height=0;
    private double width=0;
	
    public Wall() {
    	
    }
    
    public Wall(double height, double width) {
    	
    	if (height<0) {
    		height = 0;
    		}
		
		this.height = height;
		
     if (width<0) {
		width = 0;
		}
     
     this.width = width;
    }

	public double getHeight() {
		
		return height;
	}

	public void setHeight(double height) {
		
		if(height<0)
		{
			height=0;
		}
		this.height = height;
	}

	public double getWidth() {
		
		return width;
	}

	public void setWeight(double width) {
		
		if(width<0)
		{
			width=0;
		}
		this.width = width;
	}
	
	public double getArea() {
		
		return height * width ;
		
	}

   
  

}
