package demouser;




import java.util.Hashtable;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Adduser {
	static String VEmail;
	static String VContinue;
	static String VPassword;
	static String VUser;
	static String VAddUser;
	static String VFullName;
	static String VUserName;
	static String VNewUserPW;
	static String VDomain;
	static String VAddUserEmail;
	static String VSaveBtn;
	static String VLogOutBtn;
	public String Email() {
		return "EMail";
	}
	public static void fetchXpath() {
		Hashtable<String, String> hash= new Hashtable<String, String>();

		try {
			
			DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=factory.newDocumentBuilder();
			org.w3c.dom.Document doc= builder.parse("C:\\Users\\somisetty_veena\\eclipse-workspace\\demoproject\\src\\test\\java\\demouser\\NewFile.xml");
			NodeList list=doc.getElementsByTagName("details");
			for(int i=0;i<list.getLength();i++) {
				Node n=(Node)list.item(i);
				System.out.println(n.getNodeName());
				Element e=(Element)n;
				hash.put("Email_xpath",e.getElementsByTagName("xpath_email").item(0).getTextContent());
				hash.put("continue_btn",e.getElementsByTagName("continue_btn").item(0).getTextContent());
				hash.put("Password_xpath",e.getElementsByTagName("xpath_password").item(0).getTextContent());
				hash.put("User_xpath",e.getElementsByTagName("xpath_user").item(0).getTextContent());
				hash.put("AddUserBtn_xpath",e.getElementsByTagName("xpath_addUserBtn").item(0).getTextContent());
				hash.put("FullName_xpath",e.getElementsByTagName("xpath_fullname").item(0).getTextContent());
				hash.put("UserName_xpath",e.getElementsByTagName("xpath_username").item(0).getTextContent());
				hash.put("AddUserPW",e.getElementsByTagName("xpath_AddUserpassword").item(0).getTextContent());
				hash.put("Domain_xpath",e.getElementsByTagName("xpath_domain").item(0).getTextContent());
				hash.put("AddUserEmail_xpath",e.getElementsByTagName("xpath_addUserEmail").item(0).getTextContent());
				hash.put("SaveBtn_xpath",e.getElementsByTagName("xpath_saveBtn").item(0).getTextContent());
				hash.put("logout_xpath",e.getElementsByTagName("xpath_logoutBtn").item(0).getTextContent());
			}
			
		}
		 catch(Exception e){ 
		        e.printStackTrace();
		    }
		 VEmail=hash.get("Email_xpath");
		 VContinue=hash.get("continue_btn");
		 VPassword=hash.get("Password_xpath");
		 VUser= hash.get("User_xpath");
		 VAddUser=hash.get("AddUserBtn_xpath");
		 VFullName=hash.get("FullName_xpath");
		 VUserName= hash.get("UserName_xpath");
		 VNewUserPW=hash.get("AddUserPW");
		 VDomain= hash.get("Domain_xpath");
		 VAddUserEmail=hash.get("AddUserEmail_xpath");
		 VSaveBtn= hash.get("SaveBtn_xpath");
		 VLogOutBtn = hash.get("logout_xpath");
		System.out.println(VEmail);
		System.out.println(VPassword);
		System.out.println(VUser);
		System.out.println(VAddUser);
		System.out.println(VFullName);
		System.out.println(VUserName);
		System.out.println(VNewUserPW);
		System.out.println(VDomain);
		System.out.println(VAddUserEmail);
		System.out.println(VSaveBtn);
		System.out.println(VLogOutBtn);
		
		
//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
//	    WebDriver driver = new ChromeDriver();
//	    driver.manage().window().maximize();
//		driver.get("https://iq1portal.fiberlink.com/emc/?#");
//		
		
	
	}

}