//import com.example.AccountingMangement.model.Stock;
//import com.example.AccountingMangement.repository.StockRepo;
//import org.springframework.stereotype.Repository;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Repository
//public class InMemoryStockRepo implements StockRepo {
//    private final Map<String, Stock> stocks = new HashMap<>();
//
//    @Override
//    public List<Stock> getAllItems() {
//        return new ArrayList<>(stocks.values());
//    }
//
//    @Override
//    public Stock getItemById(String id) {
//        return stocks.get(id);
//    }
//
//    @Override
//    public void addItem(Stock stock) {
//        stocks.put(stock.getId(), stock);
//    }
//
//    @Override
//    public void updateItem(Stock stock) {
//        stocks.put(stock.getId(), stock);
//    }
//}
