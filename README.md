# API CRUD de Controle de Tarefas

Esta é uma API CRUD para o gerenciamento de tarefas, construída usando o framework Spring Boot. A API permite a criação, leitura, atualização e exclusão de tarefas, com os dados armazenados internamente em uma estrutura de dados simples.

## Funcionalidades

- **Criar Tarefa**: Adicionar uma nova tarefa à lista de tarefas.
- **Ler Tarefas**: Obter uma lista de todas as tarefas existentes.
- **Atualizar Tarefa**: Modificar uma tarefa existente.
- **Excluir Tarefa**: Remover uma tarefa da lista.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven

## Como Executar

### Pré-requisitos

- [Java 8+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)

### Passos

1. Clone o repositório:

    ```sh
    git clone https://github.com/seu-usuario/controle-tarefas.git
    ```

2. Navegue até o diretório do projeto:

    ```sh
    cd controle-tarefas
    ```

3. Compile e execute o projeto:

    ```sh
    mvn spring-boot:run
    ```

4. Acesse a API no endereço:

    ```
    http://localhost:8080
    ```

## Endpoints

- **Criar Tarefa**
  - `POST /tarefas`
  - Corpo da requisição: JSON com os detalhes da tarefa

- **Ler Todas as Tarefas**
  - `GET /tarefas`

- **Ler Tarefa por ID**
  - `GET /tarefas/{id}`

- **Atualizar Tarefa**
  - `PUT /tarefas/{id}`
  - Corpo da requisição: JSON com os novos detalhes da tarefa

- **Excluir Tarefa**
  - `DELETE /tarefas/{id}`

## Exemplo de JSON de Tarefa

```json
{
  "id": 1,
  "titulo": "Minha Tarefa",
  "descricao": "Descrição da tarefa",
  "status": "pendente"
}
