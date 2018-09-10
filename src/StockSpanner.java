

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

class StockSpanner {


    List<Integer> prices;
    List<Integer> days
    public StockSpanner() {
        prices = new ArrayList<>();
        days = new ArrayList<>();
    }

    public int next(int price) {

        if(prices.size() == 0){
            prices.add(price);
            days.add(1);
            return 1;
        }
        else if(price < prices.get(prices.size() - 1)){
            prices.add(price);
            days.add(1);
            return 1;
        }
        else{


            int current = prices.size() - 1;
            int count = 1;

            while(current >= 0 && prices.get(current) <= price){
                count += days.get(current);
                current -= days.get(current);
            }

            prices.add(price);
            days.add(count);
            return count;


        }

    }


}
