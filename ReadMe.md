__Secure Spring Boot REST API using Basic Authentication__

__====Tools/Technologies Used===__

1. Java 11
2. Eclipse Kepler SR2
3. Spring Boot 2.2.1.RELEASE
4. Spring Security
5. PostgreSQL(PGAdmin4)
6. Postman

__===Steps to follow=====__

__Step 1: Execute SQL Scripts in PGAdmin4__

* Refer 'sqlscripts' in project source(product-master).

__Step 2: Import the project from Git repository__

* In the Project Explorer Right click 'Import' &rarr; Projects from Git &rarr; click 'Next'
* Choose 'Clone URI' click &rarr; Next and provide the URI &rarr; click Next &rarr; Click Finish.

__Step 3: To run the product master project__

* Right Click on project &rarr; Click Run &rarr;Run As Configurations &rarr; Under 'Maven Build'
set Goal as __"spring-boot:run"__ click 'Apply' &rarr; Click Run &rarr;Build successful

__Step 4: To do REST API testing use Postman__

* Rest API call with Basic Authentication &rarr;'getProductDetails'(Retrieve all product details from product table) as json response.
__URL:__ http://localhost:8082/getProductDetails.<br>
__Result:__ 200

* Rest API call without Basic Authentication &rarr;'getProductDetails'(Not Authorized).<br>
__URL:__ http://localhost:8082/getProductDetails.<br>
__Result:__ 401

* Rest API call with Basic Authentication &rarr;'getProductById' (Returns the single product by id).<br>
__URL:__ http://localhost:8082/getProductById/7.<br>
__Result:__ 200
 
* Rest API call with Basic Authentication &rarr;'getProductById' (with invalid input).<br>
__URL:__ http://localhost:8082/getProductById/232.<br>
__Result:__ 404

* Rest API call without Basic Authentication &rarr;'getProductById'.<br>
__URL:__ http://localhost:8082/getProductById/2.<br>
__Result:__ 401

__Step 5: All Test Results snapshots available in 'jsonresponse' folder.__