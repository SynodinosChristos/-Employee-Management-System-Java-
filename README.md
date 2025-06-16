# Employee Management System

A secure, role-based **Employee Management System** built with **Java** and **JDBC**, designed to streamline employee data handling with robust GUI forms and document export features.

## 🔧 Features

- 🔐 **Login Authentication** – Secure access for multiple user roles  
- 🔎 **Search Interface** – Intuitive filters to quickly find employee records  
- 📝 **Data Entry Forms** – Add new employee records through user-friendly GUI  
- ✏️ **Edit Functionality** – Easily update existing employee information  
- 📤 **Data Export** – Export employee data to **Excel** and **Word** formats using Apache POI  

## 💻 Tech Stack

- **Java SE**  
- **Swing (JForms)** for GUI  
- **JDBC** for MySQL database interaction  
- **Apache POI** for Word/Excel export  
- **Apache Log4j 2.19.0** for logging  
- **jCalendar** for date inputs  

## 📁 Required Libraries (Dependencies)

Make sure to include the following JARs in your project classpath:

- `mysql-connector-j-9.2.0.jar`  
- `log4j-api-2.19.0.jar`  
- `log4j-core-2.19.0.jar`  
- All Apache POI libraries:
  - `poi-<version>.jar`
  - `poi-ooxml-<version>.jar`
  - `poi-ooxml-schemas-<version>.jar`
  - `xmlbeans-<version>.jar`
  - Any other required dependencies from POI distribution
- `jCalendar.jar`

> ⚠️ **Note**: Ensure version compatibility between the libraries and your Java runtime environment.

## 🗃️ Database Schema

The application expects the following **MySQL** tables to be present:

- `autorizedusers`  
- `employees`  
- `employeephones`  
- `employeestatus`  
- `leavedays`  
- `salary`  
- `salaryhistory`  
- `sickdays`  
- `unpaidabsences`  
- `workhours`

> Can be found in the repository as db

## 🚀 Getting Started

Follow the steps below to get the project up and running:

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/employee-management-system.git
