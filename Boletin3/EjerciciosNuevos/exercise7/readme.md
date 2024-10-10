 a) Haz una función llamada saveFile a la cual se le pasa una cadena que
representa el nombre de un archivo. Dicha función debe leer un archivo completo y
devolverlo como string.
Para probarla en el main usa el archivo del ejercicio 2.
b) Realiza una función denominada appendFile a la que se le pasan dos cadenas, la
primera es el nombre de un archivo y la segunda es un texto que debe añadir al
final del archivo. Para ello primero lee el archivo, concatena la nueva cadenas y lo
guarda de nuevo. Utiliza la función creada en (a) para la lectura.
c) Realiza una función denominada appendFile2 que hace lo mismo que la realizada
en (b) pero usando el método explicado en el Apéndice II de los apuntes.



import java.io.IOException; -> lo usamos para manejar las excepciones con la entrada y salida (i/o)

import java.nio.file.Paths; -> se usa para crear una instancia en el PATH, que es la ruta del archivo

import java.nio.file.StandardOpenOption; -> Contiene constantes que se usan para como opciones para abrir o escribir un archivo