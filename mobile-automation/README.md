<b><h3>Mobile-Automation Framework :</h3></b>

Mobile-Automation framework is an open-source framework for writing remote automated tests for an android application.

This framework is designed for the automation expert in such way that it will provide
all the tools and infrastructure that is needed in order for him to build automated tests for android platform.



<b><h3>The Mobile-Automation framework is comprised of the following components:</h3></b>

- Mobile-Client - this will be the main interface that will exposed for the user in order for him to write tests
- tcpServer - an apk that executes the commands made by the client on the AUT (application under test)


<b><h4>Prerequisits :</h4></b> 
download and install android sdk and the eclipse plugin. 
install maven.
verify what is the AUT's package and main activity .


<b><h3>How To Work with the Framework :</h3></b>
- Download the entire mobile automation repository
- Import all the projects into eclipse , and compile all the maven projects.
- Change the AndroidManifest.xml instrumentation element of the tcpServer project with this line :  
   &lt;instrumentation android:targetPackage="&lt;AUT_PACKAGE_NAME&gt;" android:name="org.topq.mobile.server.impl.RobotiumExecutor"/&gt; 
- Use the client mobile interface to control the AUT


