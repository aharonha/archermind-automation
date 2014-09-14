package com.archer_mind_poc.infra;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.URL;
import java.util.Properties;
import java.util.Vector;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import jsystem.framework.system.Semaphore;
import jsystem.framework.system.SystemObject;
import jsystem.framework.system.SystemObjectImpl;

public class ApplicationContainerSystemObject extends SystemObjectImpl {

	private AppiumDriver driver;

	// protected File classpathRoot = new File(System.getProperty("user.dir"));
	// protected File appDir = new File(classpathRoot,
	// "../../../apps/ApiDemos/bin");
	protected File app; // = new File(appDir, "ApiDemos-debug.apk");

	private String platformName;

	private String platformVersion;

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getPlatformVersion() {
		return platformVersion;
	}

	public void setPlatformVersion(String platformVersion) {
		this.platformVersion = platformVersion;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	private String deviceName;

	private String appPackage;

	private String appActivity;

	public File getApp() {
		return app;
	}

	public void setApp(File app) {
		this.app = app;
	}

	public AppiumDriver getDriver() {
		return driver;
	}

	@Override
	public void init() throws Exception {

		super.init();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", deviceName);
		capabilities.setCapability("platformVersion", platformVersion);
		capabilities.setCapability("platformName", platformName);
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", appPackage);
		capabilities.setCapability("appActivity", appActivity);
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
	}
}
