<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
 <div class="row">
  <div class="col-md-6 col-md-offset-3 ">
   <div class="panel panel-primary">
    <div class="panel-heading">Visualizar tarea</div>
    <div class="panel-body">
     <form:form method="post" modelAttribute="todo">
      <form:hidden path="id" />
      
      <div class="form-group">
       <p path="Nombre">Nombre</p>
       <form:input path="Nombre" type="text" class="form-control"
         disabled="true" required="required" />
      </div>

      <fieldset class="form-group">
       <form:label path="targetDate">Fecha inicio</form:label>
       <form:input path="targetDate" type="text" class="form-control"
         disabled="true" required="required" />
      </fieldset>
      
      <fieldset class="form-group">
       <form:label path="fechaFin">Fecha Fin</form:label>
       <form:input path="fechaFin" type="text" class="form-control"
         disabled="true" required="required" />
      </fieldset>
      
      <fieldset class="form-group">
       <form:label path="description">Descripcion</form:label>
       <form:input path="description" type="text" class="form-control"
         disabled="true" required="required" />
      </fieldset>
      
      
      <fieldset class="form-group">
       <form:label path="Notas">Notas</form:label>
       <form:input path="Notas" type="text" class="form-control"
         disabled="true" required="required" />
      </fieldset> 
   

       <a href="/list-todos">volver</a></li>
     </form:form>
    </div>
   </div>
  </div>
 </div>
</div>
<%@ include file="common/footer.jspf"%>
