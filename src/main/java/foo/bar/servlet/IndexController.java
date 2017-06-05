package foo.bar.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class IndexController extends HttpServlet {	
	private static final long serialVersionUID = 1624341795050409539L;
	private static Logger logger = Logger.getLogger(IndexController.class);

	@Override
    public void init() {
    	logger.debug("init");
    }
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("say Hello!");
        
		logger.debug("say Hello!");				
	}
}
