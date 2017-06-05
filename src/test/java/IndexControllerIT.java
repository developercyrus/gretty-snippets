import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class IndexControllerIT {
	
	@Test
	public void test() throws MalformedURLException, IOException {
		Document doc = Jsoup.parse(new URL("http://localhost:8083/gretty-snippets/IndexController"), 60000);
        Elements elements = doc.select("div");
        Element e = elements.get(0);

        String expected = "Hello World!";
        String actual = e.text();
        System.out.println(e.text());
        assertEquals(actual, expected);
	}
}
