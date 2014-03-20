package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MockSalaryService extends HttpServlet {

	private static final long serialVersionUID = 1L;
       
    public MockSalaryService() {
        super();
    }

    private void debug(String msg) {
    	
    	System.out.println("#### " + msg);
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String funcNo = request.getParameter("funcno");
		String sno = request.getParameter("sno");
		String syear = request.getParameter("syear");
		String sign = request.getParameter("sign");
		
		debug("==============");
		debug(funcNo);
		debug(sno);
		debug(sign);
		debug(syear);
		debug("==============");
		
		response.setStatus(HttpServletResponse.SC_OK);
		PrintWriter pw = response.getWriter();
		pw.write("3080104864~2025~0~Ç··Ñ");
		pw.flush();
		pw.close();
	}

}
