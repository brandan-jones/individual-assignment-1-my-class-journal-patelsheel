[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/5WDriHc7)

# Project README

## Introduction

This project is a web application that manages journal entries. 
It has been designed to address a few specific tasks and requirements. 

## Getting Started

To get started with the project, follow these steps:

1. **Project Structure:**

    - `src/` - Contains the Java source code for the project.
    - `test/` - Contains unit tests for the project.
    - `.circleci/` - Configuration files for CircleCI.

## Task 1: Add an HTML Page

The first task is to add an `index.html` page to the project.

## Task 2: Make Unit Tests Pass

The unit tests are currently failing. 
To make them pass, I performed the following steps:

### 2.1 Create a DTO

Create a Data Transfer Object (DTO) for journal entries. 
Instead of manually creating getter and setter methods, 
used Lombok annotations for automatic generation.

### 2.2 Create a Service Class

Create a service class for managing journal entries. Follow these guidelines:

- Added the `@Service` annotation to the class.
- When the `save` method is executed, store the journal entry in a collection of ArrayList.
- When the `fetchAll` method is executed, return all journal entries.

## Task 3: Add CircleCI

To ensure continuous integration and testing of the project, CircleCI has been configured. 
Followed these steps to set up CircleCI for the repository:

1. Registered my repository with CircleCI.
2. CircleCI will automatically use the provided `.circleci/config.yml` file to run tests. 


## Task 4: Do Something Extra

As part of this project, an additional feature has been implemented to enhance the user experience. 
The extra work includes an HTML page that provides detailed information about the project's tasks and features. 
This page serves as a user-friendly guide to understanding the project.

# Project Evaluation Rubric

This section outlines the evaluation criteria for the project. 
Each criterion is assigned a score out of 10 points.

- **Timeliness:**
   - Program turned in on time? (Days late: 2) 2 * 10% penalty per day: 20%

- **General:**
   - Did something extra, beyond the minimum requirements stated here: 10/10
   - IntelliJ Installed and working. .gitignore is properly configured: 10/10
   - The project builds without error. You can run the Spring Boot project and see a response in the browser by right-clicking on the Application class and selecting either Run or Debug: 10/10
   - The Spring Boot project contains a simple home page that you created, mapped to the /index or /start endpoint. The home page contains well-formatted HTML markup: all tags are properly closed and conform to XHTML Strict: 10/10
   - Unit tests pass, without altering the unit tests: 10/10
   - Service classes implement the provided interface. When declaring variables, declare them with the interface type, not class type: 10/10
   - DTOs are created properly and use Lombok annotations: 10/10
   - All work is committed and pushed to a repository on github.com: 10/10
   - CircleCI is configured properly. The last commit shows a green checkmark, indicating that everything passed: 10/10

## Conclusion

With these tasks completed, my project is up and running, passing unit tests, and integrated with CircleCI for automated testing. 
Additionally, the extra contributions will help make the project look better on the web browser. 
