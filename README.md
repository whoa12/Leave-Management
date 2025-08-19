## Prerequisites
- Java 17 (or your project’s version)
- Maven (if not using ./mvnw)
- Git (optional)
- MySQL 8+

  ## Database configuration
  
 - Open MySQL and create a database named employee_db
 - 
 CREATE DATABASE employee_db;

 - Update your database username & password in
  src/main/resources/application.yml:
  spring:
    datasource:
      url: jdbc:mysql://localhost:3306/employee_db
      username: your_username
      password: your_password

    jpa:
      hibernate:
        ddl-auto: update
      show-sql: true
 - Please make sure MYSQL server is running before proceeding to the next steps.



 Steps to Run

### 1. Clone the repository
``bash
git clone https://github.com/whoa12/Leave-Management.git
cd Leave-Management

### 2.   Update your database username & password in

  src/main/resources/application.yml:
  
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/employee_db
    username: your_username
    password: your_password

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true


Endpoints:
1️. Add Employee

   POST /api/add
   
   Request JSON:

   {
     "employeeId": 1,
     
     "name": "Aman Sharma",
     
     "email": "aman.sharma@example.com",
     
     "department": "IT",
     
     "joiningDate": "2024-08-01",
     
     "leaveDays": 0,
     
     "leaveBalance": 15
     
   }

2. Apply for Leave

   POST /api/apply
{
  "employeeId": 1,

  "startDate": "2025-08-21",
  
  "endDate": "2025-08-25",
  
  "reasonOfLeave": "Family function",
  
  "leaveStatus": "PENDING"
}

4. Update leave status:

   PUT /api/update
{
  "employeeId": 1,

  "status": "APPROVED"
}

6. Get Leave Balance

   GET /api/leave-balance/1

Edge cases handled:

 Applying for leave before joining date.
 
 Applying for more days than available balance.
 
 Overlapping leave requests.
 
 Employee not found.
 
 Invalid dates (e.g., end date before start date).


Improvements that can be done:

1. Employees apply for their own leave instead of HR.
2. Show project priority (High/Medium/Low) to HR with leave request so that they can take appropriate decisions.
3. Leave types can be added, like "CASUAL", "SICK LEAVE", "EMERGENCY", etc.
4. HR dashboard to see pending leaves + priorities.
5. Half Day leaves can be implemented too.





