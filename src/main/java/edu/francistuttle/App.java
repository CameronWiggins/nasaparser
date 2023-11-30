package edu.francistuttle;

import com.sun.syndication.feed.synd.SyndCategoryImpl;
import com.sun.syndication.feed.synd.SyndContentImpl;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndLinkImpl;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import java.io.File;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            //File feedLink = new File("C:\\Users\\cw1101046\\Desktop\\Github\\nasaparser\\src\\main\\java\\edu\\francistuttle\\nasa.xml");
            
            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedLink));

            System.out.println("Feed Title: " + feed.getTitle());
            System.out.println("Feed Link: " + feed.getLink());
            System.out.println("Feed Description: " + feed.getDescription());

            for (SyndEntry entry : (List<SyndEntry>) feed.getEntries())
            {
                System.out.println("\tEntry Title: " + entry.getTitle());
                System.out.println("\tEntry Link: " + entry.getLink());
                System.out.println("\tEntry Description: " + entry.getDescription());
            }

        } catch (Exception e) {
            // TODO: handle exception

        }
    }
}
