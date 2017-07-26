Feature: WebDriverTester

Scenario: OpenURL
	When I open a browser to "https://www.google.com"
	Then I close the browser