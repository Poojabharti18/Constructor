package constructor;

public class Product {
    int id;
    String name;
    int noofproducts;
    
    Product()
    {
        
    }
    Product(int id,String name,int noofproducts)
    {
        this.id=id;
        this.name=name;
        this.noofproducts=noofproducts;
    }
    
    public void setId(int id) {
    	this.id = id;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoofproducts() {
		return noofproducts;
	}
	public void setNoofproducts(int noofproducts) {
		this.noofproducts = noofproducts;
	}
	public String toString()
    {
        return "Product id=: "+id+"Product name =:"+name+"Number of products=:"+noofproducts;
        
    }

}
