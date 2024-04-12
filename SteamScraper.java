import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SteamScraper {
	public List<Game> getTopSellers(){
		List<Game> topSellers = new ArrayList<>();
	
		try {
			//connecting
			Document doc = Jsoup.connect("https://store.steampowered.com/search/?filter=topsellers").get();
			Elements gameElements = doc.select(".search_result_row");
			
			int count = 0;
			for (Element gameElement : gameElements) {
				if (count >= 10) break;
				
				String title = gameElement.select(".title").text();
				String price = gameElement.select(".discount_final_price").text();
				topSellers.add(new Game(title, price));
				count ++;
			}

		}catch (Exception e) {
		e.printStackTrace();
		}
		return topSellers;
	}

}
