package com.example.hr_app;

import java.util.Arrays;
import java.util.Date;
public class CV {
    private String name;
    private String[] phoneNumbers;
    private Website[] websites;
    private String[]emails;
    private String DOB;
    private Location location;
    private Languge[] languages;
    private String[] languagesCodes;
    private String objectives;
    private String summary;
    private long yearsOfExp;
    private String headShot;
    private Education[] education;
    private String profession;
    private Website LinkedIn;
    private workExp[] workExp;
    private Skill[] skills;
    private String[] certification;
    private String[] referees;
    private String[] publications;
    public CV(){}
    public CV(String name, String[] phoneNumbers, Website[] websites, String[] emails, String DOB, Location location,
              Languge[] languages, String[] languagesCodes, String objectives, String summary, int yearsOfExp, String headShot,
              Education[] education, String profession, Website linkedIn, workExp[] workExp, Skill[] skills,
              String[] certification, String[] referees, String[] publications){
        this.name = name;
        this.phoneNumbers = phoneNumbers;
        this.websites = websites;
        this.emails=emails;
        this.DOB=DOB;
        this.location=location;
        this.languages=languages;
        this.languagesCodes=languagesCodes;
        this.objectives=objectives;
        this.summary=summary;
        this.yearsOfExp=yearsOfExp;
        this.headShot=headShot;
        this.education=education;
        this.profession=profession;
        this.LinkedIn=linkedIn;
        this.workExp= workExp;
        this.skills=skills;
        this.certification=certification;
        this.referees=referees;
        this.publications=publications;
    }

    public String getName() {
        return name;
    }

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public Website[] getWebsites() {
        return websites;
    }

    public String[] getEmails() {
        return emails;
    }

    public String getDOB() {
        return DOB;
    }

    public Location getLocation() {
        return location;
    }

    public Languge[] getLanguages() {
        return languages;
    }

    public String[] getLanguagesCodes() {
        return languagesCodes;
    }

    public String getObjectives() {
        return objectives;
    }

    public String getSummary() {
        return summary;
    }

    public long getYearsOfExp() {
        return yearsOfExp;
    }

    public String getHeadShot() {
        return headShot;
    }

    public Education[] getEducation() {
        return education;
    }

    public String getProfession() {
        return profession;
    }

    public Website getLinkedIn() {
        return LinkedIn;
    }

    public workExp[] getWorkExp() {
        return workExp;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public String[] getCertification() {
        return certification;
    }

    public String[] getReferees() {
        return referees;
    }

    public String[] getPublications() {
        return publications;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumbers(String[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setWebsites(Website[] websites) {
        this.websites = websites;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setLanguages(Languge[] languages) {
        this.languages = languages;
    }

    public void setLanguagesCodes(String[] languagesCodes) {
        this.languagesCodes = languagesCodes;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setYearsOfExp(long yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public void setHeadShot(String headShot) {
        this.headShot = headShot;
    }

    public void setEducation(Education[] education) {
        this.education = education;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setLinkedIn(Website linkedIn) {
        LinkedIn = linkedIn;
    }

    public void setWorkExp(workExp[] workExp) {
        this.workExp = workExp;
    }

    public void setSkills(Skill[] skills) {
        this.skills = skills;
    }

    public void setCertification(String[] certification) {
        this.certification = certification;
    }

    public void setReferees(String[] referees) {
        this.referees = referees;
    }

    public void setPublications(String[] publications) {
        this.publications = publications;
    }

    @Override
    public String toString() {
        return "CV{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + Arrays.toString(phoneNumbers) +
                ", emails=" + Arrays.toString(emails) +
                ", DOB='" + DOB + '\'' +
                ", profession='" + profession + '\'' +
                '}'+Arrays.toString(certification)+Arrays.toString(skills);
    }
}
