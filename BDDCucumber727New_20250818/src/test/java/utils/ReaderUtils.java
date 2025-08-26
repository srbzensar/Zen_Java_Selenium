package utils;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ReaderUtils {

	public static List<String[]> readCsv(String filePath) throws IOException, CsvException
	{
		Path path = Paths.get("src/test/resources/testdata/users.csv");
        CSVReader reader = new CSVReader(new FileReader(path.toFile()));
        return reader.readAll();
	}
	
	
}
