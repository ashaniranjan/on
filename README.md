# MiroProject
MiroSignup project is written in Java using Selenium and helps in validating signup feature.I have written 3 testcases based on real time scenarios. When a new user is trying to signup(I have used Random auto generated unique email Id ) for new user signup, for existing user if they try to signup it will navigate to SignIn page.Invali User scenario if wrong password has given (<8) or Terms and conditions are not accepted or invalid email id has given then it will fail the test cases with a proper message and screenshot of where it failed will be attched under reports with the testcase name as the name of the screenshot.Reports are generated using extent report.
Have used listerners and testNG framework.Log4j to write log message.

Hve used data property file to fetch URL and Data provider for Email id, password and Name. Since it was only for 3 values used @Data providers instead of Excel.

PreRequisite to run the project:

1.JRE 1.8
2. Selenium 4.1 version is  used
3.Extent Reports 
4.Log4j
5.Listeners 
6.TestNG 7.5
get all the above reporsitories from maven

To invoke code: Run the project as TestNG xml suite(right click on TestNG xml file and select Run As TestNG suite)
