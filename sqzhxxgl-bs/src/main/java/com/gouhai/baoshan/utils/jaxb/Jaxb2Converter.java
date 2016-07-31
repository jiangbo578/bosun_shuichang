package com.gouhai.baoshan.utils.jaxb;

import java.io.IOException;

import javax.xml.transform.Source;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;

/**
 * 
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 *
 */
public class Jaxb2Converter extends Jaxb2RootElementHttpMessageConverter {

	public Object readFromSource(Class<?> clazz, HttpHeaders headers, Source source) throws IOException {
		return super.readFromSource(clazz, headers, source);
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		String path = System.getProperty("user.dir").replace("\\", "/") + "/src/main/resources/";
		Resource resource = new FileSystemResource(path + "init.xml");
		javax.xml.transform.Source xmlSource =new javax.xml.transform.stream.StreamSource(resource.getInputStream());
		Jaxb2Converter jaxb2Converter = new Jaxb2Converter();
		HttpHeaders headers = new HttpHeaders();
		CollectionWrapper temp=(CollectionWrapper)jaxb2Converter.readFromSource(CollectionWrapper.class, headers, xmlSource);
		
		for(XmlAuthority o:temp.getAuthority()){
			System.out.println(o.getName()+"---"+o.getPath());
		}
	}
}
