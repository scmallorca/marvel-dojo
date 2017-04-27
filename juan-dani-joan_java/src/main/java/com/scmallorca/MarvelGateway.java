package com.scmallorca;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.scmallorca.client.ComicResults;
import org.apache.commons.io.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class MarvelGateway {
    public ComicResults getNextWeekComics() throws IOException {
            URL url = new URL("http://gateway.marvel.com/v1/public/comics?dateDescriptor=nextWeek&ts=987&apikey=97f295907072a970c5df30d73d1f3816&hash=abfa1c1d42a73a5eab042242335d805d");
            String output = IOUtils.toString(url, "UTF-8");
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(output, ComicResults.class);
    }
}
