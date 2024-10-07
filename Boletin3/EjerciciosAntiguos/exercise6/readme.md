Realizar el programa “Adivina un número entre 1 y 100” según las
especificaciones del boletín previo utilizando subprogramas. Al menos deben existir
los siguientes subprogramas:
•Un método denominado compara al que se le pasen dos números y devuelva
0 si el primero es menor, 1 si son iguales y 2 si el primero es mayor. No
debe tener ningún interfaz con el usuario. Luego, en el programa principal
(main), dependiendo del resultado de la funci ón compara y usando una
estructura switch-case, se mostrarán unos mensajes u otros por pantalla.
•Un método denominado pideNumero de introducción de datos. Se pide una
variable donde se debe almacenar un número entre 1 y 100, mostrando
mensaje de error y volviendo a pedir el número sucesivamente si no está en
ese rango. Devolverá dicha variable. A este método se le llamará tanto para
la introducción de datos del jugador 1 como para los intentos del jugador 2.
Si se considera necesario, se pueden realizar más subprogramas para evitar repetir
código u organizar adecuadamente el mismo.
Además debes modificar el juego para añadirle una opción para un solo jugador
(plantea un menú de 1 o 2 jugadores al principio del programa). De forma que el
número inicial debe ser aleatorio generado por el ordenador mediante la función
Math.random().