package revvision2;

public class Visitor2 {
	public static void main(String[] args) {
		
	

	Child ramu=new Child();
	Dog tiger=new Dog();
	
	Item item=new Stick();
	
	ramu.playWithDog(tiger, item);
}
}

abstract class DogExceptions extends Exception{
public abstract void visit();
}
class DogBiteException extends DogExceptions{
String msg;
public DogBiteException(String msg) {
	this.msg=msg;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.msg;
	}
@Override
public void visit() {
	// TODO Auto-generated method stub
	new Handler().handle(this);
}
}
class DogBarkException extends DogExceptions{
String msg;
public DogBarkException(String msg) {
	this.msg=msg;
}
@Override
public String toString() {
	return this.msg;
}
@Override
public void visit() {
	new Handler().handle(this);
}
}
class Handler{
public void handle(DogBiteException dbe) {
	System.out.println("handling bite exception...taking to hospital...:"+dbe);
}
public void handle(DogBarkException dre) {
	System.out.println("handling barking exception..being silent...:"+dre);
}
}
abstract class Item{
public abstract void execute()throws DogExceptions;
}
class Stick extends Item{
@Override
public void execute() throws DogExceptions {
	throw new DogBiteException("You beat I bite.....");
}
}
class Stone extends Item{
@Override
public void execute() throws DogExceptions {
	throw new DogBarkException("you hit I bark.........");
}
}
class Dog{
public void play(Item item) throws DogExceptions{
	item.execute();
}
}
class Child{
public void playWithDog(Dog tiger,Item item) {
	try {
		tiger.play(item);
	}catch(DogExceptions de) {
		System.out.println(de);
		de.visit();
	}
}

}
