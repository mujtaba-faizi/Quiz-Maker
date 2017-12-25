# Quizzer
Introduction: 
Create a mobile app that fulfils these requirements. Start by designing a user entity, which holds atleast the username, password, role and score. The username and password will be used by the application to authenticate the user, while the role can be either an instructor or a student.
Instructors after logging in, should be allowed to create a Quiz by providing a short title and description for the quiz. Once a quiz has been created, the application should then allow the user to add a question (of type multiple choice, true false or numeric). All questions will be indexed with their position editable by the instructor but not their content. For each question the instructor must add a text for the question, options (4 for MCQs, 2 for True False and none for numeric), expected correct answer, and a maximum achievable score.
For students, create a view to display all quizzes and allow the user to take a particular quiz. The user attempts the quiz by providing his answers, which are matched against the correct answers and a score is calculated. At the end of the quiz, simple display the score for the user in this attempt.
Use Spring (Application Framework) and Hibernate (ORM). All the quizzes should be persistently stored in a DB and the user should be able to select any available quiz, attempt it and record his achieved score for future reference.
All functions will be made available via RESTFul Web Services (running on localhost) and the view will remain independent of the spring application (communication should be done via AJAX and JSON).
Learning: All the spring and hibernate + jdbc configurations have been understood as well as the Restful communication between the server and client.
How To Run: Create a local database by the name of “quizzer” and then use the android app to save the data accordingly.
Screenshots:
Database Entries:
 
Android Interface:
 
       


Profiling:
