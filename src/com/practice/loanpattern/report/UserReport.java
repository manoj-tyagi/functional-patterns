package com.practice.loanpattern.report;

import java.io.IOException;
import java.io.Writer;

public class UserReport {

	public void generateUserReport(Writer writer) throws IOException {
		writer.write("Username;FirstName;LastName\n");
	}
}
