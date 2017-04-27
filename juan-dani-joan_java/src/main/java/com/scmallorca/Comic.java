package com.scmallorca;

import com.scmallorca.client.Price;

import java.math.BigDecimal;

public class Comic {
    private BigDecimal price;
    private String thumbnailUrl;
    private String title;

    public Comic(BigDecimal price, String thumbnailUrl, String title) {

        this.price = price;
        this.thumbnailUrl = thumbnailUrl;
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getTitle() {
        return title;
    }
}
