package revvision;

public class vi2 {

}

abstract class DogExceptio extends Exception{
	
	public abstract void visit();

	
}

class dogbiteexception extends DogExceptio{
	String msg;
	public dogbiteexception(String msg) {
		this.msg=msg;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.msg;
	}

	@Override
	public void visit() {
		new handler().handle(this);
		
		
	}
	
}

class dogbarkException extends DogExceptio{
	String msg;
	public dogbarkException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.msg;
	}

	@Override
	public void visit() {
		 new handler().handle(this);
		
	}
	
}
class handler{
	public void  handle(dogbiteexception  bee) {
		System.out.println("dog is biting.....");
	}
	public void handle(dogbarkException brr) {
		System.out.println("dog is bark........");
	}
}

abstract class item {
	public abstract void excequte() throws DogExceptio;
}
class stick extends item{

	@Override
	public void excequte() throws DogExceptio{
	
		throw new dogbiteexception("this beat i bite");
	}
	
}
class stone extends item{

	@Override
	public void excequte() throws DogExceptio {
		throw new dogbarkException("you hit i bark");
		
	}
	
}

class dog{
	public void play(item item) throws DogExceptio {
		item.excequte();
	}
}

class child{
	public void playwithdog(dog tiger,item item) {
		try {
			tiger.play(item);
		} catch (DogExceptio e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.visit();
		}
	}
}