/*
 * 2. MilitaryCadet is a Java class that checks the validity of a candidate. 
 * Valid cadet is defined as someone who is not over 40 and 
 * does not weight less than 40 pounds. Define an InvalidCadetException 
 * and use this in MilitaryCadet class to handle candidate inputs.*/
public class MilitaryCadet {
 private int age;
 private int weight;
 
public MilitaryCadet(int age, int weight) {
	super();
	this.age = age;
	this.weight = weight;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}


@Override
public String toString() {
	return "MilitaryCadet [age=" + age + ", weight=" + weight + "]";
}
 

}
