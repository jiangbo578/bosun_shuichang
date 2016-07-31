package com.gouhai.baoshan.utils;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * @author Rui
 */
public class ExportDocUtil {

	private static final Log logger = LogFactory.getLog(ExportDocUtil.class);

	private Configuration configuration = null;
	private Template t;
	private Map<String, Object> dataMap;

	public ExportDocUtil(String templateName) {
		configuration = new Configuration();
		configuration.setDefaultEncoding("utf-8");
		configuration.setClassForTemplateLoading(this.getClass(),
				"/doc/template/");
		try {
			t = configuration.getTemplate(templateName);
		} catch (IOException e) {
			logger.error("读取模板文件失败：", e);
		}
	}

	public ExportDocUtil setDataList(Map<String, Object> map) {
		this.dataMap = map;
		return this;
	}

	public void exportDocument(HttpServletResponse response, String fileName) {

		// System.out.println(fileName);
		response.reset();
		response.setContentType("application/octet-stream; charset=utf-8");
		response.setHeader("Content-Disposition", "attachment; filename="
				+ fileName + ".doc");
		if (dataMap == null)
			return;
		Writer out = null;
		try {
			out = response.getWriter();
			t.process(dataMap, out);
		} catch (IOException e) {
			logger.error("向客户端发送文件失败：", e);
		} catch (TemplateException e) {
			logger.error("往模板填充数据失败：", e);
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				// ...
			}
		}
	}

	public void exportDocumentEX(HttpServletResponse response, String fileName) {
		response.reset();
		response.setContentType("application/octet-stream; charset=utf-8");
		response.setHeader("Content-Disposition", "attachment; filename="
				+ fileName + ".xls");
		if (dataMap == null)
			return;
		Writer out = null;
		try {
			out = response.getWriter();
			t.process(dataMap, out);
		} catch (IOException e) {
			logger.error("向客户端发送文件失败：", e);
		} catch (TemplateException e) {
			logger.error("往模板填充数据失败：", e);
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				// ...
			}
		}
	}
}
