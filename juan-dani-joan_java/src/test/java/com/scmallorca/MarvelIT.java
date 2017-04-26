package com.scmallorca;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class MarvelIT {
    private UpcomingComics upcomingComics;

    @Before
    public void init() {
        upcomingComics = new UpcomingComics(new MarvelGateway());
    }

    @Test
    public void shouldReturnComicsList() throws IOException {
        assertThat(upcomingComics.get().size(), is(greaterThan(0)));
    }
}
