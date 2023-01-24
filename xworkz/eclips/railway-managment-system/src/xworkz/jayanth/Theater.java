package xworkz.jayanth;

public class Theater {

	Screen screen[] = new Screen[2];
	int index;
	
	public Theater() {
		
		System.out.println("Theater object is created");
	}
	
	public boolean create (Screen screen) {
		System.out.println("Screen creation started");
		boolean isCreated = false;
		
		if(screen.screenName != null) {
			this.screen[index++] = screen;
			isCreated = true;
		}
		
		System.out.println("Theater object is ended");
		return isCreated;
	}
	
	public void getScreen() {
		
		System.out.println("Screen info");
		for(int index=0; index< this.screen.length; index++) {
			System.out.println(screen[index].screenNo + "    "+ screen[index].screenName+ "   "+ screen[index].screenCapacity);
		}
	}
	
	public Screen getScreenByScreenNo(int screenNo) {
		
		System.out.println("Inside getScreenByScreenNo method");
		for(int i = 0; i < screen.length; i++) {
			if(screen[i].screenNo == screenNo) {
				System.out.println("Screen number is matched .... proceed the data");
				System.out.println(screen[i].screenNo +"  "+ screen[i].screenName+ "   "+ screen[i].screenCapacity);
				return screen[i];
			}
		}
		System.out.println("getScreenByScreenNo method is ended");
		return null;
	}
	
}
