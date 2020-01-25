package com.practice.loanpattern.report;

import java.io.IOException;
import java.io.Writer;

public class OrderReport {
	
	public void generateOrderReport(Writer writer) throws IOException {
		writer.write("OrderID;Date\n");
	}
}
