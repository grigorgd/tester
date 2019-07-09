public class Main{
	
public static void main(String[] args){
	
	System.out.println("this is standard system output");
	Main example = new Main();
	System.out.println("method 1: " + example.getAnswer());
	System.out.println("method 2: " + Main.getMessage());
	System.out.println("method 2 without Main: " + getMessage());

	Animal animal = new Animal("Azor", "dog", 8);
	System.out.println(animal.toString());
	
}

private String getAnswer(){
	
	return "this is method";

}
private static String getMessage(){
	
	return "this is static method";

}

}