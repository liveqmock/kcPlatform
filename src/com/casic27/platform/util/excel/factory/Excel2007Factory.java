package com.casic27.platform.util.excel.factory;

import java.io.File;
import java.io.InputStream;

import com.casic27.platform.util.excel.ExcelReader;
import com.casic27.platform.util.excel.ExcelWriter;
import com.casic27.platform.util.excel.IExcelFactory;
import com.casic27.platform.util.excel.reader.Excel2007Reader;
import com.casic27.platform.util.excel.writer.Excel2007Writer;

public class Excel2007Factory implements IExcelFactory {

	@Override
	public ExcelReader createExcelReader(File file) {
		return new Excel2007Reader(file);
	}

	@Override
	public ExcelReader createExcelReader() {
		return new Excel2007Reader();
	}

	@Override
	public ExcelReader createExcelReader(InputStream is) {
		return new Excel2007Reader(is);
	}

	@Override
	public ExcelWriter createExcelWriter() {
		return new Excel2007Writer();
	}

}
