import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class Main {

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] args) throws IOException {
        String website = urlToString("http://erdani.com/tdpl/hamlet.txt")
	    System.out.println(website);

	    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	    System.out.println("We just printed loads of garbage up here. Type a word to see how many times it showed up.");
	    String toFind = br.readLine();
	    String current = "";
	    for ( long i = 0L; i < website.length(); i++){
	        if (website.charAt(i) == ' ') {
	            if (current.equals(toFind)) {

                }
            }
        }
    }
}
