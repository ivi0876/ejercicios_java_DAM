En los ejercicios de este bolet ín se pide esencialmente diseño de clases. Se
recomienda que a medida que se desarrolla la clase pedida se tenga en otro archivo
una clase con main para ir probando los distintos miembros que se pide diseñar.



Crea una clase denominada Geometria con las siguientes propiedades:
– figura: Será boolean. Pública. Si esta propiedad tiene el valor true, el objeto
estará representando un rectángulo. Por el contrario si tiene el valor false,
representa un triángulo.
– altura, base: Ambas reales. Privadas con set y get. ¿Se te ocurre alguna
comprobación intresante que hacer en el set?
Tendrá los siguientes constructores:
– Uno vacío (sin parámetros) que inicializa los campos a triángulo (figura a
false) y tanto la base como la altura a 2.
– Uno con parámetros base y altura a partir de los que inicializa un triángulo
con dicha base y altura que se les pasa como parámetro.
– Un tercero con tres parámetros para inicializar las tres propiedades.
Y los siguientes métodos:
– area: Función que devuelve el área de la figura ( base*altura en el
rectángulo y base*altura/2 en el triángulo). Recuerda que debes usar la
base y la altura del propio objeto, no tiene ningún parámetro.
– perimetro: Función que devuelve el perímetro de la figura. Tampoco tiene
parámetros. En el caso del triángulo supón que es triángulo rectángulo, por
lo que los lados serán la base, la altura y la diagonal (hipotenusa) que
calculas en el siguiente método.
– diagonal: Función que devuelve el tamaño de la diagonal del rectángulo o la
hipotenusa del triángulo rectángulo (se calcula igual en ambos casos,
averigua cómo si no lo sabes).
– tipo: Función que devuelve el string “triángulo” o “rectángulo” dependiendo
de figura.
En otra clase sitúa el programa principal ( main) y crea dos objetos:
• Uno que represente un rectángulo a partir del constructor con par ámetros
que tú decidas.
• Otro un triángulo con el constructor vacío. Luego usa los set para darle los
valores de base y altura que decida el usuario.
Luego muestra claramente los datos de cada uno.