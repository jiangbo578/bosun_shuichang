package com.gouhai.baoshan.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;
import java.util.Map;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * 本地导出DOC
 * 
 * @author 肖得ming
 * 
 */
public class ClientDocUtil {

	private static final Log logger = LogFactory.getLog(ClientDocUtil.class);

	private Configuration configuration = null;
	private Template t;
	private Map<String, Object> dataMap;

	public ClientDocUtil(String templateName,int type) {
		configuration = new Configuration();
		configuration.setDefaultEncoding("utf-8");
		//type等于0就去找doc目录，为1去找xls目录
		if(type==0){
		 configuration.setClassForTemplateLoading(this.getClass(),"/doc/template/");
		}else{
			configuration.setClassForTemplateLoading(this.getClass(),"/xls/template/");
		}
		try {
			t = configuration.getTemplate(templateName);
		} catch (IOException e) {
			logger.error("读取模板文件失败：", e);
		}
	}

	public ClientDocUtil setDataList(Map<String, Object> map) {
		this.dataMap = map;
		return this;
	}

	/**
	 * 合并DOC 文件
	 * 
	 * @param fileList
	 *            文件名的列表
	 * @param savepaths
	 *            保存的地址
	 */
	public static void uniteDoc(List fileList, String savepaths) {
		
		if (fileList == null) {
			return;
		}
		if (fileList.size() == 0 || fileList == null) {
			return;
		}
		System.out.println(fileList.size());
		// 打开word
		ActiveXComponent app = new ActiveXComponent("Word.Application");// 启动word
		try {
			// 设置word不可见
			app.setProperty("Visible", new Variant(false));
			// 获得documents对象
			Object docs = app.getProperty("Documents").toDispatch();
			// 打开第一个文件
			Object doc = Dispatch
					.invoke((Dispatch) docs,
							"Open",
							Dispatch.Method,
							new Object[] { (String) fileList.get(0),
									new Variant(false), new Variant(true) },
							new int[3]).toDispatch();
			// 追加文件
			for (int i = 1; i < fileList.size(); i++) {
				String filelist = (String) fileList.get(i);
				Dispatch.invoke(app.getProperty("Selection").toDispatch(),
						"insertFile", Dispatch.Method, new Object[] { filelist,
								"", new Variant(false), new Variant(false),
								new Variant(false) }, new int[3]);
				Dispatch selection = Dispatch.get(app, "Selection")
						.toDispatch();
				// 定位到页脚
				// Dispatch.call(selection, "EndKey" , "6");
				// 插入分页符
				// Dispatch.call(selection, "InsertBreak",7 );
				Dispatch.call(app, "Run", new Variant("macro1"));// 在这个文档上运行宏
				//Dispatch.put(selection, "Orientation", new Variant(1));
			}
			// 保存新的word文件
			Dispatch.invoke((Dispatch) doc, "SaveAs", Dispatch.Method,
					new Object[] { savepaths, new Variant(1) }, new int[3]);
			Variant f = new Variant(false);
			Dispatch.call((Dispatch) doc, "Close", f);
		} catch (Exception e) {
			throw new RuntimeException("合并word文件出错.原因:" + e);
		} finally {
			app.invoke("Quit", new Variant[] {});
		}
	}

	public void exportDocument(String name, String uuid,int type) throws IOException {

		if (dataMap == null)
			return;
		Writer out1 = null;
		try {
			String path = com.gouhai.baoshan.utils.Utils.getBundelPath(
					"upload", "uploadPath");

			File file = new File(path + "\\downdoc\\temp\\" + uuid + "\\");
			if (!file.exists()) {
				file.mkdirs();
			}
			if(type==0){		
			file = new File(path + "\\downdoc\\temp\\" + uuid + "\\" + name+ ".doc");
			}else{
				file = new File(path + "\\downdoc\\temp\\" + uuid + "\\" + name+ ".xls");
			}
			out1 = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
			t.process(dataMap, out1);
			System.out.println("导出完毕");
		} catch (IOException e) {
			logger.error("向客户端发送文件失败：", e);
		} catch (TemplateException e) {
			logger.error("往模板填充数据失败：", e);
		} finally {
			try {
				out1.close();
			} catch (IOException e) {
				// ...
			}
		}
	}
}
