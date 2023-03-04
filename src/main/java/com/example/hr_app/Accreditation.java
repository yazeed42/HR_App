package com.example.hr_app;

public class Accreditation {
    private String education;
    private String Level;
    private String inputStr;
    private String matchStr;
    public Accreditation(String education, String Level, String inputStr, String matchStr){
        this.education = education;
        this.Level = Level;
        this.inputStr = inputStr;
        this.matchStr = matchStr;
    }

    public String getEducation() {
        return education;
    }

    public String getLevel() {
        return Level;
    }

    public String getInputStr() {
        return inputStr;
    }

    public String getMatchStr() {
        return matchStr;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public void setInputStr(String inputStr) {
        this.inputStr = inputStr;
    }

    public void setMatchStr(String matchStr) {
        this.matchStr = matchStr;
    }
}
