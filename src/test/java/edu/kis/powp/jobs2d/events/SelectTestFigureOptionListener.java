package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private int option;

	public SelectTestFigureOptionListener(DriverManager driverManager, int option) {
		this.driverManager = driverManager;
		this.option = option;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(option == 0){
			FiguresJoe.figureScript1(driverManager.getCurrentDriver());
		}
		else{
			FiguresJoe.figureScript2(driverManager.getCurrentDriver());
		}
	}
}
