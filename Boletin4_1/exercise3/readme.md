Ejercicio 3: Proyecto Empresa I
En una carpeta denominada ProyectoEmpresa crea una clase denominada
Empleado con los campos privados: nombre (String), apellidos (String), edad
(int), dni (String), salario anual (double), irpf en % (double). El dato de % se usa
para cálculos y para presentación al usuario, ló gicamente en un double se guarda
solo el número.
Debe incluir set/get para cada propiedad salvo para IRPF que sólo tendrá get pues
cambiará solo cuando cambie el salario.
Por tanto salario debe ser una propiedad de forma que si es modificada, debe de
cambiar el IRPF. Concretamente si el salario es menos de 6000 euros, el IRPF será
del 7.5, si está entre 6000 y 30000 será del 15 y si es mayor que 30000 euros, el
IRPF será del 20.
Debe haber dos constructores. Uno vacío (sin parámetros) que inicialice los datos
String a cadena vacía “” y los numéricos a 0. El otro constructor inicializa las
propiedades a partir de parámetros. Usa los set para las inicializaciones. Piensa si
hay alguna propiedad que no deba ir como parámetro.
Un último método devolverá la cantidad de dinero que se lleva hacienda (usando el
IRPF y el salario).
En una clase aparte denominada IUEmpleado se hará el interface de usuario (IU)
para esta clase. También se denomina vista.
Esta clase dispondrá como propiedad pública única un objeto del tipo
Empleado (denominada empleado) la cual se inicializa a través de un parámetro
tipo Empleado en el constructor.
Además IUEmpleado dispone de los siguientes métodos:
•Se realizará un método denominado mostrar que muestre los campos del
objeto empleado al usuario.
•Haz otro denominado pedir que permita la introducción de los mismos por
parte del usuario mediante teclado. Ninguno de estos dos métodos tiene
parámetros ni devuelve nada.
•Se sobrecarga el método de mostrar de forma que se le pasa un int que
representa a cada campo: 1-Nombre y Apellidos (los dos juntos), 2-edad, 3-
DNI,
4-Salario e IRPF (los dos juntos) y 5-Lo que se lleva hacienda.
Mostrará solo el dato indicado en el parámetro.
Para probarlo en el programa principal (en clase aparte) crea un objeto de esta
clase, rellena con datos que se le pidan al usuario y luego muéstralos. Muestra
también lo que lleva hacienda.