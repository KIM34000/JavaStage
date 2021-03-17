/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.ObjectProperty;


/**
 *
 * @author lina7
 */
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;


public class Studies {

    public IntegerProperty Id;
    public StringProperty Title;
    public StringProperty Author;
    public ObjectProperty PubYear;
    public StringProperty Category;
    public StringProperty SubCategory;
    public StringProperty Disease;
    public StringProperty Journal;
    public StringProperty Country;
    public StringProperty Sponsor;
    public StringProperty link;
    public StringProperty DB;

    public Studies(IntegerProperty Id, StringProperty Title, StringProperty Author, ObjectProperty PubYear, StringProperty Category, StringProperty SubCategory, StringProperty Disease, StringProperty Journal, StringProperty Country, StringProperty Sponsor, StringProperty DB) {
       
        this.Id = Id;
        this.Title = Title;
        this.Author = Author;
        this.PubYear = PubYear;
        this.Category = Category;
        this.SubCategory = SubCategory;
        this.Disease = Disease;
        this.Journal = Journal;
        this.Country = Country;
        this.Sponsor = Sponsor;
        this.DB = DB;
    }
   

    public StringProperty getSubCategory() throws MalformedURLException, IOException {
     
        return SubCategory;
    }
    
    public StringProperty getDisease() {
        return Disease;
    }

    public StringProperty getDB() {
        return DB;
    }

    public void setSubCategory(StringProperty SubCategory) {
        this.SubCategory = SubCategory;
    }

    public void setDisease(StringProperty Disease) {
        this.Disease = Disease;
    }

    public void setNomDB(StringProperty DB) {
        this.DB = DB;
    }  
//    public static void main (String args[]) {
//        String SubCategory = "Psychotherapies";
//        String Disease = "Covid-19";
//        String nomDB = "pubmed";
//        System.out.println(nomDB);
//    Studies studies = StudyManager.get(SubCategory, Disease, nomDB);
//    }
    
//mehtode pour inserter les donnees resultats dans les champs de la table etudie
//    private static class methode_insertDB {
//
//        public methode_insertDB() {
//           
//        }
//    }
   

}
