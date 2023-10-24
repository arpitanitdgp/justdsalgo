package fileReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private static Properties properties;

	private final String configFilePath = "configs//config.properties";

	public ConfigFileReader() {

		File ConfigFile = new File(configFilePath);

		try {

			FileInputStream configFileReader = new FileInputStream(ConfigFile);

			properties = new Properties();

			try {

				properties.load(configFileReader);

				configFileReader.close();

			} catch (IOException e)

			{

				System.out.println(e.getMessage());

			}

		} catch (FileNotFoundException e)

		{

			System.out.println(e.getMessage());

			throw new RuntimeException("config.properties not found at config file path " + configFilePath);

		}

	}
	

	public  String getGlobalValue() {
		
//		properties = new Properties();
		
		String currentBrowser = properties.getProperty("browser");

		if (currentBrowser != null)

			return currentBrowser;

		else

			throw new RuntimeException("Browser not specified in the config.properties file.");

	}

	


	public String getApplicationUrl() {

		String applicationurl = properties.getProperty("url.base");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");

	}

	public String getHomePageUrl() {

		String applicationurl = properties.getProperty("url.homepage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");

	}

	public String getBrowser() {

		String browser = properties.getProperty("browser");

		if (browser != null)

			return browser;

		else

			throw new RuntimeException("browser not specified in the config.properties file.");

	}

	public String getRegisterPageUrl() {
		String applicationurl = properties.getProperty("url.registerpage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}

	public String getLoginPageUrl() {
		String applicationurl = properties.getProperty("url.loginpage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}

	public String getDSPageUrl() {
		String applicationurl = properties.getProperty("url.dspage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}

	public String getTextEditorPageUrl() {
		String applicationurl = properties.getProperty("url.texteditorpage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}
	
	public String getpracticeQuesPageUrl() {
		String applicationurl = properties.getProperty("url.practicequespage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}
	
	public String getArrayPageUrl() {
		String applicationurl = properties.getProperty("url.arraypage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}
	
	public String getlinkedlistPageUrl() {
		String applicationurl = properties.getProperty("url.listpage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}
	
	public String getListPracticeQuesPageUrl() {
		String applicationurl = properties.getProperty("url.listpracticequespage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}
	
	public String getStackPageUrl() {
		String applicationurl = properties.getProperty("url.stackpage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}
	
	public String getStackPracticeQuesPageUrl() {
		String applicationurl = properties.getProperty("url.stackpracticequespage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}
	
	public String getQueuePageUrl() {
		String applicationurl = properties.getProperty("url.queuePage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}
	
	public String getQueuePracticeQuesPageUrl() {
		String applicationurl = properties.getProperty("url.queuepracticequespage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}
	
	public String getTreePageUrl() {
		String applicationurl = properties.getProperty("url.treePage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}
	
	public String getTreePracticeQuesPageUrl() {
		String applicationurl = properties.getProperty("url.treepracticequespage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}
	
	public String getGraphPageUrl() {
		String applicationurl = properties.getProperty("url.graphPage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}
	
	public String getGraphPracticeQuesPageUrl() {
		String applicationurl = properties.getProperty("url.graphpracticequespage");

		if (applicationurl != null)

			return applicationurl;

		else

			throw new RuntimeException("Application url not specified in the config.properties file.");
	}
}