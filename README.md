# Sistema de Locação de Filmes e Games 🎬🎮

Este projeto foi criado para praticar o desenvolvimento de sistemas utilizando a arquitetura de micro-serviços. O sistema permite gerenciar produtos (filmes e games), clientes e locações.

## Estrutura do Projeto

O projeto é composto por três micro-serviços principais e dois serviços adicionais para descoberta e roteamento de serviços:

- **Product Service**: Gerencia filmes e games.
- **Customer Service**: Gerencia informações de clientes.
- **Rental Service**: Gerencia locações de filmes e games.
- **Discovery Server (Eureka Server)**: Serviço de descoberta de micro-serviços.
- **API Gateway (Spring Cloud Gateway)**: Gateway para roteamento de solicitações entre micro-serviços.

## Tecnologias Utilizadas

![Java Badge](https://img.shields.io/badge/Java-007396.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot Badge](https://img.shields.io/badge/Spring%20Boot-6DB33F.svg?style=for-the-badge&logo=spring-boot&logoColor=white)
![Docker Badge](https://img.shields.io/badge/Docker-2496ED.svg?style=for-the-badge&logo=docker&logoColor=white)
![MySQL Badge](https://img.shields.io/badge/MySQL-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)
![RabbitMQ Badge](https://img.shields.io/badge/RabbitMQ-FF6600.svg?style=for-the-badge&logo=rabbitmq&logoColor=white)

## Estrutura dos Diretórios

```plaintext
film-rental-system/
├── product-service/
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
├── customer-service/
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
├── rental-service/
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
├── discovery-server/
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
├── api-gateway/
│   ├── src/
│   ├── Dockerfile
│   └── pom.xml
└── docker-compose.yml
```
## Como Executar
  Pré-requisitos
  Docker
  Docker Compose
## Passos para Executar
  1 - Clone o repositório:
  ```plaintext
    git clone https://github.com/seu-usuario/film-rental-system.git
    cd film-rental-system
```
  2 - Construa e inicie os serviços:
```plaintext
docker-compose up --build
```
  3 - Acesse o Eureka Server para ver os micro-serviços registrados: http://localhost:8761
  Endpoints Principais
## Product Service
      GET /api/v1/products/{id} - Obtém um produto por ID
      POST /api/v1/products - Cria um novo produto
      PUT /api/v1/products/{id}/stock - Atualiza o estoque de um produto
## Customer Service
      GET /api/v1/customers/{id} - Obtém um cliente por ID
      POST /api/v1/customers - Cria um novo cliente
## Rental Service
      GET /api/v1/rentals/{id} - Obtém uma locação por ID
      POST /api/v1/rentals - Cria uma nova locação
