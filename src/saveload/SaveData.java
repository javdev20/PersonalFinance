package saveload;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class SaveData {

    private static SaveData instance;
    private List<Article> articles = new ArrayList();
    private List<Currency> currencies = new ArrayList();
    private List<Account> accounts = new ArrayList();
    private List<Transaction> transactions = new ArrayList();
    private List<Transfer> transfers = new ArrayList();

    private SaveData() {

    }

    public static SaveData getInstance() {
        if (instance == null) instance = new SaveData();
        return instance;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public List<Transfer> getTransfers() {
        return transfers;
    }

    public void setArticles(List<Article> articles) {
        if (articles != null) this.articles = articles;
    }

    public void setCurrencies(List<Currency> currencies) {
        if (currencies != null) this.currencies = currencies;
    }

    public void setAccounts(List<Account> accounts) {
        if (accounts != null) this.accounts = accounts;
    }

    public void setTransactions(List<Transaction> transactions) {
        if (transactions != null) this.transactions = transactions;
    }

    public void setTransfers(List<Transfer> transfers) {
        if (transfers != null) this.transfers = transfers;
    }

    public Currency getBaseCurrency() {
        for (Currency c : currencies)
            if (c.isBase()) return c;
        return new Currency();
    }
}
