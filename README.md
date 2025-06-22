# Cucumber Automation Framework

This repository contains a Java-based automation framework using Cucumber, Maven, and Extent Reports. It is designed for behavior-driven development (BDD) and automated testing of applications.

## Project Structure

```
Cucumber_Automation_Framework/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/example/Main.java
│   └── test/
│       ├── java/
│       │   └── org/example/
│       │       ├── runner/TestRunner.java
│       │       └── stepdefinitions/
│       │           ├── Hooks.java
│       │           ├── InvalidPasswordSteps.java
│       │           ├── InvalidUsernameSteps.java
│       │           ├── LoginSteps.java
│       │           ├── SuccessfulLoginSteps.java
│       │           └── TestBase.java
│       └── resources/
│           ├── extent.properties
│           ├── invalid_username.feature
│           └── login.feature
└── target/
    ├── cucumber-reports.html
    ├── cucumber.json
    └── extent-report/ExtentSpark.html
```

## Features
- **BDD with Cucumber**: Write test scenarios in Gherkin syntax.
- **Step Definitions**: Java classes implementing test steps.
- **Test Runner**: Executes Cucumber tests with JUnit.
- **Reporting**: Generates Cucumber and Extent HTML reports.

## Getting Started

### Prerequisites
- Java JDK 8 or higher
- Maven 3.x

### Setup
1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd Cucumber_Automation_Framework
   ```
2. Install dependencies and build the project:
   ```sh
   mvn clean install
   ```

### Running Tests
To execute the Cucumber tests and generate reports:
```sh
mvn test
```
- Cucumber HTML report: `target/cucumber-reports.html`
- Extent report: `target/extent-report/ExtentSpark.html`

## Customization
- Add or modify feature files in `src/test/resources/`.
- Implement new step definitions in `src/test/java/org/example/stepdefinitions/`.
- Update test configuration in `extent.properties`.

## License
This project is licensed under the MIT License.

