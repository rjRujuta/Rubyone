import java.io.*;
public class Country {
    public static void main(String[]args) throws IOException,CountryNotFoundException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String countryname=br.readLine();
        if(countryname.equals("India")) {
            Rupee rupee = new Rupee();
            System.out.println(rupee.getCurrency("India"));
        }
        else if(countryname.equals("USA")){
            Dollar dollar= new Dollar();
            System.out.println(dollar.getCurrency("USA"));
        }
        else if(countryname.equals("UK")){
            Pound pound=new Pound();
            System.out.println(pound.getCurrency("UK"));
        }
        else throw new CountryNotFoundException();

    }
}
