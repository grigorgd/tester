public class Animal{

private String name;
private String species;
private int age;

public Animal(String name, String species, int age){
this.name = name;
this.species = species;
this.age = age;
}

public String toString(){
return name + "," + species + "," + age;
}

}