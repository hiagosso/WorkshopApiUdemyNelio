# 🚀 Primeira API com Spring Boot

Este projeto é uma **API REST desenvolvida com Spring Boot**, criada como parte dos estudos do curso **Java Completo** do professor **Nelio Alves**. O objetivo do projeto é aplicar, na prática, os principais conceitos de **desenvolvimento backend com Java**, seguindo boas práticas utilizadas no mercado.

---

## 🧠 Objetivo do Projeto

* Aprender os fundamentos do **Spring Boot**
* Criar uma **API RESTful** do zero
* Implementar operações **CRUD**
* Trabalhar com **JPA / Hibernate**
* Mapear relacionamentos entre entidades
* Serializar dados em **JSON**
* Evitar problemas comuns como **loop infinito** na serialização

---

## 🛠️ Tecnologias Utilizadas

* **Java** 17+
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **Hibernate**
* **Maven**
* **H2 / PostgreSQL** (dependendo da configuração)
* **Jackson** (serialização JSON)

---

## 📦 Estrutura do Projeto

```bash
src/main/java/com/hiagodev/course
├── controllers
├── entities
├── repositories
├── services
└── resources
```

---

## 👤 Entidade User

A entidade `User` representa os usuários do sistema e está mapeada para a tabela `tb_user` no banco de dados.

Principais atributos:

* `id`
* `name`
* `email`
* `phone`
* `password`

Relacionamento:

* Um usuário pode ter **vários pedidos (Orders)** → `@OneToMany`

---

## 🌐 Endpoints da API

### 🔹 Usuários (`/users`)

| Método | Endpoint    | Descrição                     |
| ------ | ----------- | ----------------------------- |
| GET    | /users      | Lista todos os usuários       |
| GET    | /users/{id} | Busca usuário por ID          |
| POST   | /users      | Cadastra um novo usuário      |
| PUT    | /users/{id} | Atualiza um usuário existente |
| DELETE | /users/{id} | Remove um usuário             |

---

## 📌 Exemplo de JSON (POST /users)

```json
{
  "name": "Maria Silva",
  "email": "maria@email.com",
  "phone": "99999-9999",
  "password": "123456"
}
```

---

## ⚠️ Observações Importantes

* Foi utilizado `@JsonIgnore` para evitar **loop infinito** na serialização de entidades relacionadas
* O projeto segue o padrão **Controller → Service → Repository**

---

## ▶️ Como Executar o Projeto

### Pré-requisitos

* Java 17 ou superior
* Maven

### Passos

```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git

# Entrar na pasta do projeto
cd seu-repositorio

# Executar o projeto
mvn spring-boot:run
```

A API ficará disponível em:

```
http://localhost:8080/users
```

---

## 📚 Aprendizados

Com este projeto foi possível aprender:

* Criação de APIs REST com Spring Boot
* Persistência de dados com JPA
* Mapeamento de relacionamentos
* Organização de um projeto backend em camadas

---

## 👨‍💻 Autor

Desenvolvido por **Hiago Jesus**

📌 Projeto de estudo — evolução contínua 🚀
