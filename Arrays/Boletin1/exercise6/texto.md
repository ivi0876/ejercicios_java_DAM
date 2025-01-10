Realizar una clase denominada Matriz con los siguientes miembros:
- Una propiedad que es matriz bidimensional de números enteros.
- Un constructor que se le pase un parámetro entero N de forma que
inicialice la matriz a tamaño NxN con valores entre 0 y 10 aleatorios.
- Función estática que muestra una matriz que se le pasa como parámetro
en formato tabla. Deben aparecer los índices como cabeceras de filas y
columnas. Todo correctamente formateado.
- Función suma con las siguientes sobrecargas:
▪ Sin parámetros: devuelve la suma de todos los elementos de la matriz
▪ Un parámetro boolean: Si está a true devuelve la suma de los
elementos de la diagonal principal de la matriz (la que va de 0,0 a
n,n). Si está a false la suma del resto de los elementos (todos menos
la diagonal).
Trata de hacerlo con solo un bucle para la diagonal y ninguno para los
que no son de la diagonal (si no te sale hazlo con varios bucles, se te
dará pista en la validación).
▪ Un parámetro entero: suma de los elementos de la fila indicada por el
parámetro. Si dicha fila no existe devuelve -1.

- Función denominada borraFila a la cual se le pasa un entero y devuelve la
matriz pero sin la fila indicada por el número del parámetro (debes crear una
matriz con una fila menos). Si el número está fuera del rango válido devuelve
la matriz completa.
En el programa principal (en otra clase) se inicializa un objeto de la clase Matriz y
se plantea un menú con las opciones que llaman a las funciones correspondientes:
• Mostrar matriz.
• Mostrar suma de todos los elementos.
• Mostrar suma de la diagonal.
• Mostrar suma de los elementos salvo diagonal
• Mostrar suma de elementos de una fila: la fila la escoge el usuario.
• Mostrar matriz sin una fila: la fila la escoge el usuario.
• Salir. No sale del menú hasta que se selecciona esta opción.


(Opcional) Añade una función denominada borraFilas a la cual se le pase una
colección de números enteros que contiene números de filas: Devuelve un array
como el original pero sin las filas indicadas en la colección (si hay números fuera
del rango simplemente que no los tenga en cuenta)