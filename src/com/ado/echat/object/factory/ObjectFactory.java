package com.ado.echat.object.factory;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

@SuppressWarnings({ "deprecation", "unchecked" })
public class ObjectFactory {

	private static Map<String,Object> ObjectMap=new HashMap<String,Object>();
	static { 
		File file=new File("data/beans.xml");
		SAXReader saxreader=new SAXReader();
		try {
			Document document=saxreader.read(file);
			Element root=document.getRootElement();
			List<Element> list=root.elements();
			for (Element element : list) {
				String key=element.attributeValue("id");
				String value=element.attributeValue("class");
				ObjectMap.put(key, Class.forName(value).newInstance());
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Object getObject(String key) {
		return ObjectMap.get(key);
	}
}
