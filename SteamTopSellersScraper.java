import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.ArrayList;
import java.util.List;

public class SteamTopSellersScraper {
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		SteamScraper scraper = new SteamScraper();
		List<Game> topSellers = scraper.getTopSellers();
		
		for (Game game : topSellers) {
            System.out.println(game);
        }
		
	}

}
