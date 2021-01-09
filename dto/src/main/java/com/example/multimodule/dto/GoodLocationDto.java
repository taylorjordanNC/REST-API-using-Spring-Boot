package com.example.multimodule.dto;

import lombok.Getter;
import lombok.Setter;

public class GoodLocationDto {
    @Getter
    @Setter
        private String name;
    @Getter
    @Setter
        private String address;
    @Getter
    @Setter
        private String city;
    @Getter
    @Setter
        private String state;
    @Getter
    @Setter
        private String category;
    @Getter
    @Setter
        private Integer covid_rating;
    @Getter
    @Setter
        private Boolean minority_owned;

    public GoodLocationDto(String name, String address, String city, String state, String category, Integer covid_rating, boolean minority_owned) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.category = category;
        this.covid_rating = covid_rating;
        this.minority_owned = minority_owned;
    }
}
