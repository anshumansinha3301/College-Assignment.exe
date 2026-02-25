import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NewServlet3 extends HttpServlet{
  public void init(ServletConfig config) throws ServletException{
  super.init(config);
  }
  /**Process the HTTP Get request*/
  public void doPost(HttpServletRequest req,
  HttpServletResponse res) throws ServletException,
  IOException{
  String connectionURL = "jdbc:mysql://localhost:3306/medicine";
 
  Connection connection=null;
  ResultSet rs;
  res.setContentType("text/html");
  PrintWriter out = res.getWriter();
  //get the variables entered in the form

  /*String c1 = req.getParameter("t1");
  String c2 = req.getParameter("t2");
  String c3 = req.getParameter("t3");
  String c4 = req.getParameter("t4"); */

 
 String email = req.getParameter("t1");
  String name = req.getParameter("t2");
  //String c3 = req.getParameter("subject");
  //String c4 = req.getParameter("tname");
 
 
  try {
  // Load the database driver
  Class.forName("com.mysql.jdbc.Driver");
 // Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
  
  // Get a Connection to the database
 // connection = DriverManager.getConnection("jdbc:derby://localhost:1527/db1","scott","tiger");
  //Add the data into the database
   connection = DriverManager.getConnection(connectionURL, "root", "");
  String sql ="insert into aiims values (?,?)";
  //String sql ="insert into scott.abc values (?,?,?,?)";
  PreparedStatement pst =
  connection.prepareStatement(sql);
  pst.setString(1,email);
  pst.setString(2,name);
  //pst.setString(3,c3);
  //pst.setString(4,c4);


  int numRowsChanged = pst.executeUpdate();
  // show that the new account has been created
  out.println(" Hello : ");
  out.println(" '"+email+"'");
  pst.close();
  }
  catch(ClassNotFoundException e){
  out.println("Couldn't load database driver: "
  + e.getMessage());
  }
  catch(SQLException e){
  out.println("SQLException caught: "
  + e.getMessage());
  }
  catch (Exception e){
  out.println(e);
  }
  finally {
  // Always close the database connection.
  try {
  if (connection != null) connection.close();
  }
  catch (SQLException ignored){
  out.println(ignored);
  }
  }
  }
}
