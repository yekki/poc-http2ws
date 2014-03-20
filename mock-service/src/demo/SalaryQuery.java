package demo;

import javax.jws.*;

@WebService
public class SalaryQuery {

	@WebMethod
	public String getSalaryHistory(@WebParam(name="funcNo")String fucNo, @WebParam(name="sNo")String sNo, @WebParam(name="sYear")String sYear) {
		
		return "Empty";
	}
}
