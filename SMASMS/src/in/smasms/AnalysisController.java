package in.smasms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

/**
 * Servlet implementation class AnalysisController
 */
public class AnalysisController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnalysisController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @SuppressWarnings({"unchecked"})
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
    	String tickerSymbol = request.getParameter("ticker");

    	// do something to get data we need from the Amazon SimpleDB
    	
    	// encode data as JSON and write the response
		JSONObject obj = new JSONObject();

		obj.put("ticker", tickerSymbol);
		
		// TODO: DONT MAKE UP DATA!
		obj.put("negative", 26);
		obj.put("neutral", 50);
		obj.put("positive", 34);
		
		obj.put("facebook", 17);
		obj.put("twitter", 43);
		obj.put("google", 40);

		response.getWriter().println(obj);
	}

}
