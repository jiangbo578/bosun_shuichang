package com.gouhai.baoshan.test;

import java.io.File;
import java.io.UnsupportedEncodingException;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Zip;
import org.apache.tools.ant.types.FileSet;

import com.gouhai.baoshan.utils.Utils;

public class world {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Project pj = new Project();
		Zip zip = new Zip();
		zip.setProject(pj);
		zip.setZipfile(new File("F:/徐舟.zip"));
		FileSet fileSet = new FileSet();
		fileSet.setProject(pj);

		File file = new File("D:\\523966525");
		File[] subFiles = file.listFiles();
		for (int i = 0; i < subFiles.length; i++) {
			try {
				System.out.println(subFiles[i].getName());
				subFiles[i] = new File(new String(subFiles[i].getName()
						.getBytes("UTF-8"), "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		fileSet.setDir(file);// 需要打包的路径
		fileSet.setIncludes("*.doc");// 文件过滤 只 包含所有.doc文件
	    zip.setEncoding("iso-8859-1");
		zip.addFileset(fileSet);
		zip.execute();

	}

}
