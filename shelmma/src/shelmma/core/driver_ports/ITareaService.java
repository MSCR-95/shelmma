package shelmma.core.driver_ports;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import shelmma.core.domain.Tarea;

public interface ITareaService {
	Tarea getTarea(long id);
	/*
    List < Tarea > getTodosByUser(String user);

    Optional < Tarea > getTodoById(long id);

    void updateTodo(Tarea todo);

    void addTodo(String name, String Nombre, String desc, String Notas, Date targetDate, Date fechaFin, boolean isDone);

    void deleteTodo(long id);

    void saveTodo(Tarea todo);
    
    Optional < Tarea > VerTarea(long id);
    */
}