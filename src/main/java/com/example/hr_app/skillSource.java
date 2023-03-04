package com.example.hr_app;

public class skillSource {
   private String section;
   private Long position;
   private Long workExpId;
    public skillSource(String section, Long position, Long workExpId){
        this.section=section;
        this.position=position;
        this.workExpId=workExpId;

    }
    public skillSource(){}

    public void setSection(String section) {
        this.section = section;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public void setWorkExpId(Long workExpId) {
        this.workExpId = workExpId;
    }

    public String getSection() {
        return section;
    }

    public Long getPosition() {
        return position;
    }

    public Long getWorkExpId() {
        return workExpId;
    }
}
