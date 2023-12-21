<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">

    <h1 style="text-align: center; margin-bottom: 20px;">�Bienvenido a Shelmma!</h1>

    <div class="panel panel-primary">
        <div class="panel-heading" style="background-color:  #e8daef ; color: #fff;">P�gina principal</div>
        <div class="panel-body">
            <p>Bienvenido <span style="color: #337ab7; font-weight: bold;">${name}</span>!</p>
            
            <p>Te damos la bienvenida a nuestra plataforma de gesti�n de tareas. Aqu� podr�s organizar tus actividades de manera eficiente.</p>

            <p>�Qu� te gustar�a hacer primero?</p>

            <ul>
                <li><a href="/list-todos" style="color: #337ab7; font-weight: bold;">Ver todas tus tareas</a></li>
                <li><a href="/add-todo" style="color: #337ab7; font-weight: bold;">Agregar nueva tarea</a></li>
            </ul>

            <p>No dudes en explorar y utilizar todas las funciones disponibles. �Esperamos que tengas un d�a productivo!</p>
        </div>
    </div>

</div>
<%@ include file="common/footer.jspf"%>
