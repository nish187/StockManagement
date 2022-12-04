package Stock_Management;


public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        StockPortfolio stockPortfolio = new StockPortfolio();
        account.debit(stockPortfolio.totalValue);
    }
}