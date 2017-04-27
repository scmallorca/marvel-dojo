package com.scmallorca;

import com.scmallorca.client.ComicResults;
import com.scmallorca.client.Data;
import com.scmallorca.client.Price;
import com.scmallorca.client.Result;
import com.scmallorca.client.Thumbnail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UpcomingComicsTest {

    @Mock
    private MarvelGateway gateway;

    @InjectMocks
    private UpcomingComics upcomingComics;

    @Test
    public void should_return_comics_list_given_one_comic_response() throws IOException {
        when(gateway.getNextWeekComics()).thenReturn(createComicResult());

        assertThat(upcomingComics.get(), hasSize(1));
        assertThat(upcomingComics.get().get(0).getPrice(), is(BigDecimal.valueOf(100d)));
        assertThat(upcomingComics.get().get(0).getTitle(), is("Ironman"));
        assertThat(upcomingComics.get().get(0).getThumbnailUrl(), is("http://i.annihil.us/u/prod/marvel/i/mg/6/e0/579a46bc824f4"));
    }

    private ComicResults createComicResult() {
        final ComicResults results = new ComicResults();
        Data data = new Data();
        List<Result> dataResults = new ArrayList<>();
        Result result = new Result();
        result.setTitle("Ironman");
        Thumbnail thumbnail = new Thumbnail();
        thumbnail.setPath("http://i.annihil.us/u/prod/marvel/i/mg/6/e0/579a46bc824f4");
        result.setThumbnail(thumbnail);
        List<Price> prices = new ArrayList<>();
        Price price = new Price();
        price.setPrice(Double.valueOf(100d));
        prices.add(price);
        result.setPrices(prices);
        dataResults.add(result);
        data.setResults(dataResults);
        results.setData(data);
        return results;
    }

}