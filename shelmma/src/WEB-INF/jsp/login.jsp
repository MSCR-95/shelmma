%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-primary">
                <div class="panel-heading">Inicio de Sesión</div>
                <div class="panel-body">
                    <form action="/login" method="post">
                        <fieldset class="form-group">
                            <label for="username">Nombre de Usuario</label>
                            <input type="text" id="username" name="username" class="form-control" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label for="password">Contraseña</label>
                            <input type="password" id="password" name="password" class="form-control" required="required">
                        </fieldset>

                        <button type="submit" class="btn btn-primary">Iniciar Sesión</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<%@ include file="common/footer.jspf"%>