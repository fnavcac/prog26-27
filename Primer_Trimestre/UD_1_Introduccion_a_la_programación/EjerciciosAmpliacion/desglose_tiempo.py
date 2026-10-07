"""
Ejercicio Ampliación
Francisco Rubén Navarro Cáceres
Programa que transforma los segundos que introduce el usuario en horas, minutos y segundos.
"""

# Pedimos los segundos al ususario

segundos_pedidos = int(input("Introduce un número de segundos: "))

# Cálculos

minutos = segundos_pedidos // 60 # Se calculan los minutos totales

resto_segundos = segundos_pedidos % 60 # Se obtienen los segundos

horas = minutos // 60 # Se calculan las horas totales

resto_minutos = minutos % 60 # Se obtienen los minutos

# Mostramos el resultado por pantalla

print(str(segundos_pedidos) + " segundos equivalen a " + str(horas) + " h, " + 
      str(resto_minutos) + " min, " + str(resto_segundos) + " sec.")