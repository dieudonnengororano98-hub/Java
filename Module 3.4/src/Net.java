import java.io.*;
import java.net.*;

public class Net {
    public static void main(String[] args) {
        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);

            String line;
            boolean header = true;
            String[] columnNames = new String[0];
            int ulkoIndex = -1;
            double total = 0;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                if (header) {
                    columnNames = line.split(";");
                    header = false;

                    // find the position of the UlkoTalo column
                    for (int i = 0; i < columnNames.length; i++) {
                        if (columnNames[i].equals("UlkoTalo")) {
                            ulkoIndex = i;
                        }
                    }
                } else {
                    String[] columns = line.split(";");

                    if (columns[0].startsWith("01.01.2023")) {
                        String value = columns[ulkoIndex].replace(",", ".");
                        total = total + Double.parseDouble(value);
                        count++;
                    }
                }
            }

            reader.close();

            if (count > 0) {
                double average = total / count;
                System.out.println("Readings: " + count);
                System.out.println("Average temperature on 1.1.2023: " + average);
            } else {
                System.out.println("No readings found for 01.01.2023");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}