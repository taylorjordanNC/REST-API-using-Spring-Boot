package com.example.multimodule.repository;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "good_locations")
public class GoodLocation {
        @Getter
        @Setter
        private Integer _id;
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
        private String zipcode;
        @Getter
        @Setter
        private Double lat;
        @Getter
        @Setter
        private Double lng;
        @Getter
        @Setter
        private String phone_number;
        @Getter
        @Setter
        private String website;
        @Getter
        @Setter
        private String category;
        @Getter
        @Setter
        private Integer covid_rating;
        @Getter
        @Setter
        private boolean minority_owned;

        public GoodLocation(){ }

        public GoodLocation(Integer _id, String name, String address, String city, String state, String zipcode, Double lat, Double lng, String phone_number, String website, String category, Integer covid_rating, boolean minority_owned) {
        this._id = _id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.lat = lat;
        this.lng = lng;
        this.phone_number = phone_number;
        this.website = website;
        this.category = category;
        this.covid_rating = covid_rating;
        this.minority_owned = minority_owned;
    }

    @Override
    public String toString() {
        return "GoodLocation{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber='" + phone_number + '\'' +
                ", website='" + website + '\'' +
                ", category='" + category + '\'' +
                ", covid rating(1-5)=" + covid_rating +
                ", minority owned(T/F)='" + minority_owned + '\'' +
                '}';
    }
}

