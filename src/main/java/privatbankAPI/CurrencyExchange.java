package privatbankAPI;

import java.util.List;
import java.util.StringJoiner;

public class CurrencyExchange {
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(int baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getBaseCurrencyLit() {
        return baseCurrencyLit;
    }

    public void setBaseCurrencyLit(String baseCurrencyLit) {
        this.baseCurrencyLit = baseCurrencyLit;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public List<CurrencyToday> getCurrencyTodays() {
        return currencyTodays;
    }

    public void setCurrencyTodays(List<CurrencyToday> currencyTodays) {
        this.currencyTodays = currencyTodays;
    }

    private String date;
    private String bank;
    private int baseCurrency;
    private String baseCurrencyLit;
    private String exchangeRate;
    private List<CurrencyToday> currencyTodays;

    @Override
    public String toString() {
        return new StringJoiner(", ", CurrencyExchange.class.getSimpleName() + "[", "]")
                .add("date='" + date + "'")
                .add("bank='" + bank + "'")
                .add("baseCurrency=" + baseCurrency)
                .add("baseCurrencyLit='" + baseCurrencyLit + "'")
                .add("exchangeRate='" + exchangeRate + "'")
                .add("currencyTodays=" + currencyTodays)
                .toString();
    }
}
