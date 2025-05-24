# 🚀 REST-assured API Automation Framework (POM Structure)

This project is a **REST-assured API testing framework** built using Java with **Page Object Model (POM)** design. It includes separate test classes for each request type (GET, POST, PUT, PATCH, DELETE), follows a clean modular structure, and supports easy scalability and maintenance.

---

## 📁 Project Structure

src/
├── main/
│ └── java/
│ └── api/
│ ├── endpoints/ # Contains classes for each API endpoint
│ ├── payloads/ # POJOs for request/response bodies
│ └── utilities/ # Utility classes (config, setup, etc.)
│
├── test/
│ └── java/
│ └── tests/ # Contains separate test classes per request


---

## 🧰 Technologies Used

- Java
- REST-assured
- TestNG
- Maven
- Jackson (for JSON serialization)
- Hamcrest (for assertions)

---

## ✅ Features

- 🔹 Page Object Model structure for API testing
- 🔹 Separate test class for each HTTP request type
- 🔹 JSON request/response handling using POJOs
- 🔹 Readable and maintainable code
- 🔹 Easily extensible for token/auth-based APIs
- 🔹 Response validation with status codes and body assertions

---

## 🚦 How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/restassured-pom-framework.git
   cd restassured-pom-framework
   Install Dependencies
                      : mvn clean install
   Run the Tests     : mvn test

   

   
