
public class GumBallMachine implements coinable, dispensable{
	int gums = 0; 
	
	public GumBallMachine() {
		this.gums= 5;
	}

	
	public boolean insertCoin() {
		// TODO Auto-generated method stub
		if (this.gums > 0) {
			this.dispense();
			return true;
		}
		System.out.println("Return Coin");
		return false;
	}

	
	public void dispense () {
		// TODO Auto-generated method stub
		this.gums--;
		System.out.println("1 Gum Dispensed");
		
	}

	
	public void reload(int count) {
		// TODO Auto-generated method stub
    this.gums += count;	}
	

}
