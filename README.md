# swagger-codegen-maven-plugin & Feign Example

This is an example which generates server stubs through swagger
api specification.

    io.swagger.codegen.v3:swagger-codegen-maven-plugin:3.0.8
    
    swagger: "2.0"

## Configurations

1. swagger-codegen-plugin configuration


 <plugin>
     <groupId>io.swagger.codegen.v3</groupId>
     <artifactId>swagger-codegen-maven-plugin</artifactId>
     <version>3.0.8</version>
       <executions>
          <execution>
             <id>generate-swagger-spring</id>
             <phase>generate-sources</phase>
             <goals>
                 <goal>generate</goal>
             </goals>
             <configuration>
                  <language>spring</language>
                  <inputSpec>${project.build.directory}/swagger-specs/petstore.yml</inputSpec>
                  <generateApiTests>false</generateApiTests>
                  <generateSupportingFiles>false</generateSupportingFiles>
                  <configOptions>
                  <!--<java8>true</java8>-->
                  <sourceFolder>src/main/java</sourceFolder>
                  <interfaceOnly>true</interfaceOnly>
                  <!--<dateLibrary>java8</dateLibrary>-->
                  <singleContentTypes>true</singleContentTypes>
                  <import-mappings>Pet=com.swagger.microservice.testservice.Pet,Order=com.swagger.microservice.testservice.Order,Tag=com.swagger.microservice.testservice.Tag,User=com.swagger.microservice.testservice.User,Category=com.swagger.microservice.testservice.Category</import-mappings>
                  </configOptions>
             </configuration>
          </execution>
       </executions>
 </plugin>    `

2. Java Configuration


    


#### References:

http://editor.swagger.io/

https://github.com/swagger-api/swagger-codegen

