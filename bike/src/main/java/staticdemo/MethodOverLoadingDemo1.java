package staticdemo;

public class MethodOverLoadingDemo1 {//it will same method name
	public static void main(String[] args) {
		Dog dd=new Dog();
		dd.play(new biscourt());
	}
		

}
class Dog{
	public void play(stone e) {
		System.out.println("the dog is runneing ");
		
	}
	public void play(biscourt j) {
		System.out.println("ths dog is eating g");
	}
	public void play(strink d) {
		System.out.println("the dog is shouting ");
		
	}
}
class biscourt{}
class stone{}
class strink{}

	