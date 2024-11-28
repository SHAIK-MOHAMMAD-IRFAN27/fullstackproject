My project is to perform CRUD Fee Details 


Allow the employee of accounts department to login and create, read, update and delete fee 
details of a student. That included adding fee to student separately as well as to a certain domain 
(it would be added to all students of that particular domain).


Here when the user wants to login i generate a jwtToken which is carried out throughout the session.When the user enters the corect credentials he loggs in.
In the UI the can read the student bills,he can create a bill ,he can add a bill to student,he can add bill to a domain.
My Entities are :

1.Bills -Where the user creates a bill

2.Domain-where the domain of the student is present(before)

3.DomainBillDetails-details of the bill added to domain

4.LoginRequest: while logging in

5.Student:studentId and domainId

6.StudentBillDetails

7.StudentBills



In In my service layer i perform all the Business Logic to add the data to my database through the repository layer which is extended to the JpaRepository. Since JPA implements Hibernate,which is a ORM(object relational mapping) means when i just write the classes and keep a @Entity annotation on the top of the class ,it by itself creates the table in the database. 

In my Repository layer iam calling for APIs.Controller layer accepts the clients request and send it to the service layer.Then the service layer performs the business logic but it has no database to store the data.Repository layer is connected to the database ,through which the data is stored or fetched for checking 


In the entire process when ever we open a certain page we are carrying the jwtToken along with us.



