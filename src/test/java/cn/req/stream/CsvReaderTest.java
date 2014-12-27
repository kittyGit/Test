package cn.req.stream;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CsvReaderTest {

	@Test
	public void readsHeader() {
		CsvReader csvReader = createCsvReader();
		List<String> header = csvReader.readHeader();
		assertThat(header).contains("username").contains("visited").hasSize(2);
	}

	@Test
	@SuppressWarnings("unchecked")
	public void readsRecords() {
		CsvReader csvReader = createCsvReader();
		List<List<String>> records = csvReader.readRecords();
		assertThat(records).contains(Arrays.asList("jdoe", "10"))
				.contains(Arrays.asList("kolorobot", "4")).hasSize(2);
	}

	private CsvReader createCsvReader() {
		try {
			Path path = Paths.get("src/test/resources", "sample.csv");
			Reader reader = Files.newBufferedReader(path,
					Charset.forName("UTF-8"));
			return new CsvReader(reader);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}
}
