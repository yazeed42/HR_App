package com.example.hr_app;
import java.io.*;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class PARSER {
    public  CV resumeGen(String path) throws IOException, ParseException,NullPointerException {
        Object obj = new JSONParser().parse(new InputStreamReader(new FileInputStream(new File(path))));
        JSONObject jo = (JSONObject) obj;
        JSONObject jo1 = (JSONObject) jo.get("Value");
        JSONObject jo2 = (JSONObject) jo1.get("Data");
        JSONObject jo3 = (JSONObject) jo2.get("Name");
        JSONObject jo4 = (JSONObject) jo2.get("Location");
        JSONArray  ja1 = (JSONArray) jo2.get("Education");
        JSONArray  ja2 = (JSONArray) jo2.get("WorkExperience");
        JSONArray  ja3 = (JSONArray) jo2.get("Skills");
        CV cv = new CV();
        cv.setName((String) jo3.get("Raw"));
        cv.setPhoneNumbers(toStringList((JSONArray)jo2.get("PhoneNumbers")));
        cv.setWebsites(arrayToWebsite(toStringList((JSONArray)jo2.get("Websites"))));
        cv.setEmails(toStringList((JSONArray)jo2.get("Emails")));
        cv.setDOB((String) jo2.get("DateOfBirth"));
        cv.setLocation(locationParser(jo4));
        cv.setObjectives((String) jo2.get("Objective"));
        cv.setLanguages(arrayToLangs(toStringList((JSONArray)jo2.get("Languages"))));
        cv.setSummary((String) jo2.get("Summary"));
        cv.setYearsOfExp((long) jo2.get("TotalYearsExperience"));
        cv.setHeadShot((String)jo2.get("HeadShot"));
        cv.setEducation(arrayToEducation(ja1));
        cv.setProfession((String) jo2.get("Profession"));
        cv.setLinkedIn(new Website((String) jo2.get("Linkedin")));
        cv.setWorkExp(arrayToworkExp(ja2));
        cv.setSkills(arrayToSkill(ja3));
        cv.setCertification(toStringList((JSONArray)jo2.get("Certifications")));
        cv.setPublications(toStringList((JSONArray)jo2.get("Publications")));
        cv.setReferees(toStringList((JSONArray)jo2.get("Referees")));
        return cv;
    }
    private Website[] arrayToWebsite(String[]links){
        try
        {
            Website[] colection = new Website[links.length];
            int i = 0;
            for (String e : links) {
                Website element = new Website(e);
                colection[i] = element;
                i++;
            }
            return colection;
        }
        catch (NullPointerException e){
            return null;
        }
    }
    private Languge[] arrayToLangs(String[]langs){
        try
        {
            Languge[] colection = new Languge[langs.length];
            int i = 0;
            for (String e : langs) {
                Languge element = new Languge(e);
                colection[i] = element;
                i++;
            }
            return colection;
        } catch (NullPointerException e){
            return null;
        }
    }
    private Location locationParser(JSONObject loc){
        try{
            if (loc==null) throw new NullPointerException();
            Location location = new Location((String) loc.get("PostalCode"), (String) loc.get("State"),
                    (String) loc.get("Country"), (String) loc.get("CountryCode"),
                    (String) loc.get("StreetNumber"), (String) loc.get("Street"),
                    (String) loc.get("ApartmentNumber"), (String) loc.get("City"));
            return location;
        }
        catch (NullPointerException e){
            return null;
        }
    }
    private Dates datesParser(JSONObject dates){
        try{
            if (dates==null) throw new NullPointerException();
            Dates dates1 = new Dates((String) dates.get("StartDate"), (String) dates.get("CompletionDate"),
                    (Boolean) dates.get("IsCurrent"));
            return dates1;
        }
        catch (NullPointerException e){
            return null;
        }
    }
    private Education[] arrayToEducation(JSONArray edus){
        Education[] colection = new Education[edus.size()];
        int i=0;
        for(Object x:edus){
            JSONObject e= (JSONObject)x;
            JSONObject accJO= (JSONObject) e.get("Accreditation");
            JSONObject gradeJO= (JSONObject) e.get("Garde");
            JSONObject locJO= (JSONObject) e.get("Location");
            JSONObject datesJO= (JSONObject) e.get("Dates");
            Accreditation acc= new Accreditation((String) accJO.get("Education"), (String) accJO.get("EducationLevel"),
                    (String) accJO.get("InputStr"), (String) accJO.get("MatchStr"));
            Education element = new Education((long) e.get("Id"),(String) e.get("Organization"),acc,gradeParser(gradeJO),
                    locationParser(locJO),datesParser(datesJO));
            colection[i]=element;
            i++;
        }
        return colection;
    }
    private Grade gradeParser(JSONObject gradeJO){
        try{
            if (gradeJO==null) throw new NullPointerException();
            Grade grade = new Grade((String) gradeJO.get("Raw"), (String) gradeJO.get("Metric"), (String) gradeJO.get("Value"));
            return grade;
        }
        catch (NullPointerException e){
            return null;
        }
    }
    private workExp[] arrayToworkExp(JSONArray workExpArray){
        workExp[] colection = new workExp[workExpArray.size()];
        int i=0;
        for(Object x:workExpArray){
            JSONObject e= (JSONObject)x;
            JSONObject locJO= (JSONObject) e.get("Location");
            JSONObject datesJO= (JSONObject) e.get("Dates");
            JSONObject occJO= (JSONObject) e.get("Occupation");
            JSONObject occClassOJ=(JSONObject) occJO.get("Classification");
            occupationClassification occClass;
            if(occClassOJ==null)  occClass=null;
            else {
                 occClass = new occupationClassification((String) occClassOJ.get("Title"),
                        (String) occClassOJ.get("MinorGroup"), (String) occClassOJ.get("SubMajorGroup"),
                        (String) occClassOJ.get("MajorGroup"), (long) occClassOJ.get("SocCode"));
            }
            occupation occ=new occupation((String) occJO.get("JobTitle"), (String) occJO.get("JobTitleNormalized"),occClass);
            if (e.get("ManagementLevel") == null)occ.setManagementLevel(0L);
            else occ.setManagementLevel((Long) e.get("ManagementLevel"));
            workExp element=new workExp((long) e.get("Id"), (String) e.get("JobTitle"), (String) e.get("SocCode"), (String) e.get("SocName"),
                    (String) e.get("Organization"), (String) e.get("Industry"),locationParser(locJO), (String) e.get("JobDescription"),
                    datesParser(datesJO),occ);
            colection[i]=element;
            i++;
        }
        return colection;
    }
    private String[] toStringList(JSONArray ja){
        String jsonStr = ja.toString();
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            String[] list= new String[ja.size()];
            int i=0;
            ArrayList<String> list1 = objectMapper.readValue(jsonStr, ArrayList.class);
            for (Object e:list1){
                list[i]=(String) e;
                i++;
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    private Skill[] arrayToSkill(JSONArray skillArray){

        Skill[] colection = new Skill[skillArray.size()];
        int i=0;
        for(Object x:skillArray){
            JSONObject e= (JSONObject)x;
            JSONArray  s=(JSONArray)  e.get("Sources");
            Skill element=new Skill((Long) e.get("Id"), (String) e.get("EmsiId"), (String) e.get("Name"),
                    (String) e.get("LastUsed"), (String) e.get("Type"),
                    (String) e.get("count"), (String) e.get("Weighting"),SkillSourceListParser(s));
            if (e.get("NumberOfMonths") == null)element.setNumOfMon(0L);
            else element.setNumOfMon((Long) e.get("NumberOfMonths"));
            colection[i]=element;
            i++;
        }
        return colection;
    }
    private skillSource[] SkillSourceListParser(JSONArray sources){
        skillSource[] collection=new skillSource[sources.size()];
        int i =0;
        for(Object x : sources){
            JSONObject e= (JSONObject) x;
            skillSource elememt=new skillSource();
            elememt.setSection((String) e.get("Section"));
            if (e.get("Position") == null)elememt.setPosition(0L);
            else elememt.setPosition((Long) e.get("Position"));
            if (e.get("WorkExperienceId") == null)elememt.setWorkExpId(0L);
            else elememt.setWorkExpId((Long) e.get("WorkExperienceId"));
            collection[i]=elememt;
        }
        return collection;
    }



}
