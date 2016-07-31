package com.gouhai.baoshan.utils;

import java.io.File;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/**
 * 
 * @author sun 2014-09-26[]
 * 操纵XML（单例模式）
 *
 */
public class XmlUtil
{
	private final static Logger logger = Logger.getLogger(XmlUtil.class);
	private static XmlUtil xmlUtil = new XmlUtil();
	private static SAXReader reader = new SAXReader();
	
	private XmlUtil()
	{
	}
	public static XmlUtil getInstance()
	{
		return xmlUtil;
	}
	/**
	 * 读取xml 返回xml document
	 * @param xml(路径)
	 * @return
	 */
	public  Document getDocumentByXMLPath(String path)
	{
		Document document=null;
		try
		{
			document = reader.read(new File(path));
		} catch (DocumentException e)
		{
			logger.error("读取xml失败。。");
		}
		return document;
	}
	
	public  Document getDocumentByXML(String xml)
	{
		Document document=null;
		try
		{
			Reader read = new  StringReader(xml);
			document = reader.read(read);
		} catch (DocumentException e)
		{
			logger.error("读取xml失败。。");
		}
		return document;
	}
	/*
	 * 获取根元素下的唯一一个元素
	 */
	public Element getUniqueElement(Document document,String qname)
	{
		Element element = null;
		if(null != document)
		{
			Element rootElement = document.getRootElement();//获取根元素
			
			element = rootElement.element(qname);
		}
		return element;
	}
	/**
	 * 获取根元素下的某一元素集合
	 * @param document
	 * @param qname
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Element> getElementsByRoot(Document document,String qname)
	{
		List<Element> elements = null;
		if(null != document)
		{
			Element rootElement = document.getRootElement();//获取根元素
			
			elements = rootElement.elements(qname);
		}
		return elements;
	}
	/**
	 * 获取某一元素下的某一元素集合
	 * @param document
	 * @param qname
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Element> getElementsByQname(Element element,String qname)
	{
		List<Element> elements = null;
		if(null != element)
		{
			elements = element.elements(qname);
		}
		return elements;
	}
	
	public String getTextByName(List<Element> elements,String propValue)
	{
		if(null != elements)
		{
			for(Element ele : elements)
			{
				if(ele.attributeValue("name").equals(propValue))
				{
					return ele.getText();
				}
			}
		}
		return null;
	}
	/**
	 * 返回map   key 为元素属性值为name的值，value为元素的内容content
	 * <property name="id">1</property>
	 * <property name="card">410727...</property>
	 * <property name="age">24</property>
	 * @param elements
	 * @return  map:{"id":1,"card":410727...,"age":24}
	 */
	public Map<String,String> getTextByNameAsMap(List<Element> elements)
	{
		Map<String,String> map = null;
		if(null != elements)
		{
			map = new HashMap<String,String>();
			for(Element ele : elements)
			{
				map.put(ele.attributeValue("name"), ele.getText());
			}
		}
		return map;
	}
	
	/**
	 * 创建Document
	 * @return
	 */
	
	public static Document createDocument()
	{
		Document document = DocumentHelper.createDocument();
		return document;
	}
	
	
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		Document doc = XmlUtil.getInstance().getDocumentByXMLPath("src/main/resources/test.xml");
		Element element = XmlUtil.getInstance().getUniqueElement(doc, "properties");
		List<Element> props = XmlUtil.getInstance().getElementsByQname(element, "property");
		Map<String,String> map  = XmlUtil.getInstance().getTextByNameAsMap(props);

		Set<String> set = map.keySet();
		
		for(String str: set)
		{
			System.out.println(str+":"+map.get(str));
		}
		//创建测试
		
//		Document doc1 = createDocument();
//		
//		doc1.addElement("root");
//		String str = doc1.asXML();
//		System.out.println(str);
	}
}
