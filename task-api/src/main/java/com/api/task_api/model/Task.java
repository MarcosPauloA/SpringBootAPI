package com.api.task_api.model; // Declaração do pacote onde a classe Task está localizada.

import java.time.LocalDate; // Importa a classe LocalDate do pacote java.time, que é usada para representar datas.

public class Task { // Declaração da classe Task.
    private long id; // Declaração de um campo de instância "id" do tipo long.
    private String title; // Declaração de um campo de instância "title" do tipo String.
    private String description; // Declaração de um campo de instância "description" do tipo String.
    private LocalDate dueDate; // Declaração de um campo de instância "dueDate" do tipo LocalDate.

    public Task() {
        // Construtor padrão vazio, que não recebe argumentos.
    }

    public Task(long id, String title, String description, LocalDate dueDate) {
        // Construtor que recebe quatro argumentos para inicializar os campos da classe.
        this.id = id; // Inicializa o campo "id" com o valor passado como argumento.
        this.title = title; // Inicializa o campo "title" com o valor passado como argumento.
        this.description = description; // Inicializa o campo "description" com o valor passado como argumento.
        this.dueDate = dueDate; // Inicializa o campo "dueDate" com o valor passado como argumento.
    }

    // Getters and setters
    // Os métodos getters e setters são usados para acessar e modificar os campos da classe.

    public long getId() { // Getter para o campo "id".
        return id; // Retorna o valor do campo "id".
    }

    public void setId(long id) { // Setter para o campo "id".
        this.id = id; // Define o valor do campo "id" com o valor passado como argumento.
    }

    public String getTitle() { // Getter para o campo "title".
        return title; // Retorna o valor do campo "title".
    }

    public void setTitle(String title) { // Setter para o campo "title".
        this.title = title; // Define o valor do campo "title" com o valor passado como argumento.
    }

    public String getDescription() { // Getter para o campo "description".
        return description; // Retorna o valor do campo "description".
    }

    public void setDescription(String description) { // Setter para o campo "description".
        this.description = description; // Define o valor do campo "description" com o valor passado como argumento.
    }

    public LocalDate getDueDate() { // Getter para o campo "dueDate".
        return dueDate; // Retorna o valor do campo "dueDate".
    }

    public void setDueDate(LocalDate dueDate) { // Setter para o campo "dueDate".
        this.dueDate = dueDate; // Define o valor do campo "dueDate" com o valor passado como argumento.
    }
}
