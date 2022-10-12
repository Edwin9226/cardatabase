*There are different types of DI
Constructor injection: : Dependencies are passed to a client class constructor.
client<-- Injector<----Service

Setter injection: Dependencies are provided through setters.

Spring Boot scans your application classes and registers classes with certain annotations
(@Service, @Repository, and @Controller) as Spring beans. These beans can then
be injected using an @Autowired annotation

It is recommended that you use  FetchType.LAZY for all associations  For the toMany relationships,