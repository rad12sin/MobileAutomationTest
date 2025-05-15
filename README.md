# 📱 Mobile Automation Framework – Appium + Java + TestNG
This project is a mobile automation framework built using Appium, Java, and TestNG, designed for testing Android and iOS applications. It supports real devices and emulators/simulators, and follows modular best practices including Page Object Model (POM), reusable utilities, and clean reporting.

# Setup:
Install Appium:
npm install -g appium
appium --version
# Start Appium Server (in separate terminal):
appium
# Clone and Build the Project:
git clone <repo-url>
cd mobile-automation-appium
mvn clean install
Configure config.properties (under /resources) with:

# ▶️ Running Tests
mvn test
You can use TestNG suites or groups for organizing test execution.

# 📊 Reports
Test results are generated using TestNG default reports (or Extent Reports if integrated).

