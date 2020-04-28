package school;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PublicHolidayService {

    private static final String COUNTRY_CODE = "EE";
    private static final String API_URL = "https://date.nager.at/api/v2/PublicHolidays/";

    public Integer getNumberOfPublicHolidaysOnWorkingDays(ZonedDateTime startDate, ZonedDateTime endDate) {
        List<ZonedDateTime> result = new ArrayList<>();
        String composedUrl = API_URL + String.valueOf(endDate.getYear()) + "/" + COUNTRY_CODE;

        try {
            URL url = new URL(composedUrl);
            URLConnection yc = url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine;
            String dateString;

            while ((inputLine = in.readLine()) != null) {
                JSONArray arr = new JSONArray(inputLine);
                for (int i = 0; i < arr.length(); i++) {
                    JSONObject jsonObject = arr.getJSONObject(i);
                    dateString = jsonObject.getString("date");
                    LocalDate date = LocalDate.parse(dateString);
                    ZonedDateTime zonedResult = date.atStartOfDay(ZoneId.of("UTC"));
                    result.add(zonedResult);
                }

            }
            in.close();

            int holydayCount = 0;

            for (int i = 0; i < result.size(); i++) {
                if (result.get(i).isAfter(startDate.minusDays(1)) && result.get(i).isBefore(endDate)) {
                    if (result.get(i).getDayOfWeek().getValue() != 6 && result.get(i).getDayOfWeek().getValue() != 7) {
                        holydayCount++;
                    }
                }
            }

            return holydayCount;
        } catch (Exception ex) {
            // alas
        }
        return null;

    }

}