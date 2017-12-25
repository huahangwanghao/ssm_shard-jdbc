package com.haohai.cms.common.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * 对于日期类的转换问题,对于传入的string类型转为Date类型
 */
public class CustomDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String datestr) {
		SimpleDateFormat sdformate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			System.out.print("进入了 ");
			return sdformate.parse(datestr);
		} catch (ParseException e) {
			// ignore
		}
		return null;
	}

}
