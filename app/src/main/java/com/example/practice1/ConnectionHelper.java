package com.example.practice1;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
 String userName, userPassword,ip,port,dataBase;
 @SuppressLint("NewApi")
 public Connection conclass()
 {
  ip = "ngknn.ru";
  dataBase = "ZlobinovMobile";
  userName = "33П";
  userPassword = "12357";
  StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
  StrictMode.setThreadPolicy(policy);
  Connection connection = null;
  String connectionURL = null;

  try {
   Class.forName("net.sourceforge.jtds.jdbc.Driver");
   connectionURL = "jdbc:sqlserver://" + ip + ":" + port + ";" + "databasename" + dataBase + ";user=" + userName + ";password=" + userPassword + ";";
   connection = DriverManager.getConnection(connectionURL);
  }
  catch (Exception ex)
  {
   Log.e("error", ex.getMessage());
  }
  return  connection;
 }
}
