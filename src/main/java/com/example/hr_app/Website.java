package com.example.hr_app;

import java.net.URL;

public class Website {
   private String link;
   private boolean isValid;
    public Website(String link) {
        this.link = link;
    }


    public String getLink() {
        return link;
    }
    public boolean getIsValid() {
        try {
            new URL(link).toURI();
            return true;
        }
        catch (Exception e) {
            return false;
        }

    }
}
