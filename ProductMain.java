package constructor;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Product p1=new Product(104,"bed",100);
          System.out.println(p1);
          System.out.println("====================================");
          Product p2=new Product(101,"Table",32);
          System.out.println(p2);
          System.out.println("====================================");
          Product p3=new Product();
          p3.setId(103);
          p3.setName("Pooja");
          p3.setNoofproducts(4);
          System.out.println(p3.getId());
          System.out.println(p3.getName());
          System.out.println(p3.getNoofproducts());
          System.out.println("====================================");
          
        		 
	}

}
