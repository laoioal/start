package empProj2.controller;

import empProj2.View;
import empProj2.dao.EmpDao;
import empProj2.vo.EmpVO;

public class Controller {
	View view;
	
	public Controller() {
		view = new View();
		view.getAll();

	}

	public static void main(String[] args) {
		new Controller();
	}

}
