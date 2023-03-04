package com.example.hr_app;

public class workExp {
   private long id;
   private String Title;
   private String socCode;
   private String socName;
   private String organization;
   private String industry;
   private Location location;
   private String description;
   private Dates dates;
   private occupation occupation;
    public workExp(long id, String title, String socCode, String socName, String organization,
                   String industry,Location location,String description,Dates dates,occupation occupation){
        this.id = id;
        this.Title = title;
        this.socCode = socCode;
        this.socName = socName;
        this.organization = organization;
        this.industry = industry;
        this.location=location;
        this.description=description;
        this.dates=dates;
        this.occupation=occupation;

    }

    @Override
    public String toString() {
        return
                Title + ", "+ organization + "," + industry + ".";
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return Title;
    }

    public String getSocCode() {
        return socCode;
    }

    public String getSocName() {
        return socName;
    }

    public String getOrganization() {
        return organization;
    }

    public String getIndustry() {
        return industry;
    }

    public Location getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public Dates getDates() {
        return dates;
    }

    public occupation getOccupation() {
        return occupation;
    }
}
