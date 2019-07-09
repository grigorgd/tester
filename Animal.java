public class Animal{

private String name;
private Species species;
private int age;

public Animal(String name, Species species, int age){
this.name = name;
this.species = species;
this.age = age;
}

public String toString(){
return name + "," + species + "," + age;
}

}