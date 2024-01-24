package java8features;
interface Addable{
	int add(int a,int b);
}

public class LambdaMutiplePaarameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable a1=(x,y)
-> x+y;
System.out.println ("1st Add: "+a1.add(85,64));
Addable a2=(int x,int y)->{
	return x+y;
};
System.out.println ("2nd Add: "+a2.add(8,4));

}

}
