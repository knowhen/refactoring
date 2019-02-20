package com.when.refactoring.chapter4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class FileReaderTest {

	private FileReader input;

	/**
	 * Create related objects
	 **/
	@Before
	public void setUp() {
		try {
			input = new FileReader("E:\\refactoring\\src\\main\\resources\\test-fixture.txt");
		} catch (FileNotFoundException e) {
			//throw new RuntimeException("Unable to open test file");
			throw new RuntimeException(e.getMessage());
		}
	}

	@Test
	public void testRead() throws IOException {
		char ch = '&';
		for (int i = 0; i < 4; i++) {
			ch = (char) input.read();
		}
		assert ('d' == ch);
	}

	@Test
	public void testReadAtEnd() throws IOException {
		int ch = -1234;
		for (int i = 0; i < 138; i++) {
			ch = input.read();
		}
		assertEquals(-1, input.read());
	}

	@Test
	public void testReadBoundaries() throws IOException {
		assertEquals("Read first char", 'B', input.read());
		int ch;
		for (int i = 0; i < 136; i++) {
			ch = input.read();
		}
		assertEquals("Read last char", '6', input.read());
		assertEquals("Read at end", -1, input.read());
		assertEquals("Read past end", -1, input.read());
	}

	@Test
	public void testEmptyRead() throws IOException {
		File empty = new File("empty.txt");
		FileOutputStream output = new FileOutputStream(empty);
		output.close();
		FileReader input = new FileReader(empty);
		assertEquals(-1, input.read());
	}

	/**
	 * Delete sample objects
	 **/
	@After
	public void tearDown() {
		try {
			input.close();
		} catch (IOException e) {
			throw new RuntimeException("Error on closing test file");
		}
	}

}