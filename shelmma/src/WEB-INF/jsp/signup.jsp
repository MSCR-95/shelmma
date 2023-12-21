<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-primary">
                <div class="panel-heading">Registro de Usuario</div>
                <div class="panel-body">
                    <form:form method="post" modelAttribute="user">
                        <!-- Campos del formulario para el registro -->
                        <fieldset class="form-group">
                            <form:label path="username">Usuario</form:label>
                            <form:input path="username" type="text" class="form-control" required="required" />
                            <form:errors path="username" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="email">Correo Electrónico</form:label>
                            <form:input path="email" type="email" class="form-control" required="required" />
                            <form:errors path="email" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="password">Contraseña</form:label>
                            <form:input path="password" type="password" class="form-control" required="required" />
                            <form:errors path="password" cssClass="text-warning" />
                        </fieldset>

                        <button type="submit" class="btn btn-success">Registrarse</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>

<%@ include file="common/footer.jspf"%>
