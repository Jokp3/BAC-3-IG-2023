package ht.bac3;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Map;
public class TesteArticle {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Hashtable<String, String> Stock = new Hashtable<String, String>();
		Scanner lect = new Scanner(System.in);
		Stock.put("001", "STELLA");
		Stock.put("002", "JACK DANIEL");
		Stock.put("003", "MARTINI");
		Stock.put("004", "TEMBO");
	    Stock.put("005", "SIMBA");
	    Stock.put("006", "SKOL");
        Stock.put("007", "COCA");  
        Stock.put("008", "TONIC");
        Stock.put("009", "BLACK LABEL");
        Stock.put("010", "KUNG FU");
        Stock.put("011", "FANTA");
        Stock.put("012", "BORA");
        Stock.put("013", "CHICHA");
        Stock.put("014", "SAC");
        Stock.put("015", "BIG");
        Stock.put("016", "TANGA");
        Stock.put("017", "MASTER");
        Stock.put("018", "BIBLE");
        Stock.put("019", "SOUS CULLOTE");
        Stock.put("020", "DEO");
        System.out.println(" entre soit le code de l'article ou le nom de l'article : ");
        String rech = lect.next();
        for (Map.Entry mapentry : Stock.entrySet()) {
        	if (mapentry.getValue(). equals(rech)|| mapentry.equals(rech))
        		 System.out.println("cle: " + mapentry.getKey() + "| valeur : " + mapentry.getValue());
        }
	}
}