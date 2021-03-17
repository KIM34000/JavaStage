/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *methode API REST pubmed
 * @author lina7
 */        
//import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import model.APOD;
import model.Studies;
import java.util.ArrayList;


public class StudyManager {

    private static ArrayList result;
    
    static public ArrayList get(String SubCategory, String Disease, String DB) { 
       // Studies studies = null;
        
    String apiKey = "SXfNHpIFv9oGOnRrPlMCTt37UuYeyh8Q";
            System.out.println(apiKey); 
           
            
 // Create a neat value object to hold the URL
try {
    URL url = new URL("https://eutils.ncbi.nlm.nih.gov/entrez/eutils/esearch.fcgi?db=" + DB + "&term=" + Disease + "&" + SubCategory + apiKey);
System.out.println(url);
    // Open a connection(?) on the URL(??) and cast the response(???)
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
// Now it's "open", we can set the request method, headers etc.
//*****

        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    connection.getInputStream()));
        String inputLine;
        result = new ArrayList<String>();
        while ((inputLine = in.readLine()) != null) {
            result.add(inputLine);
            System.out.println("this is inputline " + inputLine);
        }
            System.out.println(result);
        
        in.close();
//*****
//    connection.setRequestProperty ("accept", "application/json");
//// This line makes the request
//    InputStream responseStream = connection.getInputStream();
//    System.out.println ("yhk " + responseStream);
//// Manually converting the response body InputStream to APOD using Jackson
//    ObjectMapper mapper = new ObjectMapper();
//    APOD apod = mapper.readValue(responseStream, APOD.class);


} catch (MalformedURLException ex) {}
catch (IOException ex) {}
     finally { return result; }
    }
}