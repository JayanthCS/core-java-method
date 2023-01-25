package com.xworkz.app;

public class Airport {
     
	Terminal terminal[] ;
	int index;
	
	public Airport(int size) {
	System.out.println("Airport object is created");
	terminal = new Terminal[size];
	}
	
	   public boolean create (Terminal terminal) {
		   
		 System.out.println("Terminal Creation started");  
		   boolean isCreated = false;
		
		   if(terminal.terminalName != null) {
			   this.terminal[index++] = terminal;
			   isCreated = true;
		   }
		   
		   System.out.println("Terminal creation is ended");
		   return isCreated;
	   }
	   public void getTerminal() {
		   System.out.println("Terminal info");
		   for(int i=0; i<this.terminal.length; i++) {
			   
			   System.out.println(terminal[i].terminalNo+ "   " + terminal[i].terminalName+ "   "+ terminal[i].terminalGates);
		   }
	   }
}
