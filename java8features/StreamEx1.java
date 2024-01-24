package java8features;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>names =Arrays.asList("Karthikadevi","Saveetha","Agalya","Devi","Muthu","Nithi");
		Stream<String> allNames=names.stream();
		
		Stream<String> longNames=allNames.filter(str->str.length()>7);
		
		System.out.println("Using ForEach(): ");
		longNames.forEach(str->System.out.println(str));
		
		List<String> namesCollect=names.stream().filter(str->str.length()>7).collect(Collectors.toList());
		System.out.println("\nUsing Collect(): ");
		namesCollect.forEach(System.out::println);
		
		

	}

}
