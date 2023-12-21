<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">

    <h1 style="text-align: center; margin-bottom: 20px;">¡Bienvenido a Shelmma!</h1>

    <div class="panel panel-primary">
        <div class="panel-heading" style="background-color:  #e8daef ; color: #fff;">Página principal</div>
        <div class="panel-body">
            <p>Bienvenido <span style="color: #337ab7; font-weight: bold;">${name}</span>!</p>
            
            <p>Te damos la bienvenida a nuestra plataforma de gestión de tareas. Aquí podrás organizar tus actividades de manera eficiente.</p>

            <p>¿Qué te gustaría hacer primero?</p>

            <ul>
                <li><a href="/list-todos" style="color: #337ab7; font-weight: bold;">Ver todas tus tareas</a></li>
                <li><a href="/add-todo" style="color: #337ab7; font-weight: bold;">Agregar nueva tarea</a></li>
            </ul>

            <p>No dudes en explorar y utilizar todas las funciones disponibles. ¡Esperamos que tengas un día productivo!</p>
        </div>
    </div>

</div>
<%@ include file="common/footer.jspf"%>
