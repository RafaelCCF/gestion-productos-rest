# gestion-productos-rest

gestion-productos-rest

Api rest para la gestion de mesas de rest it. Esta desarrollado con spring 4 y java 7, usando weblogic como servidor de aplicaciones

Uso

Clonar fuente

$ git clone ssh://git@200.14.166.249:7999/gen/generator-spring-bch.git
$ cd gestion-productos-rest

$ mvn clean install
Al ejecutar este comando se creara un .war dentro de la carpeta target

Una vez que el levante el servidor, acceda a la consola de administración del Servidor WebLogic. Abra un navegador web e ingrese la URL de la consola de administración del dominio:
http://hostname:port/console

Nota: use el nombre de host y el puerto del servidor de administración de su dominio.
En la pantalla de bienvenida, inicie sesión usando el nombre de usuario y la contraseña ingresados en la instalacion ​​para acceder a la consola.

La implementación de una aplicación es un cambio en la configuración del dominio, por lo que primero debe bloquearse. En el Centro de cambios, haga clic en el botón Bloquear y editar.

En Estructura de dominio, haga clic en Despliegues.

A la derecha, en Despliegues, haz clic en el botón Instalar.
Presione "cargue los archivos". Use los enlaces para navegar hasta la ubicación en la que colocó el archivo de gestion-productos-rest.war descargado. Allí verá gestion-productos-rest.war con un radio botón al lado. Seleccione ese botón de radio. Al usar los enlaces y el botón de opción, la consola rellena el campo Ruta por usted.

Alternativamente, puede escribir la ruta y el nombre del archivo en el campo Ruta usted mismo.

Click Siguiente.

En la siguiente pantalla, asegúrese de que esté seleccionada la opcion Instalar esta implementación como una aplicación.

Click siguiente.

En la pantallas seleccione: gestion-productos-rest.war.

Click siguiente.

En la siguiente pantalla dejar todo en default y dar click a siguiente.

Seleccionar la opcion: No, revisare la configuracion mas tarde. y dar click en terminar

Observe los mensajes de que se instaló la implementación, pero los cambios deben estar activados. También observe la aplicación benefits que figura en la tabla Despliegues.
En el Centro de cambios, haga clic en el botón Activar cambios

