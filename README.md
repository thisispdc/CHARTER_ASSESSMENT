# CHARTER_ASSESSMENT
This is an API that allows you to retrieve the reward points earned by a customer with a specific ID from a retailer's rewards program. 
The program gives customers 2 points for every dollar they spend over $100 per transaction and 1 point for every dollar spent over $50 per transaction. 
The API uses an H2 in-memory database to store information about the transactions and the reward points earned by each customer. 
If the customer does not exist, an exception will be thrown. 

1. To use the API, you will need to install an H2 database locally and configure the database settings in the application.properties file.

2. You will need postman to hit the URLs and test

3. You should also run the scrip.sql file on the H2 in-memory database to prepare test data. 

4. Once you run the script in h2, and the tables are created, run the RewardsApplication.java from /rewards/src/main/java/com/retail/rewards/RewardsApplication.java

5. Open postman and run the below URLS to test:

http://localhost:8080/customers/1001/rewards

http://localhost:8080/customers/1002/rewards
