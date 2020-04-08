package com.service;

import java.util.List;
import org.supercsv.cellprocessor.FmtDate;
import org.supercsv.cellprocessor.ParseDouble;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;
import com.model.NewsPojo;

public class GenerateCSV {

	static void writeCSVFile(String csvFileName, List<NewsPojo> newsP) {
	    ICsvBeanWriter beanWriter = null;
	    CellProcessor[] processors = new CellProcessor[] {
	            new NotNull(), // ISBN
	            new NotNull(), // title
	            new NotNull(), // author
	            new NotNull(), // publisher
	            new FmtDate("MM/dd/yyyy"), // published date
	            new ParseDouble() // price
	    };
	 
	    try {
	        beanWriter = new CsvBeanWriter(new FileWriter(csvFileName),
	                CsvPreference.STANDARD_PREFERENCE);
	        String[] header = {"author", "category", "description", "id", "image", "language", "published", "title", "url"};
	        beanWriter.writeHeader(header);
	 
	        for (NewsPojo news : newsP) {
	            beanWriter.write(news, header, processors);
	        }
	 
	    } catch (IOException ex) {
	        System.err.println("Error writing the CSV file: " + ex);
	    } finally {
	        if (beanWriter != null) {
	            try {
	                beanWriter.close();
	            } catch (IOException ex) {
	                System.err.println("Error closing the writer: " + ex);
	            }
	        }
	    }
	}
	
	
}
