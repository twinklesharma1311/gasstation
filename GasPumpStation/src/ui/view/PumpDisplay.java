package ui.view;

public class PumpDisplay {

    String message;

    public void update(double amount, double quantity) {
    	System.out.println("Price($): "+amount);
    	System.out.println("Fuel(L): "+quantity);
    	System.out.println();
    	
    }
}