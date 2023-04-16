package demodevice;

import java.util.Hashtable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Adddevice {

	static String VEmail;
	static String VContinue;
	static String VPassword;
	static String VDevice;
	static String VAdddevice;
	static String VUsername;
	static String VDomain;
	static String VDeviceEmail;
	static String VSaveBtn;
	static String VsecurityCheckPW;
	static String VsecurityCheckSubmit;
	static String Vtextelement;
	public static void fetchXpath() {
		Hashtable<String, String> hash= new Hashtable<String, String>();

		try {
			
			DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=factory.newDocumentBuilder();
			org.w3c.dom.Document doc= builder.parse("C:\\Users\\somisetty_veena\\eclipse-workspace\\demoproject\\src\\test\\java\\demodevice\\Devicexml.xml");
			NodeList list=doc.getElementsByTagName("device");
			for(int i=0;i<list.getLength();i++) {
				Node n=(Node)list.item(i);
				System.out.println(n.getNodeName());
				Element e=(Element)n;
				hash.put("Email_xpath",e.getElementsByTagName("xpath_email").item(0).getTextContent());
				hash.put("continue_btn",e.getElementsByTagName("continue_btn").item(0).getTextContent());
				hash.put("Password_xpath",e.getElementsByTagName("xpath_password").item(0).getTextContent());
				hash.put("Device_xpath",e.getElementsByTagName("device_btn").item(0).getTextContent());
				hash.put("AddDeviceBtn_xpath",e.getElementsByTagName("add_devicebtn").item(0).getTextContent());
				hash.put("UserName_xpath",e.getElementsByTagName("device_username").item(0).getTextContent());
				hash.put("Domain_xpath",e.getElementsByTagName("device_domain").item(0).getTextContent());
				hash.put("AddDeviceEmail_xpath",e.getElementsByTagName("device_email").item(0).getTextContent());
				hash.put("SaveBtn_xpath",e.getElementsByTagName("device_savebtn").item(0).getTextContent());
				hash.put("xpath_securityCheckPW",e.getElementsByTagName("xpath_securityCheckPW").item(0).getTextContent());
				hash.put("xpath_securityCheckSubmit",e.getElementsByTagName("xpath_securityCheckSubmit").item(0).getTextContent());
				hash.put("text_element",e.getElementsByTagName("text_element").item(0).getTextContent());
				//hash.put("logout_xpath",e.getElementsByTagName("xpath_logoutBtn").item(0).getTextContent());
			}
			
		}
		 catch(Exception e){ 
		        e.printStackTrace();
		    }
		VEmail=hash.get("Email_xpath");
		VContinue=hash.get("continue_btn");
		VPassword=hash.get("Password_xpath");
		VDevice=hash.get("Device_xpath");
		VAdddevice=hash.get("AddDeviceBtn_xpath");
		VUsername=hash.get("UserName_xpath");
		VDomain=hash.get("Domain_xpath");
		VDeviceEmail=hash.get("AddDeviceEmail_xpath");
		VSaveBtn=hash.get("SaveBtn_xpath");
		VsecurityCheckPW=hash.get("xpath_securityCheckPW");
		VsecurityCheckSubmit=hash.get("xpath_securityCheckSubmit");
		Vtextelement=hash.get("text_element");
		System.out.println(VEmail);
		
		
		
		
	}
}
