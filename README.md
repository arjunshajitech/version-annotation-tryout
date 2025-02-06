# Test JPA Version Property

## Description
This project demonstrates testing the JPA `@Version` property in a Spring Boot application. It uses a Node.js script to make concurrent API requests, showcasing how version control can handle concurrent updates.

---

##### Prerequisites
- **Java 17 or higher**  
- **Maven installed**  
- **Node.js installed**  
- **MySQL database setup**

---

##### Step 1: Clone the Repository
```bash
git clone https://github.com/arjunshajitech/version-annotation-tryout.git
cd version
```

##### Step 2: Configure MySQL Properties

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

##### Step 3: Run the Spring Boot Server

```
The server will start on http://localhost:8080.
```

##### Step 4: Navigate to version-test

```
Ensure the API endpoint http://localhost:8080/api/v1/version is accessible after the server starts.
```

##### Step 5: Install Axios

```bash
npm install axios
```

##### Step 6: Execute the Node.js Script

```bash
node script.js
```

##### Expected Outcome
```
You will see exceptions thrown on the server when concurrent updates are attempted, illustrating how the JPA @Version property handles concurrency.
```




