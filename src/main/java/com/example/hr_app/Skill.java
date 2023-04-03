package com.example.hr_app;

public class Skill {
   private long Id;
   private String emisId;
   private String name;
   private String lastUsed;
   private long numOfMon;
   private String type;
   private String  count;
   private String weighting;
   private skillSource[] sources;
    public Skill(long id, String emisId, String name, String lastUsed, String type,
                 String count, String weighting, skillSource[] sources) {
        this.Id = id;
        this.emisId = emisId;
        this.name = name;
        this.lastUsed = lastUsed;
        this.type = type;
        this.weighting = weighting;
        this.sources = sources;
        this.count=count;
    }

    public long getId() {
        return Id;
    }
    public String getEmisId() {
        return emisId;
    }
    public String getName() {
        return name;
    }
    public long getNumOfMon() {
        return numOfMon;
    }
    public skillSource[] getSources() {
        return sources;
    }
    public String getCount() {
        return count;
    }
    public String getLastUsed() {
        return lastUsed;
    }
    public String getType() {
        return type;
    }
    public String getWeighting() {
        return weighting;
    }
    public void setNumOfMon(long numOfMon) {
        this.numOfMon = numOfMon;
    }
    @Override
    public String toString() {
        return name+", "+type+".";
    }
}
