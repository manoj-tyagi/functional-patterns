package com.practice.loanpattern;

import java.io.IOException;

import com.practice.loanpattern.report.OrderReport;
import com.practice.loanpattern.report.UserReport;

public class ClientCode {

	public static void main(String[] args) throws Exception {
		FileExporter fileExporter = new FileExporter();
		OrderReport orderWriter = new OrderReport();
		UserReport userWriter = new UserReport();

		fileExporter.exportFile("orders.csv", t -> {
			try {
				orderWriter.generateOrderReport(t);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		fileExporter.exportFile("users.csv", t -> {
			try {
				userWriter.generateUserReport(t);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}
