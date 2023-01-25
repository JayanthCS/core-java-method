package xworkz.jayanth;

public class TheaterTester {

	public static void main(String [] args) {
		
		System.out.println("Main method started");
		
		Theater theater = new Theater();
		
		Screen screen = new Screen (1, "navarang", 500);
		Screen screen1 = new Screen (2, "sampige", 400);
		
		theater.create(screen);
		theater.create(screen1);
		
		theater.getScreen();
		
		
		System.out.println("Get the screen info");
		theater.getScreenByScreenNo(2);
		
		
		
		System.out.println("Main method is ended");
	}
	
}
