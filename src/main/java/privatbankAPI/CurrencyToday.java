package privatbankAPI;

import java.util.StringJoiner;

public class CurrencyToday {
    private String baseCurrency;
    private String currency;
    private double saleRateNB;
    private double purchaseRateNB;
    private double saleRate;

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getSaleRateNB() {
        return saleRateNB;
    }

    public void setSaleRateNB(double saleRateNB) {
        this.saleRateNB = saleRateNB;
    }

    public double getPurchaseRateNB() {
        return purchaseRateNB;
    }

    public void setPurchaseRateNB(double purchaseRateNB) {
        this.purchaseRateNB = purchaseRateNB;
    }

    public double getSaleRate() {
        return saleRate;
    }

    public void setSaleRate(double saleRate) {
        this.saleRate = saleRate;
    }

    public double getPurchaseRate() {
        return purchaseRate;
    }

    public void setPurchaseRate(double purchaseRate) {
        this.purchaseRate = purchaseRate;
    }

    private double purchaseRate;

    @Override
    public String toString() {
        return new StringJoiner(", ", CurrencyToday.class.getSimpleName() + "[", "]")
                .add("baseCurrency='" + baseCurrency + "'")
                .add("currency='" + currency + "'")
                .add("saleRateNB=" + saleRateNB)
                .add("purchaseRateNB=" + purchaseRateNB)
                .add("saleRate=" + saleRate)
                .add("purchaseRate=" + purchaseRate)
                .toString();
    }
}
