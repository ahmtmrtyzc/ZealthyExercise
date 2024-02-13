---------------------Zealthy Testing Framework---------------------

Our goal is to create a framework to find bugs or errors in active web applications. For that reason, we used Cucumber, Junit and selenium libraries. Our framework is created through object-oriented programming. 

We create simple test scenarios for beginning. Through this framework we are able to automate the testing phase of the entire website front-end and back-end testing.

Guideline

1- Pages =  We are storing our web page elements here
2- Runners =  Here we organize test cases such as regression and smoke 
3- Steps = We are implementing our code here.
4- Testbase =  Here we carry our BaseClass which is used to create the environment for the test cases. In this way, we will open the web page and close the web page after the test is completed. Also,This class also provides us with passed or failed screenshots into the screenshots folder.
Also, we are carrying page initializer here and through OOP we can use our web element anywhere through page initializer
5- Utils =  We carry our CommonMethods here such as sendText(); click(); wait();
We have a ConfigsReader here to read our configuration properties.
We carry constants in this class and our final code will never change in the project, like our  File Paths 
Lastly, we have ExcelUtility This class provides us with the opportunity to read and write Excel documents.

6- Resources =  We carry configuration properties here.
Our feature class is here and we create our test script here.



