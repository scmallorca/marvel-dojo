package com.scmallorca;

import com.scmallorca.client.ComicResults;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpcomingComics {

    private final MarvelGateway gateway;

    public UpcomingComics(final MarvelGateway gateway) {
        this.gateway = gateway;
    }

    public List<Comic> get() throws IOException {
        return mapComics(gateway.getNextWeekComics());
    }

    private List<Comic> mapComics(ComicResults nextWeekComics) {
        return nextWeekComics.getData().getResults().stream().map(
                result ->  new Comic(BigDecimal.valueOf(result.getPrices().get(0).getPrice()),result.getThumbnail().getPath(), result.getTitle()) ).collect(Collectors.toList());
    }

}
