import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FruitBasketUtility {
	private List<FruitBasket> fruitBasketList=new ArrayList<FruitBasket>();

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
		
		// Fill your code here
		int result = 0;
		List<FruitBasket> list = fruitBasketStream.collect(Collectors.toList());
		if(!list.isEmpty()) {
			for(FruitBasket f : list) {
				result += f.getPricePerKg() * f.getWeightInKgs();
			}
		}
		else
			return -1;
		return result;
	}

}
