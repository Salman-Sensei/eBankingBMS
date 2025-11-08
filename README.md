# 🏦 Electronics Banking Management System  
*A JavaFX-based desktop banking application for secure account and transaction management.*

---

## 📘 Overview  
**eBankingBMS** is a Java-based **Banking Management System (BMS)** built for desktop use. It allows both **clients** and **administrators** to manage banking operations through an intuitive graphical interface.  
The project follows the **Model-View-Controller (MVC)** and **Client-Server** architectural styles to ensure scalability, modularity, and maintainability.

---

## 🧩 Features

### 👤 For Clients
- User registration and secure login  
- View account balance and transaction history  
- Transfer funds to other client accounts  

### 🛠️ For Administrators
- Create, read, update, and manage client accounts (CRUD)  
- View all transactions in the system  
- Manage admin credentials and system data  

### 🧠 System Highlights
- Persistent data storage using **Microsoft SQL Server 2022**  
- JavaFX 21 GUI for a modern and responsive interface  
- Secure JDBC connections with MSSQL  
- Clean separation of layers (MVC pattern)  
- Extensible design for future online or networked deployment  

---

## 🏗️ Architecture

### 🔹 Model-View-Controller (MVC)
- **Model:** Encapsulates data and business logic; interacts with the database via DAO classes.  
- **View:** JavaFX FXML layouts define user interfaces.  
- **Controller:** Handles events, coordinates between View and Model, and updates the UI.  

### 🔹 Client-Server Design
- The **JavaFX frontend** acts as the client.  
- The **database and logic layer** act as the server-side.  
- Promotes centralized data management and security.

---

## 🧱 Database Design
- **Database:** Microsoft SQL Server (Developer Edition)  
- **Tables:**  
  - `client` – stores client details and balance  
  - `adminlogin` – stores admin credentials  
  - `transactions` – records all fund transfers  

---

## ⚙️ Design Patterns Used  

| Pattern | Type | Purpose |
|----------|------|----------|
| **Singleton** | Creational | Ensures one global instance of the Model for state consistency |
| **Factory Method** | Creational | Centralizes creation of JavaFX views and windows |
| **DAO (Data Access Object)** | Structural | Separates database logic from business logic |
| **Observer** | Behavioral | Enables automatic UI updates via JavaFX property bindings |
| **Event Listener** | Behavioral | Handles user actions (buttons, forms, events) in controllers |

---

## 🖥️ Implementation  

- **Language:** Java 21 (Azul Zulu distribution recommended)  
- **Frameworks:** JavaFX 21  
- **Build Tool:** Maven  
- **IDE:** NetBeans + Scene Builder  
- **Database:** Microsoft SQL Server 2022 + JDBC driver  

**Dependencies:**  
- FontAwesomeFX (for icons)  
- Microsoft SQL Server JDBC Driver  

---

## 🔍 Testing  

| Test Case | Description | Result |
|------------|-------------|--------|
| Login Validation | Checked valid/invalid credentials | ✅ Passed |
| Client Creation | Added and verified new client in DB | ✅ Passed |
| Fund Transfer | Tested balance update and record creation | ✅ Passed |
| Data Binding | UI auto-updates after data changes | ✅ Passed |

---

## 🚀 Future Enhancements  

- Add **input validation** (e.g., email formats, prevent negative balances)  
- Introduce **multithreading** for smooth UI during DB operations  
- Implement **password hashing** and **encryption** for sensitive data  
- Add **Delete** functionality for client removal  
- Expand to **networked deployment** for real-time online banking  

---

## 👨‍💻 Author

- [Salman Khan](https://www.linkedin.com/in/salmankhan-developer/)

---

## 🧾 References  

- [Refactoring.Guru – Singleton Pattern](https://refactoring.guru/design-patterns/singleton/java/example)  
- [Refactoring.Guru – Factory Method Pattern](https://refactoring.guru/design-patterns/factory-method)  
- [DigitalOcean – DAO Pattern](https://www.digitalocean.com/community/tutorials/dao-design-pattern)  
- [Oracle – JavaFX Event Handling](https://docs.oracle.com/javafx/2/events/handlers.htm)  
- [Microsoft – SQL Server Developer Edition](https://www.microsoft.com/en-us/sql-server)  

---

## 📎 How to Run  

1. **Clone the repository**  
   ```bash
   git clone https://github.com/Salman-Sensei/eBankingBMS.git

2. **Open the project** in **NetBeans** or your preferred IDE.  
3. **Make sure you have installed:**  
   - **JDK 21 (Azul Zulu)**  
   - **JavaFX 21 SDK**  
   - **SQL Server 2022 (Developer Edition)**  
4. **Configure your database connection** in the DAO or configuration file.  
5. **Run the application** → The login window should appear.  

