0030

Crea un nuevo proyecto llamado mi-mail-system en BlueJ.
Crea 3 clases: MailItem, MailClient y MailServer.
Copia el c�digo de la clase MailServer que encontrar�s en el archivo MailServer.java del proyecto mail-system de mi p�gina de GitHub en tu clase MailServer. 
Puedes y debes echar un vistazo a los m�todos disponibles de esa clase, en concreto a sus cabeceras y a sus comentarios previos 
(con eso nos basta, no nos interesa como es el c�digo interno de cada m�todo) ya que ser� necesario que los invoques para poder completar tu trabajo.
Codifica por ti mismo las otras dos clases de forma que:
La clase MailItem:
Disponga 3 atributos de tipo String llamados from, to y message.
Disponga de un constructor que permita crear un objeto MailItem inicializando sus atributos por medio de par�metros.
Disponga de 3 m�todos getter, uno para cada uno de sus atributos
Disponga de un m�todo print que no tenga par�metros y que muestre por pantalla los atributos del objeto.
La clase MailClient:
Disponga de 2 atributos: uno de tipo MailServer llamado server

(que representa el servidor asociado con ese cliente) y otro de tipo String llamado user (que representa la direcci�n de correo del usuario que usa ese cliente).
Disponga de un constructor que permita crear un objeto MailClient inicializando sus atributos por medio de par�metros.
Disponga de un m�todo llamado getNextMailItem que recupere del servidor el siguiente correo (un objeto MailItem) que tenga el usuario y devuelva dicho objeto.
Disponga de un m�todo llamado printNextMailItem que recupere del
servidor el siguiente correo (un objeto MailItem) que tenga el usuario e imprima por pantalla los datos de dicho mensaje. 
Si no hay ningun mensaje, que muestre un mensaje por pantalla informando de ello.
Disponga de un m�todo llamado sendMailItem que reciba 2 par�metros (un String indicando para qui�n es el mensaje y otro String indicando el contenido del mensaje), 
cree un email (objeto MailItem) bas�ndose en la informaci�n de dichos par�metros y lo env�e al servidor asociado a ese cliente.
Comprueba que funciona tal y como funcionaba el proyecto descargado en la actividad 0029.

Intenta completar por ti mismo las clases que se piden (MailClient y MailItem) sin mirar la implementaci�n que figura en el repositorio de GitHub.

Esta actividad tiene un poco de dificultad a la hora de rescribir la clase MailClient por lo que no deber�as preocuparte si no eres capaz de completarla. 
En ese caso, mira el c�digo para esa clase que hay en mi repositorio e intenta entenderlo. 
En cualquier caso, la clase MailItem si que deber�as ser capaz de realizarla t� solo.

Cuando termines sube el c�digo a Github e indica como respuesta de la actividad el enlace al �ltimo commit.