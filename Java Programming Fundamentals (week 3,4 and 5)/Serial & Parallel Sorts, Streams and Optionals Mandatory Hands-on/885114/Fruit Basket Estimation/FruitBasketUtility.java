import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FruitBasketUtility {
	private List<FruitBasket> fruitBasketList = new ArrayList<FruitBasket>();

	public List<FruitBasket> getFruitBasketList() {
		return fruitBasketList;
	}

	public void setFruitBasketList(List<FruitBasket> fruitBasketList) {
		this.fruitBasketList = fruitBasketList;
	}

	public void addToBasket(FruitBasket fbObj) {
		// Fill your code here
		fruitBasketList.add(fbObj);

	}

	public int calculateBill(Stream<FruitBasket> fruitBasketStream) {

		Integer amount = fruitBasketStream.map(i -> i.getPricePerKg() * i.getWeightInKgs())
										.reduce(0, (a, b) -> a + b);
		
		return amount;
	}

}
