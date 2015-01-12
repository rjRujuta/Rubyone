import java.io.*;
public abstract class Currency {
    private String countryname;
    private String currencyname;
    Currency(String countryname,String currencyname)
    {
        this.countryname=countryname;
        this.currencyname=currencyname;
    }
    String getCurrency(String countryname)
    {
        return currencyname;
    }


}
