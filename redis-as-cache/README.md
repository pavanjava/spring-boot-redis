# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/#build-image)
* [Spring Data Redis (Access+Driver)](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#data.nosql.redis)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web)

### Guides

The following guides illustrate how to use some features concretely:

* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### This Project provides the implementation of the sprint boot redis as cache, below are details regarding cache
* CacheConfig -> Gives the full control of the cache
* @Cacheable(value = '') will give the control to cache a object
#### Note: Remaining methods are left intentionally for your implementation.
* @CachePut
* @CacheEvict
* CacheConfig per entity if needed

#### Before this tutorial please follow the Redis-as-db repository for better understanding.
