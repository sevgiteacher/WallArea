package wall;

public class Wall {

    private double height=0;
    private double weight=0;
	
    public Wall() {
    	
    }
    
    public Wall(double height, double weight) {
		
		this.height = height;
		this.weight = weight;
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

	public double getWeight() {
		
		return weight;
	}

	public void setWeight(double weight) {
		
		if(weight<0)
		{
			weight=0;
		}
		this.weight = weight;
	}

   
  

}
