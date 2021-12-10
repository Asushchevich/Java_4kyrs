package com.example.idz_12;

import java.sql.*;

public class DatabaseHandler  extends Configs{
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":"
                + dbPort + "/" + dbName;

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }
//    public void signUpUser(String idspending, String spendingOnGasoline, String consumablesCosts, String Month) throws SQLException, ClassNotFoundException {
//        String insert = "INSERT INTO " + Const.USER_TABLE + "(" +
//                Const.IDSPENDING + "," + Const.SPENDINGONGASOLINE + "," +
//                Const.CONSUMABLESCOSTS + "," + Const.MONTH +
//                ")" + "VALUES(?,?,?,?)";
//
//
//
//
//            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
//            prSt.setString(1, idspending);
//            prSt.setString(2, spendingOnGasoline);
//            prSt.setString(3, consumablesCosts);
//            prSt.setString(4, Month);
//
//            prSt.executeUpdate();
//
//        }

    public void signUpUser(String idspending, String spendingOnGasoline, String consumablesCosts, String Month) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" +
                Const.IDSPENDING + "," + Const.SPENDINGONGASOLINE + "," +
                Const.CONSUMABLESCOSTS + "," + Const.MONTH +
                ")" + "VALUES(?,?,?,?)";




            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, idspending);
            prSt.setString(2, spendingOnGasoline);
            prSt.setString(3, consumablesCosts);
            prSt.setString(4, Month);

            prSt.executeUpdate();
    }

    public void signUpUser(String text, String text1) {
    }
}
