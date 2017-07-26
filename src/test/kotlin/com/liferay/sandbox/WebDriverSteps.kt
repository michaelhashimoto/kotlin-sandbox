package com.liferay.sandbox;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import org.junit.Assert;

class WebDriverSteps {
	var webdriver = getWebDriver();

	@Then(value = "^I close the browser$")
	fun closeWebDriver() {
		webdriver.quit();
	}

	@When(value = "^I open a browser to \"(https?.+)\"$")
	fun open(url : String) {
		webdriver.get(url);
	}
}

fun getWebDriver() : WebDriver {
	val file = File("/opt/firefox-45/firefox");

	val firefoxProfile = FirefoxProfile();

	val firefoxBinary = FirefoxBinary(file);

	return FirefoxDriver(firefoxBinary, firefoxProfile);
}