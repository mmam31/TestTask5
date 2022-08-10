package com.eu.modris;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class RESTConnector {

    public void login(String username, String password) throws IOException {

        URL loginEndpoint = new URL("https://engine.free.beeceptor.com/api/login");
        HttpsURLConnection myConnection =
                (HttpsURLConnection) loginEndpoint.openConnection();

    }

    public void getSportList(){

    }

    public void getSportDetails(int id){

    }

}
