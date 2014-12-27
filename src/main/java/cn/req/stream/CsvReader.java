package cn.req.stream;

import java.io.Reader;
import java.util.List;

public class CsvReader {

	private final Reader source;

	public CsvReader(Reader source) {
		this.source = source;
	}

	public List<String> readHeader() {
		return null;
	}

	public List<List<String>> readRecords() {
		return null;
	}

}
