Testng
======

This is small description about TestNg + mockito + powermock in action

This project describe how to use TestNG mockito and powermock in special cases. All of we know how to mock methods using mockito and test them with TestNG But in some cases it became difficult task.Every branch in this project demo different mock task

##Details about tools 
####(Can also found in pom.xml)
- testng  6.8.5
- mockito-all 1.9.5
- powermock-api-mockito 1.5.2
- powermock-module-testng 1.4.10

##Current branches and there meanings

- Tfmethod -> mock final method in ordinary class with TestNG + powermock 
- Tsmethod -> mock static method in ordinary class with TestNG + powermock 
- Tsmethod-fclass -> mock static and ordinary method in final class with TestNG + powermock 
- dp -> use dataProvider in TestNG with final method in ordinary class
- junitTest -> mock final method in ordinary class with Junit + powermock

####Mock classes 
- Adder.java , DpTest.java (src / main / java / com / power / mok /)

####Testcase 
- AdderFactoryUnitTest.java ( src / test / java / com / power / mock /)

more examples will have to come... 
Thank You
