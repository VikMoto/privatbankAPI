package privatbankAPI;

import java.io.IOException;
import java.net.URI;

public class CurrencyTest {
    public static final String PRIVATBANK_CURRENCY = "https://api.privatbank.ua/p24api/exchange_rates?date=01.12.2014";

    public static void main(String[] args) throws IOException, InterruptedException {

        final String format = String.format("%s?userId=%d", PRIVATBANK_CURRENCY, 1);
        CurrencyExchange currencyExchange = CurrencyUtils.sendGet(URI.create(format));
        System.out.println("currencyExchange = " + currencyExchange);
    }
}


