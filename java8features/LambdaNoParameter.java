package java8features;

interface Sayable{
	String sayHello();
}
public class LambdaNoParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s1=()-> {
			return "Hello My Dear Friends";
		};
		System.out.println(s1.sayHello());
	}

}
