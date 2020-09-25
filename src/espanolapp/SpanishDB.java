package espanolapp;



import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * this class stores the connection to the database and creates a table and
 * statements to store the score from tests in the database
 *
 * @author Jazmin Vagha 16941106
 */
public class SpanishDB {

    private static Connection conn = null;
    private static Statement stmt;
    private static ResultSet rs;
    private static final String url = "jdbc:derby:SpainishDB;create=true";
    private static String user = "spanish";
    private static String pass = "spanish";

    /**
     * this method creates the connection to the database
     */
    public void createConnection() {
        try {
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            checkTable("SCORES");
            String sql = "CREATE TABLE SCORES (score INT)";
            stmt.executeUpdate(sql);

            System.out.println("Table created.");

        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }

    /**
     * this method checks if there is an existing table with the same name as
     * created and drop it and re creates it
     *
     * @param scoreTable - this is passed in as the name of the table
     */
    private void checkTable(String scoreTable) {
        try {
            DatabaseMetaData dbmd = conn.getMetaData();
            ResultSet result = dbmd.getTables(null, null, null, null);
            Statement dropStat = null;

            while (result.next()) {
                String table = result.getString("TABLE_NAME");
                //System.out.println(table + " found.");

                if (table.compareToIgnoreCase(scoreTable) == 0) {
                    String dropTable = "DROP TABLE " + scoreTable;
                    dropStat = conn.createStatement();
                    dropStat.executeUpdate(dropTable);
                }
            }

            if (result != null) {
                result.close();
            }
            if (dropStat != null) {
                dropStat.close();
            }

        } catch (SQLException ex) {

            Logger.getLogger(SpanishDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * this method adds the store from the tests into the database
     *
     * @param score - this is passed in as the score from the test
     */
    public void add(int score) {
        String sql = "INSERT INTO SCORES(score) VALUES (" + score + ")";
        try (Statement stmtd = conn.createStatement()) {
            stmtd.executeUpdate(sql);
            System.out.println("\nScore stored.");
        } catch (SQLException ex) {
            Logger.getLogger(SpanishDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * this method checks to see if the score is saved in the database and
     * displays it
     *
     * @throws SQLException
     */
    public void checkScore() throws SQLException {
        String sql = "SELECT * FROM SCORES";
        rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int sc = rs.getInt("score");
            System.out.println("Score in database: " + sc);

        }
    }

    /**
     * this method sets the local variable connection with the parameter passed
     * in
     *
     * @param conn - this is the variable used to initialize the local variable
     */
    public void setConnection(Connection conn) {
        this.conn = conn;
    }

    /**
     * this methods gets the local variable connection and returns it
     *
     * @return Connection - returns the connection variable
     */
    public Connection getConnection() {
        return this.conn;
    }

    /**
     * this method sets the local variable statement with the parameter passed
     * in
     *
     * @param stmt - this is the variable used to initialize the local variable
     */
    public void setStatement(Statement stmt) {
        this.stmt = stmt;
    }

    /**
     * this methods gets the local variable statement and returns it
     *
     * @return Connection - returns the connection variable
     */
    public Statement getStatement() {
        return this.stmt;
    }

    /**
     * this method sets the local variable result set with the parameter passed
     * in
     *
     * @param rs - this is the variable used to initialize the local variable
     */
    public void setResultSet(ResultSet rs) {
        this.rs = rs;
    }

    /**
     * this methods gets the local variable result set and returns it
     *
     * @return Connection - returns the connection variable
     */
    public ResultSet getResultSet() {
        return this.rs;
    }

    /**
     * this method sets the local variable user with the parameter passed in
     *
     * @param user - this is the variable used to initialize the local variable
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * this methods gets the local variable user and returns it
     *
     * @return Connection - returns the connection variable
     */
    public String getUser() {
        return this.user;
    }

    /**
     * this method sets the local variable pass with the parameter passed in
     *
     * @param pass - this is the variable used to initialize the local variable
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * this methods gets the local variable pass and returns it
     *
     * @return Connection - returns the connection variable
     */
    public String getPass() {
        return this.pass;
    }

}
