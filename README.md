# FizzBuzz

Impolementation of FizzBuzz with a hexagonal architecture and Spring Boot.

## Usage

```
git clone https://github.com/mibexx/fizzbuzz-hexagonal-spring.git
```

1. Clone the repository
2. Initialize the project with maven.
3. Run the application in fizzbuzz/src/main/java/de/mibexx/fizzbuzz/FizzBuzzApplication.java


## Layer

### FizzBuzz

Example how to use the module with SpringBoot.
Contains also the configuration which transformers should be used.

### Application

Contains the Spring Boot rest controller to generate the numbers and send the response.

### Domain

Contains the ports and business logic for the generator, the transform service and the transformers for Fizz, Buzz and FizzBuzz.


