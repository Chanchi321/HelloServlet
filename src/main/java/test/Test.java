package test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Test {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "李白";
		/*
		 * Encode方法：按照指定的字符集编码；然后将编码之后的生成的字节转换为16进制形式；
		 * 
		 * Decode方法：按照指定的字符集解码，把16进制的源码转为对应的字符；，
		 */
		String str2 = URLEncoder.encode(str,"utf-8");
		//%E6%9D%8E%E7%99%BD
		System.out.println("str2:"+str2);
		String str3 = URLDecoder.decode(str2,"utf-8");
		System.out.println("str3:"+str3);

	}

}
