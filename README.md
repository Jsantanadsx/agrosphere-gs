# AgroSphere API

## Integrantes

* João Santana – RM566063]
* Felipe Ribeiro - RM565224

---

## Sobre o Projeto

O AgroSphere é uma plataforma de pesquisa agrícola inspirada nos princípios da agricultura.

O projeto tem como objetivo estudar o comportamento de culturas agrícolas em ambientes extremos, utilizando dados coletados em regiões afetadas por condições climáticas severas, como seca, calor excessivo e escassez de recursos.

A solução busca gerar conhecimento que possa contribuir tanto para a adaptação da agricultura terrestre às mudanças climáticas quanto para futuras operações agrícolas em ambientes espaciais, como missões em Marte.

---

## Objetivos

* Monitorar condições ambientais em fazendas localizadas em ambientes extremos.
* Registrar culturas agrícolas e seus plantios.
* Armazenar leituras de sensores ambientais.
* Gerenciar alertas climáticos.
* Controlar missões de pesquisa agrícola.
* Registrar experimentos científicos relacionados à agricultura resiliente.
* Disponibilizar dados através de uma API REST.

---

## Tecnologias Utilizadas

### Backend

* Java 21
* Spring Boot 4
* Spring Data JPA
* Spring Validation
* Lombok
* Swagger / OpenAPI

### Banco de Dados

* Oracle Database

### Ferramentas

* IntelliJ IDEA
* Maven
* Git
* GitHub

---

## Arquitetura do Projeto

O projeto foi desenvolvido seguindo o padrão de arquitetura em camadas:

```text
controller
service
repository
entity
dto
exception
config
```

---

## Funcionalidades

### Fazenda

CRUD completo:

* GET
* GET BY ID
* POST
* PUT
* DELETE

### Demais Entidades

Consulta de dados:

* Culturas
* Plantios
* Sensores
* Leituras de Sensores
* Condições Climáticas
* Alertas
* Pesquisadores
* Missões
* Experimentos
* Pesquisadores por Missão

---

## Documentação da API

Swagger/OpenAPI disponível em:

```text
http://localhost:8080/swagger
```

---

## Configuração do Banco Oracle

Configuração realizada no arquivo:

```text
src/main/resources/application.properties
```

Exemplo:

```properties
spring.datasource.url=jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL
spring.datasource.username=rm566063
spring.datasource.password=070906
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
```

---

## Como Executar

### Clonar o Repositório

```bash
git clone URL_DO_REPOSITORIO
```

### Entrar na Pasta

```bash
cd agrosphere
```

### Executar a Aplicação

```bash
mvn spring-boot:run
```

ou pela IDE:

```text
AgrosphereApplication.java
Run
```

---

## Recursos Implementados

* API REST
* Spring Boot
* Oracle Database
* Spring Data JPA
* DTOs utilizando Java Records
* Validação de dados
* Tratamento global de exceções
* Swagger/OpenAPI
* Injeção de dependências
* Lombok
* Configuração de CORS
* Relacionamentos entre entidades
* Chave composta utilizando EmbeddedId

---

## Estrutura do Projeto

```text
src
 └── main
      ├── java
      │    └── br.com.fiap.agrosphere
      │         ├── config
      │         ├── controller
      │         ├── dto
      │         ├── entity
      │         ├── exception
      │         ├── repository
      │         └── service
      │
      └── resources
           └── application.properties
```

---

## Informações para Avaliação

* Projeto desenvolvido utilizando Spring Boot.
* Persistência realizada com Spring Data JPA.
* Banco Oracle utilizado conforme requisitos da disciplina.
* API documentada com Swagger/OpenAPI.
* Estrutura organizada em camadas.
* Implementação de DTOs, validações e tratamento de exceções.
* Modelagem baseada no contexto da Global Solution 2026 – AgroSphere.
