
public class Person {
	private int coins;
	
	public Person(int coins) {
		this.coins = coins;	
	}
	public void insertCoin(coinable coinable) {
		System.out.println("Coin insertion");
		coins--;
		if (!coinable.insertCoin()) {
			coins++;
			System.out.println("Coin refunded");
		}
		System.out.println("Coin count : " + coins);
	}
	
}
