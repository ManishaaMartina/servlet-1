import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException
			{
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				int x,y,sum;
				String userName=(String)request.getParameter("user");	
				String aa=request.getParameter("a");
				String bb=request.getParameter("b");
				x=Integer.parseInt(aa);
				y=Integer.parseInt(bb);
				sum = x + y;
                out.println("The sum is" + sum);
				out.println("Hello "+userName);

			}
}
