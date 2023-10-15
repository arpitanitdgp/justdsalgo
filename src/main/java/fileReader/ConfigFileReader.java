package fileReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;

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
	

}