package com.example.hr_app;

public class Location {
    private String PostalCode;
    private String State;
    private String Country;
    private String CountryCode;
    private String StreetNum;
    private String Street;
    private String AptNumber;
    private String City;
    public Location(String PostalCode, String State, String Country, String CountryCode,String StreetNum,String Street, String AptNumber, String City) {
        this.PostalCode = PostalCode;
        this.State = State;
        this.Country = Country;
        this.CountryCode = CountryCode;
        this.StreetNum =StreetNum;
        this.Street = Street;
        this.AptNumber = AptNumber;
        this.City = City;

    }

    public String getPostalCode() {
        return PostalCode;
    }

    public String getState() {
        return State;
    }

    public String getCountry() {
        return Country;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public String getStreetNum() {
        return StreetNum;
    }

    public String getStreet() {
        return Street;
    }

    public String getAptNumber() {
        return AptNumber;
    }

    public String getCity() {
        return City;
    }

    @Override
    public String toString() {
        return Country+", "+
                State+", "+
                City+", "+
                PostalCode+", "+
                Street+", "+
                AptNumber+".";
    }
}
