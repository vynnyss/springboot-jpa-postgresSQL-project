Este é um projeto backend desenvolvido com **Spring Boot** e **JPA (Hibernate)**, simulando um sistema de vendas completo. Ele foi projetado como um exemplo de aplicação RESTful para fins de estudo e portfólio, com persistência de dados usando **PostgreSQL** em produção e **H2 Database** para testes.

---

## 🔧 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA (Hibernate)
- Banco de Dados PostgreSQL (produção)
- Banco de Dados H2 (testes)
- Spring Web (REST APIs)
- Maven

---

## 🗂️ Estrutura do Projeto

O projeto segue a arquitetura MVC e está dividido nos seguintes pacotes:

- `entities` - Contém as entidades do domínio (User, Product, Order, etc.)
- `repositories` - Interfaces de acesso ao banco de dados usando Spring Data JPA
- `services` - Lógica de negócio e regras de validação
- `resources` - Endpoints REST (Controllers)

---

## 📦 Entidades

| Entidade     | Descrição                                                                 |
|--------------|---------------------------------------------------------------------------|
| `User`       | Representa o cliente ou usuário do sistema                                |
| `Product`    | Representa um produto disponível para venda                               |
| `Category`   | Categoria dos produtos (ex: Eletrônicos, Roupas, etc.)                    |
| `Order`      | Pedido realizado por um usuário                                           |
| `OrderItem`  | Relaciona pedidos com produtos, incluindo quantidade e preço unitário     |
| `Payment`    | Informações de pagamento associadas a um pedido                          |

---

## 📡 API REST

A aplicação expõe uma API REST completa com suporte a:

- **GET**: Listagem e detalhes de recursos
- **POST**: Criação de novos registros
- **PUT**: Atualização de recursos existentes
- **DELETE**: Remoção de registros

Exemplo de endpoints disponíveis:

| Método | Endpoint           | Descrição               |
| ------ | ------------------ | ----------------------- |
| GET    | `/products`           | Lista todos os produtos |
| POST   | `/user`        | Cria um novo usuario    |
| PUT    | `/users/{id}`     | Atualiza os dados do usuario      |
| DELETE | `/users/{id}` | Remove um usuario    |

🔁 Exemplo de Requisição (Postman)
Criar novo usuário

{
  "name": "João da Silva",
  "email": "joao@email.com",
  "phone": "11999999999",
  "password": "123456"
}
