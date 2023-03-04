package com.example.hr_app;

public class occupationClassification {
   private String Title;
   private String minorGroup;
   private String majorGroup;
   private String subMajorGroup;
    private long socCode;
    public occupationClassification(String Title, String minorGroup, String majorGroup, String subMajorGroup,long socCode){
        this.Title=Title;
        this.minorGroup=minorGroup;
        this.majorGroup=majorGroup;
        this.subMajorGroup=subMajorGroup;
        this. socCode= socCode;
    }

    public String getTitle() {
        return Title;
    }

    public String getMinorGroup() {
        return minorGroup;
    }

    public String getMajorGroup() {
        return majorGroup;
    }

    public String getSubMajorGroup() {
        return subMajorGroup;
    }

    public long getSocCode() {
        return socCode;
    }
}
