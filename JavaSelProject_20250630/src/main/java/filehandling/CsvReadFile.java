package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CsvReadFile {

	public static void main(String[] args) throws IOException, CsvValidationException {

		CSVReader readCsv = new CSVReader(new FileReader("files/players.csv"));
		String[] nextLine;
		
		while((nextLine = readCsv.readNext())!=null)
		{
			System.out.println(nextLine[0] + "\t" + nextLine[1]  + "\t" + nextLine[2]);
		}
		readCsv.close();
	}

}
