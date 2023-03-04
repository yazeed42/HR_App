package com.example.hr_app;

public class Education {
    private long Id;
    private String Organization;
    private Accreditation accreditation;
    private Grade grade;
    private Location location;
    private Dates dates;
    public Education(long Id, String Organization, Accreditation accreditation, Grade grade, Location location, Dates dates){
        this.Id = Id;
        this.Organization=Organization;
        this.accreditation=accreditation;
        this.grade=grade;
        this.location=location;
        this.dates=dates;
    }

    public long getId() {
        return Id;
    }

    public String getOrganization() {
        return Organization;
    }

    public Accreditation getAccreditation() {
        return accreditation;
    }

    public Grade getGrade() {
        return grade;
    }

    public Location getLocation() {
        return location;
    }

    public Dates getDates() {
        return dates;
    }
    @Override
    public String toString() {
        return accreditation.getInputStr()+", "+Organization;
    }
}
