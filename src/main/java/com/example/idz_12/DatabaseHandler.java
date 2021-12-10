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
    public void collectsData(String idspending, String spendingOnGasoline, String consumablesCosts, String Month) {
        String insert = "INSERT INTO" + Const.SPENDING +"(" +
                Const.IDSPENDING + "," + Const.SPENDINGONGASOLINE + "," +
                Const.CONSUMABLESCOSTS + "," + Const.MONTH +
                ")" + "VALUES(?,?,?,?)";



        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, idspending);
            prSt.setString(1, spendingOnGasoline);
            prSt.setString(1, consumablesCosts);
            prSt.setString(1, Month);

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void collectsData(String text, String text1) {
    }
}
