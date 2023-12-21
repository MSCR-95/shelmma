<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
 <div>
  <a type="button" class="btn btn-primary btn-md" href="/add-todo">Añadir tarea</a>
 </div>
 <br>
 <div class="panel panel-primary">
  <div class="panel-heading">
   <h3>Lista de tareas</h3>
  </div>
  <div class="panel-body">
   <table class="table table-striped">
    <thead>
     <tr>
      <th width="10%">Nombre</th>
      <th width="10%">Fecha Inicio</th>
      <th width="10%">Fecha Fin</th>
      <th width="20%"></th>
     </tr>
    </thead>
    <tbody>
     <c:forEach items="${todos}" var="todo">
      <tr>
       <td>${todo.getNombre()}</td>
       <td><fmt:formatDate value="${todo.getTargetDate()}"
         pattern="dd/MM/yyyy" /></td>
         <td><fmt:formatDate value="${todo.getFechaFin()}"
         pattern="dd/MM/yyyy" /></td>
       <td><a type="button" class="btn btn-success"
        href="/update-todo?id=${todo.id}">Editar</a>
       <a type="button" class="btn btn-warning"
        href="/delete-todo?id=${todo.id}">Borrar</a>
        <a type="button" class="btn btn-warning" 
        href="/view-todo?id=${todo.id}">Ver</a></td> <!-- Cambiar para cambiar color del boton -->
      
        
      </tr>
     </c:forEach>
    </tbody>
   </table>
  </div>
 </div>

</div>
<%@ include file="common/footer.jspf"%>
