package com.example.hr_app;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Arrays;

public class HelloController {


    @FXML
    ListView<String> resumeLIst;
    @FXML
    TextField nameText;
    @FXML
    TextField phoneText;
    @FXML
    TextField emailText;
    @FXML
    TextField DOBText;
    @FXML
    TextField websiteText;
    @FXML
    TextField LIPText;
    @FXML TextField locText;
    @FXML TextArea SummaryText;
    @FXML ListView eduListView;
    @FXML ListView langListView;
    @FXML ListView objetiveListView;
    @FXML ListView cetfiListView;
    @FXML ListView PUPlistView;
    @FXML ListView workExpListview;
    @FXML ListView skillsListView;
    @FXML TextField proText;
    @FXML TextField totalText;
    public void load() throws IOException, ParseException {
        if (resumeLIst.getItems()!=null) resumeLIst.getItems().clear();
        CV[] CVs=cvGEN();

        String[] names=getnames(CVs);
        ObservableList<String> items= FXCollections.observableArrayList();
        for(String e:names){
            items.add(e);
        }

        resumeLIst.getItems().addAll(items);



    }
    public void selectCV() throws IOException, ParseException {
        clearAll();
        CV[] CVs=cvGEN();
        CV target = new CV();
        for (CV e:CVs){
            if(resumeLIst.getSelectionModel().getSelectedItem().equals(e.getName())){
                target=e;

            }
        }


        PersonalTabFiller(target);
        EduTabFiller(target);
        EduTabFiller2(target);
        WorkTabFiller(target);
        WorkTabFiller2(target);
        skilTabFiller2(target);





    }
    public void PersonalTabFiller(CV target){
        nameText.setText(target.getName());
        if(target.getPhoneNumbers()!=null&&target.getPhoneNumbers().length>0)
            phoneText.setText(target.getPhoneNumbers()[0]);
        if(target.getEmails()!=null&&target.getEmails().length>0)
            emailText.setText(target.getEmails()[0]);
        DOBText.setText(target.getDOB());
        if(target.getWebsites()!=null&&target.getWebsites().length>0)
            websiteText.setText(target.getWebsites()[0].getLink());
        LIPText.setText(target.getLinkedIn().getLink());
        if(target.getLocation()!=null)
            locText.setText(target.getLocation().toString());
        SummaryText.setText(target.getSummary());
    }
    public void EduTabFiller(CV target){
        eduListView.getItems().clear();
        cetfiListView.getItems().clear();
        PUPlistView.getItems().clear();
        langListView.getItems().clear();
        //EDucation**************************************************
        String[] edus = new String[target.getEducation().length];
        int i=0;
        for(Education e: target.getEducation()){
            edus[i]=e.toString();
            i++;
        }
        ObservableList<String> items= FXCollections.observableArrayList();
        for(String e:edus){
            items.add(e);
        }
        eduListView.getItems().addAll(items);

        //lang**************************************************
        String[] Langs = new String[target.getLanguages().length];
        int j=0;
        for(Languge e: target.getLanguages()){
            if(j>target.getLanguages().length-1)break;
            Langs[j]=e.getName();
            j++;
        }
        ObservableList<String> items2= FXCollections.observableArrayList();
        for(String e:Langs){
            items2.add(e);
        }
        langListView.getItems().addAll(items2);

    }
    public void EduTabFiller2(CV target){
        //cert**************************************************
        ObservableList<String> items= FXCollections.observableArrayList();


        for (String e : target.getCertification()) {

            items.add(e);
        }
        cetfiListView.getItems().addAll(items);
        //PUP**************************************************
        ObservableList<String> items2= FXCollections.observableArrayList();
        if (target.getPublications()!=null)
        {
            for (String e : target.getPublications()) {
                items2.add(e);
            }
        }
        PUPlistView.getItems().addAll(items2);
        //obj**************************************************
        ObservableList<String> items3= FXCollections.observableArrayList();
        if (target.getObjectives()!=null)
            items3.add(target.getObjectives());
        objetiveListView.getItems().addAll(items3);
    }
    public void WorkTabFiller(CV target) {
        proText.setText(target.getProfession());
        totalText.setText(String.valueOf(target.getYearsOfExp()));


    }
    public void WorkTabFiller2(CV target) {
        //workExp**************************************************
        String[] work = new String[target.getWorkExp().length];
        int i = 0;
        for (workExp e : target.getWorkExp()) {
            work[i] = e.toString();
            i++;
        }
        ObservableList<String> items = FXCollections.observableArrayList();
        for (String e : work) {
            items.add(e);
        }
        workExpListview.getItems().addAll(items);
    }

        public void skilTabFiller2(CV target){
        //skils**************************************************
        String[] skills = new String[target.getSkills().length];
        int j=0;
        for(Skill e: target.getSkills()){
            skills[j]=e.toString();
            j++;
        }

        ObservableList<String> items2= FXCollections.observableArrayList();
        for(String e:skills){
            items2.add(e);
        }
        skillsListView.getItems().addAll(items2);
        }

        public void clearAll(){
            nameText.clear();
                    phoneText.clear();
            emailText.clear();
                    DOBText.clear();
            websiteText.clear();
                    LIPText.clear();
            locText.clear();
                    SummaryText.clear();
            eduListView.getItems().clear();
                    langListView.getItems().clear();
            objetiveListView.getItems().clear();
                    cetfiListView.getItems().clear();
            PUPlistView.getItems().clear();
                    workExpListview.getItems().clear();
            skillsListView.getItems().clear();
                    proText.clear();
            totalText.clear();


        }






    public CV[] cvGEN() throws IOException, ParseException {
        PARSER p=new PARSER();
        int i=0;
        String[] paths=new String[]{"/Users/yazeed_42/IdeaProjects/HR_App/src/main/java/com/example/hr_app/CV Sample # 01.json",
                "/Users/yazeed_42/IdeaProjects/HR_App/src/main/java/com/example/hr_app/CV Sample # 02.json",
                "/Users/yazeed_42/IdeaProjects/HR_App/src/main/java/com/example/hr_app/CV Sample # 03.json"};
        CV[] cvList = new CV[paths.length];
        for (String e:paths){
            CV cv=p.resumeGen(e);
            cvList[i]=cv;
            i++;
        }

        return cvList;
    }
    protected String[] getnames(CV[] CVs) {
        String[] names = new String[CVs.length];
        int i = 0;
        for (CV e : CVs) {
            names[i] = e.getName();
            i++;
        }
        return names;
    }



}