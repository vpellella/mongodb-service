# mongodb-service
Spring rest services using mongodb cluster from MongoDb Atlas

## Steps to follow to get credentials for mongodb
    . Login to https://cloud.mongodb.com/
    . Create a new Cluster if you don't have any available cluster
      . Click on Create button
      . Select Shared
      . Set everything as default for free access <Optional update clustername>
      . Click on Create Cluster
    . Click on Connect available under cluster0
    . Click on Connect your application
    . Select Driver as Java & version 4.3 or Later
    . Get the URL

  
# If you don't have password please follow
  . Click on Database Access under Security
  . Click on Edit
  . Click on Edit Password
  . Update the new password and save for later
  

## GET /grocery-items/{id}
To retrieve some item from mongodb

## GET /grocery-items/dummy-item
To save some random dummy item

## POST /grocery-items
To save GroceryItem
