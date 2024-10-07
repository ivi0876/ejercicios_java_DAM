Ejercicio guiado de orientación a objetos.
Sigue los siguientes pasos:
a) Crea una clase denominada Pelota en su propio archivo Pelota.java.
b) Añade dos propiedades públicas:
- tipo que será String (indicará si es de fútbol, baloncesto, playa, etc.)
- radio que será un double indicará el tamaño en cm.
c) Crea otra clase denominada Principal con un main
d) En el main declara e instancia un objeto de tipo Pelota.
e) Luego también en el main haz que sea de “baloncesto” y radio 20.
f) Muestra, también en el main, los valores de dicho objeto.
Una vez que funcione lo anterior volvemos a la clase Pelota para ampliarla.
g) Crea un constructor sin parámetros que inicialice el tipo a “playa” y el radio a 40
cm.
h) Crea otro constructor con dos parámetros que corresponden con las dos
propiedades. Deben tener el mismo nombre de las propiedades y usa this para
inicializar dichas propiedades.
Vuelve a la clase Principal.
i) En el main y a continuación de lo que hiciste antes, crea dos objetos tipo pelota
nuevos. Uno con el constructor sin parámetros y otro con el constructor al que le
pasas como parámetros futbol y 22cm
j) Muestra los datos de estos dos objetos tipo Pelota creados

Una vez que funcione lo anterior volvemos a la clase Pelota y haces las
siguientes modificaciones:
k) Haz que la propiedad radio sea privada (Aparecer án errores en el main, no pasa
nada por ahora).
l) Crea un set y un get para la la propiedad radio.
Vuelve a la clase Principal.
m) En el main modifica lo que sea necesario para que todo funcione correctamente
tras los últimos cambios realizados.
Vuelve a la clase Pelota.
n) En la clase Pelota crea una función denominada inflar sin parámetros la cual
incrementa en 1 el radio de la pelota.
ñ) Sobrecarga el método anterior con un parámetro entero que indique en cuanto
se incrementa el radio, por supuesto dentro el radio se incrementa rá en dicha
cantidad.
Vuelve a la clase Principal.
o) En el main llama a inflar() de la primera pelota creada y luego a inflar(10) con la
segunda. Muestra luego nuevamente los valores de los radios de ambas pelotas.
p) Finalmente realiza en la clase Principal una función estática denominada
intercambiaRadios a la cual le pasa dos objeto Pelota como parámetros e
intercambia los valores de los radios de ambas.
Llámala en el main con las dos primeras pelotas creadas y luego muestra los radios
de ambas para comprobar el correcto funcionamiento.