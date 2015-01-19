import java.io.IOException;
import java.text.Normalizer;

import org.apache.*;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Parser {
	public static String getForm(String infinitive, int Person, int Number, String Tense) throws IOException{
		String baseURL = "http://latin.cactus2000.de/showverb.en.php?verb=";
		int formNumber = Person - 1;
		String preForm = null;
		String[] form = null;
		String urlToGo = baseURL + infinitive;
		int TenseInt;
		Document doc = Jsoup.connect(urlToGo).get();
		switch(Tense){
		case "present": TenseInt = 1;
		break;
		case "imperfect": TenseInt = 2;
		break;
		case "perfect": TenseInt = 3;
		break;
		case "pluperfect": TenseInt = 4;
		break;
		case "future perfect": TenseInt = 5;
		break;
		default: TenseInt = 0;
		break;
		}
		if(TenseInt==1){
		Elements presentIndicative = doc.select("body > table > tbody > tr:nth-child(3) > td:nth-child(2) > table:nth-child(13) > tbody > tr:nth-child(2) > td:nth-child(1) > div:nth-child(2)");
		preForm = presentIndicative.text();
		preForm = StringUtils.stripAccents(preForm);
		form = preForm.split(" ");
		if(Number==1){
			formNumber = Person + 3;
		} 
		
		}
		return form[formNumber];
	
	
	}
}
