# FlyingSaucer as a Service

Simple REST service that transforms an html document to PDF using the excelent FlyingSaucer library.

This project is built with Java and Spring Boot so you can run it with:

```sh
mvn spring-boot:run
```

Make a simple request:

```sh
curl -X POST -H "Content-Type: application/json" -d '{"value": "<p>Hello world</p>"}' http://localhost:8080/convert

{"value":"JVBERi0xLjQKJeLjz9MKMyAwIG9iago8PC9GaWx0ZXIvRmxhdGVEZWNvZGUvTGVuZ3RoIDEzNj4+c3RyZWFtCnicVY4xC8IwFIT3+xU36hLzGpPoKigiOBQCDuIWtZTU0i79+yYtDnLLx93j3Q04BGj6fcUQcQyoMUArbbzlhIqXHLYQzSvuD80I4+itYwfrF0ozGaf0NrP5wyVvcMMn/yka36VwcxJKbnxBZldYjo2onTB0WJ2fKfWc+jHFdWh/s2p8AQfGJLUKZW5kc3RyZWFtCmVuZG9iagoxIDAgb2JqCjw8L0NvbnRlbnRzIDMgMCBSL1R5cGUvUGFnZS9SZXNvdXJjZXM8PC9Qcm9jU2V0IFsvUERGIC9UZXh0IC9JbWFnZUIgL0ltYWdlQyAvSW1hZ2VJXS9Gb250PDwvRjEgMiAwIFI+Pj4+L1BhcmVudCA0IDAgUi9NZWRpYUJveFswIDAgNjEyIDc5Ml0+PgplbmRvYmoKMiAwIG9iago8PC9TdWJ0eXBlL1R5cGUxL1R5cGUvRm9udC9CYXNlRm9udC9UaW1lcy1Sb21hbi9FbmNvZGluZy9XaW5BbnNpRW5jb2Rpbmc+PgplbmRvYmoKNCAwIG9iago8PC9LaWRzWzEgMCBSXS9UeXBlL1BhZ2VzL0NvdW50IDEvSVRYVCgyLjEuNyk+PgplbmRvYmoKNSAwIG9iago8PC9UeXBlL0NhdGFsb2cvUGFnZXMgNCAwIFI+PgplbmRvYmoKNiAwIG9iago8PC9Nb2REYXRlKEQ6MjAyMDAzMzAwMTU3MjJaKS9DcmVhdGlvbkRhdGUoRDoyMDIwMDMzMDAxNTcyMlopL1Byb2R1Y2VyKGlUZXh0IDIuMS43IGJ5IDFUM1hUKT4+CmVuZG9iagp4cmVmCjAgNwowMDAwMDAwMDAwIDY1NTM1IGYgCjAwMDAwMDAyMTggMDAwMDAgbiAKMDAwMDAwMDM3NSAwMDAwMCBuIAowMDAwMDAwMDE1IDAwMDAwIG4gCjAwMDAwMDA0NjUgMDAwMDAgbiAKMDAwMDAwMDUyOCAwMDAwMCBuIAowMDAwMDAwNTczIDAwMDAwIG4gCnRyYWlsZXIKPDwvSW5mbyA2IDAgUi9JRCBbPGQ2ODhhNWJlNjQwYTJmMzAwNzBmYmZjZjFiNzI3NzhhPjw5ZTMxOGE3Y2YyNGIwMWM2MmNhNTdiNTA1MjlkZDc0OT5dL1Jvb3QgNSAwIFIvU2l6ZSA3Pj4Kc3RhcnR4cmVmCjY4MwolJUVPRgo="}
```

In the example above the response is a json with the PDF encoded in base64 format.

## Build

```sh
mvn package
```

## Run

```sh
java -jar target/flying-saucer-service.jar
```

### Run with docker

```sh
docker run --rm -p 8080:8080 rvillablanca/flying-saucer-service
```
