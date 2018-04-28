package com.haibao.utils;

import com.p6spy.engine.spy.appender.MessageFormattingStrategy;
import com.p6spy.engine.spy.appender.StdoutLogger;

public class P6spySetting extends StdoutLogger {

	@Override
	public void logText(String text) {
		super.setStrategy(new MessageFormattingStrategy() {
			@Override
			public String formatMessage(int connectionId, String now, long elapsed, String category, String prepared, String sql) {
				int idx = sql.indexOf("*/");
				if (idx > 0) {
					sql = sql.substring(idx + 3);
				}
				idx = sql.indexOf("from");
				if (idx > 0) {
					sql = sql.substring(0, idx) + "\n" + sql.substring(idx);
				}
				idx = sql.indexOf("where");
				if (idx > 0) {
					sql = sql.substring(0, idx) + "\n" + sql.substring(idx);
				}
				return sql;
			}
		});
		super.logText(text);
	}
}
