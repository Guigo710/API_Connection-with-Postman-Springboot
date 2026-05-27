# Projeto Integrador - API Connection 🚀

### Desenvolvimento de Software Multiplataformas.
**Instituição:** Fatec Indaiatuaba  
**Semestre:** 2º Semestre / 2026  

---

## 📝 Descrição do Projeto
Este projeto foi desenvolvido como parte do Projeto Integrador da faculdade. Trata-se de uma API REST desenvolvida em Java com o ecossistema Spring Boot, integrada a um banco de dados relacional SQL (MySQL) gerenciado via XAMPP. 
O fluxo completo da aplicação consiste no recebimento de requisições HTTP, processamento das regras de negócio e persistência automática dos dados.

## 🛠️ Tecnologias Utilizadas
* **Java 21** - Linguagem de programação principal.
* **Spring Boot 4.0.6** - Framework para construção da API REST.
* **Spring Data JPA & Hibernate** - Abstração de banco de dados e mapeamento objeto-relacional (ORM).
* **MySQL (XAMPP)** - Banco de dados relacional para persistência de dados.
* **Postman** - Ferramenta para testes de integração e execução de requisições HTTP.

---

## 🗄️ Integração com o Banco de Dados (SQL)
A API utiliza o mecanismo de inicialização automática do Hibernate (`ddl-auto=update`). Ao iniciar o projeto Java, a conexão com o servidor local do MySQL realiza a validação e cria as tabelas de forma automatizada se o banco não existir.

### Configuração de Conexão (`application.properties`)
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/api_connection?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 🚀 Como Executar o Projeto Localmente

### 1. Pré-requisitos
* Ter o **XAMPP** instalado.
* Ter o **VS Code** com o *Spring Boot Extension Pack* configurado.

### 2. Inicialização do Banco de Dados
1. Abra o painel de controle do **XAMPP**.
2. Clique em **Start** apenas no módulo **MySQL** (certifique-se de que a porta `3306` ficou ativa).
*Nota: Não é necessário iniciar o Apache, pois o Spring Boot já possui um servidor embutido.*

### 3. Execução da API no VS Code
1. Abra a pasta raiz do projeto no VS Code.
2. Navegue até o arquivo principal `ApiConnectionApplication.java`.
3. Clique na opção **Run** (Play) localizada acima do método `main`.
4. O console confirmará a inicialização na porta padrão: `Tomcat started on port 8080 (http)`.

---

## 📬 Testando a API com o Postman

Para simular o consumo da API, utilizamos o **Postman Desktop** enviando requisições locais para a rota do controlador de máquinas:

### 1. Listar todas as Máquinas (GET)
* **URL:** `http://localhost:8080/maquinas`
* **Método:** `GET`
* **Resposta Esperada (Banco Vazio):** `[]`

### 2. Cadastrar Nova Máquina (POST)
* **URL:** `http://localhost:8080/maquinas`
* **Método:** `POST`
* **Headers:** `Content-Type: application/json`
* **Corpo da Requisição (Body - raw JSON):**
```json
{
  "nome": "Torno CNC v4",
  "status": "Operacional"
}
```

---


