package com.practice.loanpattern;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.function.Consumer;

public class FileExporter {
	
	public File exportFile(String fileName, Consumer<Writer> contentWriter) throws Exception {
		File file = new File("export/" + fileName);
		try (Writer writer = new FileWriter(file)) {
			contentWriter.accept(writer);
			return file;
		} catch (Exception ex) {
			// TODO send email notification
			System.err.println("Gotcha!" + ex);
			throw ex;
		}
	}
}
