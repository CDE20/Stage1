import java.util.*;
import java.util.ArrayList;
import java.util.List;
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
		this.fruitBasketList.add(fbObj);
	}

	public int calculateBill(Stream<FruitBasket> fruitBasketStream) {
		
		// Fill your code here
		List<Integer> amounts = fruitBasketStream.map(f->f.getWeightInKgs()*f.getPricePerKg()).collect(Collectors.toList());
		int total=0;
		if(amounts.isEmpty()){
		    return 0;
		}
		else{
		    for(int amt:amounts){
		        total=total+amt;
		    }
		    return total;
		}

	
	}

}
