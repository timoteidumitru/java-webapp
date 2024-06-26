# java-webapp

## Description
`java-webapp` is a secure and efficient web application designed to dynamically expose certain pages based on credentials provided by the user. It utilizes Java Servlets and JSP (JavaServer Pages) on the Apache Tomcat server, with Maven for project management and dependency resolution. This approach ensures a streamlined and effective development lifecycle, from initial setup to deployment.

## Features
- **Credential-based Page Filtering**: Dynamically renders pages to the user based on the provided credentials, enhancing security and user experience.
- **Efficient Session Management**: Utilizes Java Servlets for managing user sessions, ensuring secure and efficient access control.
- **User-friendly Interface**: Designed with JSP to offer a responsive and intuitive user interface.

## Prerequisites
Before proceeding, ensure you have the following requirements installed:
- Java Development Kit (JDK) version 8 or higher.
- Apache Maven, for managing project dependencies and builds.
- Apache Tomcat server, for deploying and running the web application.

## Installation and Setup
1. **Clone the repository**:
    ```bash
    git clone https://github.com/timoteidumitru/java-webapp
    cd java-webapp
    ```
2. **Build the project with Maven**:
    ```bash
    mvn clean install
    ```
3. **Deploy the WAR file to Tomcat**:
    - Navigate to the `target` directory and locate the generated `.war` file.
    - Copy this file into your Tomcat server's `webapps` directory.
    - Start the Tomcat server.

4. **Access the application**:
    - Open a web browser and navigate to `http://localhost:8080/webapp` to interact with the application.

## Usage
Use the application by navigating to the web URL and entering the required credentials. Based on the provided credentials, you will be directed to specific pages that you are authorized to view.

## Contributing
Contributions to `java-webapp` are highly appreciated, whether they are feature suggestions, bug reports, or pull requests. Feel free to contribute by:
- Opening an issue for bugs or feature requests.
- Submitting pull requests with improvements or new features.

