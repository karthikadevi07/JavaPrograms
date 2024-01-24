package java8features;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class LambdaWithComparator {

	public static void main(String[] args) {
		List<Product> list=new ArrayList<>();
		list.add(new Product(11,"Onion",120));
		list.add(new Product(12,"Carrot",50));
		list.add(new Product(13,"Tomato",60));
		list.add(new Product(14,"Beetroot",55));
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		list.forEach(p->System.out.println(p));
		
	}

}
