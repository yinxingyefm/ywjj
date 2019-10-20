package com.electricity.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.electricity.entity.Datas;
import com.electricity.entity.Indexs;
import com.electricity.entity.Module;
import com.sun.javafx.collections.MappingChange.Map;
import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Test {
	
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	

	Jsonservice service=new Jsonservice();
	String chart = service.getIndexForOneModual(3,2);
	System.out.println(chart);
	
}		
	
}
