package com.example.practice1;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ListenItem {
    Connection connect;
    String ConnectionResult = "";
    Boolean isSuucess = false;

    public List<Map<String>> getlist()
    {
        List<Map<String,String>> data = null;
        data = new ArrayList<Map<String,String>>();
        try{
            ConnectionHelper connectionHelper = new ConnectionHelper();
            connect = connectionHelper.conclass();
        }
    }
}
