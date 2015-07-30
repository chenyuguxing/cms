package com.soarcms.cms.template;


public class CmsModuleGenerator {
	private static String packName = "com.soarcms.cms.template";
	private static String fileName = "soarcms.properties";

	public static void main(String[] args) {
		new ModuleGenerator(packName, fileName).generate();
	}
}
