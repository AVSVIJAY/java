# POSTMAN collection 

# for save 
curl --location 'http://localhost:8080/api/address' \
--header 'Content-Type: application/json' \
--data '{
"name" : "vijay",
"street": "asn college",
"pin":533201,
"city":"amalapuram"
}'

# for fetching 
curl --location 'http://localhost:8080/api/address'