package sub0426.web.dispatch;

import sub0426.web.controller.HttpServletReponse;
import sub0426.web.controller.HttpServletRequest;
import sub0426.web.controller.JenyMain;
import sub0426.web.controller.MainController;
import sub0426.web.controller.member.*;

import java.util.*;

// *.jeny
public class JenyDispatch extends HttpServlet{
	private HashMap<String, MainController> map = new HashMap<String, MainController>();
	public void init() {
		map.put("/main.jeny", new JenyMain());
		map.put("/member/login.jeny", new Login());
	}
	
	public String service(HttpServletRequest req, HttpServletReponse resp) {
		MainController main1 = map.get("/main.jeny");
		main1.exec(req, resp);
		
		MainController main2 = map.get("/member/login.jeny");
		main2.exec(req, resp);
	}
}
