package database;

/**
 * Created by rpalacios on 11/11/15.
 */

import core.AutomationSetUp;
import database.tables.Environment;
import org.apache.log4j.Logger;

import java.sql.*;

public class Database extends AutomationSetUp
{

   Logger logger = Logger.getLogger(this.getClass());

   public Connection connection()
    {

        Connection connection = null;

        try
        {
            String userName = "root";
            String password = "Password1";
            String url = "jdbc:mysql://localhost/MySQLAutomation";
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            connection = DriverManager.getConnection (url, userName, password);
            logger.info("Database connection established");
        }
        catch (Exception e)
        {
            logger.error("Cannot connect to database server");
        }
        return connection;
    }

    public Object get(Class cl, int id) throws SQLException {
        Statement s =  connection().createStatement();
        s.executeQuery("SELECT * FROM "+cl.getSimpleName()+" where id="+id);
        ResultSet rs = s.getResultSet();
        Environment e = new Environment();
        int count = 0;

        while (rs.next()) {
            e.setId(rs.getInt("id"));
            e.setName(rs.getString("name"));
            e.setUrl(rs.getString("url"));

            int idVal = rs.getInt("id");
            String nameVal = rs.getString("name");
            String urlVal = rs.getString("url");
            /*System.out.println(
                    "id = " + idVal
                            + ", name = " + nameVal
                            + ", url = " + urlVal);
            */++count;
        }
        rs.close();
        s.close();
        //System.out.println(count + " rows were retrieved");
        return e;
    }

    public Object get(String query) throws SQLException {
        Statement s =  connection().createStatement();
        s.executeQuery(query);
        ResultSet rs = s.getResultSet();
        Environment e = new Environment();
        int count = 0;

        while (rs.next()) {
            e.setId(rs.getInt("id"));
            e.setName(rs.getString("name"));
            e.setUrl(rs.getString("url"));

            int idVal = rs.getInt("id");
            String nameVal = rs.getString("name");
            String urlVal = rs.getString("url");
            /*System.out.println(
                    "id = " + idVal
                            + ", name = " + nameVal
                            + ", url = " + urlVal);
            */++count;
        }
        rs.close();
        s.close();
        //System.out.println(count + " rows were retrieved");
        return e;
    }
}