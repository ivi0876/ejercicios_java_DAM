Juego de Craps: Se desea simular este juego de dados. Para ello:
[] Se simula que el jugador tira dos dados de seis caras y se calcula la suma
de ambos.

[] Si la suma es 7 u 11 en la primera tirada el jugador gana.
[] Si la suma es 2, 3 o 12 en la primera tirada (se denomina craps) el jugador
pierde (gana la CPU).
[] Si la suma es un nº entre 4 y 10 salvo el 7, dicha suma son los puntos del
jugador.
[] Luego tira la CPU con las mismas reglas. Si al final ambos sacan puntuación
gana la de mayor valor o empate en caso de igualdad.

Deben existir al menos las siguientes funciones:
tirada: Tira dos dados, muestra sus valores en pantalla y devuelve la suma.
comprobacion: Se el pasa un valor y devuelve
puntuación en otro caso.
-1 si pierde, 0 si gana o la
Como siempre haz otras para organizar c ódigo y evitar repetir código.