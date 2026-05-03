# Proyecto: Concesionario de Ferrari
---

## Descripción:
Este es un proyecto creado para el trabajo final del curso de Introducción a Algoritmia. Este proyecto
busca imitar la página web de Ferrari tomando en cuenta el diseño y concepto de la página internacional
de Mercedes por medio de ventanas de Windows.
---

## Instalación:
1. Preparación para importar el proyecto:
Para ello, se necesita que crees un workplace, el cual será el encargado de alojar el proyecto. Luego, 
copia el enlace del proyecto (que lo puedes ver al darle click a la flecha de abajo que está a la 
izquierda de la opción "Code") y un token. Además, se necesita que tenga instalado Git LFS en su computadora,
para verificar eso, escriba "git lfs --version" en la consola, si puede visualizar una versión de LFS, es
porque la tiene instalada en su computadora. Caso contrario, instale Git en su computadora si no lo tiene
instalado, ya que la instalación de git incluye esta expansión para manejar archivos pesados en el
GitHub. En cambio, si tiene Git instalado pero no Git LFS, escriba en la consola "git lfs install" para
instalar la expansión en su equipo.

3. Importación del proyecto:
Con los requisitos previos ya cumplidos, entre al workplace que ha creado por medio de Eclipse. Dirigase 
a la barra de menu superior y seleccione la opción "File", dentro de esta eliga la opción de "Import". En 
las opciones que le aparecerá, seleccione la carpeta "Git", donde dentro de está va a elegir la opción 
"Projects from Git". Dentro de "Projects from Git" elija la opción de "Clone URL". 

Ahora, dentro luego de los pasos anteriores, le aparecerá una ventana de la siguiente forma:
![Ventana de repositorio Git](/Concesionario_Ferrari/recursos_README/ventana_1.png)

En esta ventana va a completar los datos de la siguiente manera:
- En URL, va a pegar la URL del proyecto (al hacer esto, se completarán multiples campos de texto)
- En User, va a poner "ZephyrRiofrio" (mi nombre de usuario, ya que por ahora este proyecto está en privado)
- En password, va a poner el token que copió en el primer paso.

Con lo anterior cumplido, dele a "Next" a la siguientes ventanas hasta llegar a la última donde le dará 
"Finish". 

Es probable que durante este proceso se encuentre con la siguiente alerta:
![Ventana de alerta SSL](/Concesionario_Ferrari/recursos_README/ventana_2.png)

Solo dele a la segunda casilla en caso llegue a aparecer.

Sin embargo, si ya ha importado otros proyectos, es probable que le salga el siguiente error:
![Ventana de repostorio con error](/Concesionario_Ferrari/recursos_README/ventana_3.png)

En este caso, se recomienda que seleccione o cree una carpeta para almacenar el repositorio del proyecto.

3. Instalación de fuentes:
Con el proyecto ya importado, es momento de instalar las fuentes que se han utilizado en este, ya que se han 
usado dos fuentes provenientes de la página Google Fonts. Para ello, dirigase a la carpeta donde está el 
proyecto, en su computador, luego entre a la siguiente ruta: **"/src/recursos/fuentes"** donde va a encontrar
las tres carpetas de las fuentes. Para instarlas, entre a cada una de estas carpetas, entre a sus carpetas 
llamadas "static", seleccione todos los archivos que se encuentra allí, de click derecho y seleccione la 
opción de "Instalar" (Recomendable que copie la carpeta, la pegue en alguna ruta de su explorador de archivos
y desde allí, seleccione todos los archivos. Esto para evitar estar instalando uno por uno). Sin embargo,
este proceso es para las fuentes de Roboto y Host Grotesk, para la fuente de Ferrari solo tendrá que instalar
los dos archivos que se encuentran en su carpeta. 

![Imagen referencial](/Concesionario_Ferrari/recursos_README/ventana_4.png)


## Uso
1. Abra el JFrame "menu.java".
2. Ejecute el programa con el JFrame abierto.
3. Disfrute de la experiencia.
