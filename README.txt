Tomcat 7.0.54 + REST + CDI + JSON + (MySql/POI? - not yet)

1.)	Open cmd

2.)	cd <yourPath>/store_document_war

3.)	mvn clean install -DskipTests

4.)	Start Tomcat 7.0.54

5.)	(Re)deploy or copy .war to $CATALINA_HOME/webapps
	mvn clean install tomcat7:undeploy tomcat7:deploy
	
6.)	Use cUrl to run your tests	
	<yourPath>/store_document_war/src/test/resources/curl/test.curl




======================================= tbd. ====================================
tbd. Connection to MySql DB
1.)	CREATE TABLE tbd.

2.)	Add Resource to $CATALINA_HOME/conf/context.xml 

	<Resource name="jdbc/LocalDS" auth="Container" type="javax.sql.DataSource" maxActive="100"
    	maxIdle="30" maxWait="-1" username="root" password="admin"
    	driverClassName="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/document"/>    
    	
    	