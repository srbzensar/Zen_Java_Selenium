package k.filehandling;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class BCsvReadFile {

	public static void main(String[] args) throws CsvValidationException, IOException {

		CSVReader readCsv = new CSVReader(new FileReader("files/users.csv"));
		
		String[] nextLine;
		
		while((nextLine = readCsv.readNext())!=null)
		{
			System.out.println(nextLine[0] + "\t" + nextLine[1] + "\t" + nextLine[2]);
		}
		readCsv.close();
	}

}
