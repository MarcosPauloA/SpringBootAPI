// Define o pacote para esta classe
package com.api.task_api.repository;

// Importa as classes Task e Repository
import com.api.task_api.model.Task;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

// Marca esta classe como um repositório Spring
@Repository
public class TaskRepository {
    // Declara uma lista de tarefas para armazenar as tarefas
    private final List<Task> tasks = new ArrayList<>();
    // Declara um gerador de ID atômico para garantir IDs exclusivos
    private final AtomicLong idGenerator = new AtomicLong();

    // Método para obter todas as tarefas
    public List<Task> findAll() {
        return tasks;
    }

    // Método para encontrar uma tarefa por seu ID
    public Task findById(long id) {
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Método para salvar uma tarefa
    public Task save(Task task) {
        if (task.getId() == 0) {
            // Tarefa nova, atribuir um ID único
            task.setId(idGenerator.incrementAndGet());
        } else {
            // Tarefa existente, atualizá-la
            tasks.removeIf(t -> t.getId() == task.getId());
        }
        tasks.add(task);
        return task;
    }

    // Método para excluir uma tarefa por seu ID
    public void delete(long id) {
        tasks.removeIf(task -> task.getId() == id);
    }
}
