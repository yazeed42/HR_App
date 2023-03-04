package com.example.hr_app;

public class occupation {
   private String Title;
   private String titleNormalized;
   private long managementLevel;
   private occupationClassification classification;
    public occupation(String Title, String titleNormalized, occupationClassification classification){
        this.Title=Title;
        this.titleNormalized=titleNormalized;
        this.managementLevel=managementLevel;
        this.classification=classification;

    }

    public String getTitle() {
        return Title;
    }

    public String getTitleNormalized() {
        return titleNormalized;
    }

    public long getManagementLevel() {
        return managementLevel;
    }

    public occupationClassification getClassification() {
        return classification;
    }

    public void setManagementLevel(long managementLevel) {
        this.managementLevel = managementLevel;
    }
}
