## Waste Food Management REST API
   * Waste Food Management is a RestAPI Using Spring Boot for managing the User and non-goverments(NGOs) data. Application help to find out the ngos and  distribute the food to people in need.   
### Frameworks and Language used:
* Spring
* Spring boot
* Java
* Swagger

### Data Flow
* Controller : 
  * In this Application am used 3 controller
    * UserController
    * NgosController
    * StatusController
    
* Service
  * In this Application am used 3 Service
    * UserSerivce
    * NgosService
    * StatusService
   
* Repository
  * In this Application am used 3 Repository
    * INgosRepository
    * IUserRepository
    * IStatusRepository
  
* Database
    * I used Myslq Database In this Application.


## Project Summary 
* Waste Food Management is a RestAPI Using Spring Boot for managing the User and non-goverments(NGOs) data. Application help to find out the ngos and distribute the food to people in need.
* This project is a Weaste food Management service API that allows two types of users: Normal and Ngos users. Ngos users have the authority to perform CRUD (Create, Read, Update, and Delete) operations on Ngos Data , while normal users can find ngos based on pincode or city name and also perfrom update the data or deactive there account.
* The project structure based on MVC(Model View Controller) architecture includes a controller service and a repository, providing a clear separation of concerns and making the code more modular.
* To ensure data security and user data privacy, normal users cannot  do CRUD operations on Ngos data, and only Ngos users have the necessary permissions to perform these actions. This ensures that the API is both secure and user-friendly.


