package com.example.hr_app;

public class Grade {
    private String Raw;
   private  String Value;
    private String Metric;
    public Grade(String raw, String value, String metric) {
        this.Raw = raw;
        this.Value = value;
        this.Metric = metric;
    }

    public String getMetric() {
        return Metric;
    }

    public String getRaw() {
        return Raw;
    }

    public String getValue() {
        return Value;
    }
}
