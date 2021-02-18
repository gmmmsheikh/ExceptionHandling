# ExceptionHandling
Practice with different kind of Exception Handling in java


Driver.java tests out the custom exceptions made for Employee and Military Cadet

UserData.java and UserData2.java do the same thing, except UserData.java utilizes try - catch block while UserData2.java throws IOException at the top.


# Assignment:
1. Employee Class has employee name, phone number and age. Write a custom exception for Employee class and throw this custom exception if -ve number is input for age.

2. MilitaryCadet is a Java class that checks the validity of a candidate. Valid cadet is defined as someone who is not over 40 and does not weight less than 40 pounds. Define an InvalidCadetException and use this in MilitaryCadet class to handle candidate inputs.

 

3.Userdata.csv is defined as so:

First Name,Last Name,eMail,Phone
Jane,Smith,jsmith@email.com,555-555-1234
John,Doe,jdoe@email.com,555-123-4567
Jessica,Masters,jlmasters@ccsf.edu,555-000-0000

User object is defined as firstName, lastName, email and phone.

Write 2 Java programs. One called UserDataRead.java throws IOException. Build an ArrayList of User from reading the userdata.csv and print the User Objects. Another called UserDataRead2.java which does the same thing in a try/catch block.

 
