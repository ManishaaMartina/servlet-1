import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
public class Register extends HttpServlet {  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
          
String a=request.getParameter("firstName");  
String b=request.getParameter("lastName");  
String c=request.getParameter("userEmail");  
String d=request.getParameter("date");
String e=request.getParameter("time");
String f=request.getParameter("topic");
String g=request.getParameter("location");  
          
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/registeration", "root", "");  
  
PreparedStatement ps=con.prepareStatement(  
"insert into registeration values(?,?,?,?,?,?,?)");  
  
ps.setString(1,a);  
ps.setString(2,b);  
ps.setString(3,c);  
ps.setString(4,d);
ps.setString(5,e);
ps.setString(6,f);
ps.setString(7,g);  
          
int i=ps.executeUpdate();  
if(i>0){  
out.print("You are successfully registered...");  
}      
          
}catch (Exception e2) {System.out.println(e2);}  
          
out.close();  
}  
  
}  