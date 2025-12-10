
// Weather API for the story. Each day is going to start with an opening that tells the weather to build upon the story.
// But I haven't got around to that part.


/* 

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test 
{
     HttpClient httpClient = HttpClient.newHttpClient();

        try {
            List<String> dailyConditions = fetch10DayForecast(httpClient);
            String[] forecastArray = dailyConditions.toArray(new String[0]);

            if (forecastArray.length == 0) {
                System.out.println("The weather today is not describable");
            } else {
                for (int i = 0; i < forecastArray.length; i++) {
                    System.out.printf("Day %2d: %s%n", i + 1, forecastArray[i]);
                }
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static List<String> fetch10DayForecast(HttpClient httpClient) throws IOException, InterruptedException {
        List<String> forecast = new ArrayList<>();

        try {
            String geoUrl = "https://geocoding-api.open-meteo.com/v1/search?name=Los%20Angeles&count=1&language=en&format=json";
            HttpRequest geoRequest = HttpRequest.newBuilder()
                    .uri(java.net.URI.create(geoUrl))
                    .GET()
                    .build();

            HttpResponse<String> geoResponse = httpClient.send(geoRequest, HttpResponse.BodyHandlers.ofString());
            if (geoResponse.statusCode() != 200) {
                System.err.println("GeoCoding failed with status " + geoResponse.statusCode());
                return forecast;
            }

            Pattern latPattern = Pattern.compile("\"latitude\"\\s*:\\s*([\\d.-]+)");
            Pattern lonPattern = Pattern.compile("\"longitude\"\\s*:\\s*([\\d.-]+)");
            Matcher latMatcher = latPattern.matcher(geoResponse.body());
            Matcher lonMatcher = lonPattern.matcher(geoResponse.body());

            if (!latMatcher.find() || !lonMatcher.find()) {
                System.err.println("Could not get the Latitude or Longitude from Geocode Response.");
                return forecast;
            }

            String lat = latMatcher.group(1);
            String lon = lonMatcher.group(1);

            String weatherUrl = "https://api.open-meteo.com/v1/forecast?latitude=" + lat + "&longitude=" + lon
                    + "&daily=weather_code&timezone=America/Los_Angeles&forecast_days=10";
            HttpRequest weatherRequest = HttpRequest.newBuilder()
                    .uri(java.net.URI.create(weatherUrl))
                    .GET()
                    .build();

            HttpResponse<String> weatherResponse = httpClient.send(weatherRequest, HttpResponse.BodyHandlers.ofString());
            if (weatherResponse.statusCode() != 200) {
                System.err.println("Weather forecast failed with status " + weatherResponse.statusCode());
                return forecast;
            }

            // Extract daily weather codes and map to condition strings
            Pattern codesPattern = Pattern.compile("\"weather_code\"\\s*:\\s*\\[(.*?)\\]");
            Matcher codesMatcher = codesPattern.matcher(weatherResponse.body());

            if (!codesMatcher.find()) {
                System.err.println("Could not extract weather codes from forecast response");
                return forecast;
            }

            String codesString = codesMatcher.group(1);
            // Split by comma to get individual weather codes
            String[] codes = codesString.split(",");

            for (int i = 0; i < Math.min(codes.length, 10); i++) {
                String codeStr = codes[i].trim();
                try {
                    int code = Integer.parseInt(codeStr);
                    String condition = mapWeatherCodeToCondition(code);
                    forecast.add(condition);
                } catch (NumberFormatException nfe) {
                    System.err.println("Could not parse weather code: " + codeStr);
                    forecast.add("Unknown");
                }
            }

        } catch (Exception e) {
            System.err.println("Error fetching forecast: " + e.getMessage());
            e.printStackTrace();
        }

        return forecast;
    }
    
    private static String mapWeatherCodeToCondition(int code) {
        if (code == 0) return "Sunny";
        if (code == 1 || code == 2) return "Mostly Cloudy";
        if (code == 3) return "Cloudy";
        if (code == 45 || code == 48) return "Foggy";
        if (code >= 51 && code <= 67) return "Rainy";
        if (code >= 71 && code <= 77) return "Snow";
        if (code >= 80 && code <= 82) return "Rainy";
        if (code >= 85 && code <= 86) return "Snow";
        if (code >= 95 && code <= 99) return "Thunderstorm";
        return "Partly Cloudy";
}
*/

/*
        List<Thread> threads = new ArrayList<>();

        threads.add(new thread(new));

        for (Thread t : threads) {t.start();}

        for (Thread t : threads) 
        {
            try {t.join();} 
            catch (InterruptedException e) {} 
        }
        */