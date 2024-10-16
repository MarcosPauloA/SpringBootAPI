// Define o pacote para esta classe
package com.api.task_api.controller;

// Importa as classes Task e TaskRepository
import com.api.task_api.model.Task;
import com.api.task_api.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Marca esta classe como um controlador Spring
@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskRepository repository;

    // Construtor que injeta uma instância de TaskRepository
    public TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    // Método para obter todas as tarefas
    @GetMapping
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    // Método para obter uma tarefa com base em seu ID
    @GetMapping("/{id}")
    public Task getTask(@PathVariable Long id) {
        return repository.findById(id);
    }

    // Método para criar uma nova tarefa a partir dos dados no corpo da solicitação
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return repository.save(task);
    }

    // Método para atualizar uma tarefa com base em seu ID
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable long id, @RequestBody Task updatedTask) {
        updatedTask.setId(id); // Garante que o ID do caminho seja usado
        return repository.save(updatedTask);
    }

    // Método para excluir uma tarefa com base em seu ID
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable long id) {
        repository.delete(id);
    }
}
