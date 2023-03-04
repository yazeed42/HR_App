package com.example.hr_app;

public class Languge {
   private String name;
   private String level;
   private String LanguageCode;

    public void setLevel(String level) {
        this.level = level;
    }

    public void setLanguageCode(String languageCode) {
        LanguageCode = languageCode;
    }

    public Languge(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public String getLanguageCode() {
        return LanguageCode;
    }
}
