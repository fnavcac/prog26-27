"""
Ejercicio Ampliación
Francisco Rubén Navarro Cáceres
Calcula el capital final acumulado con interés compuesto: A = P * (1 + r)^t.
Compara si el capital final proyectado supera o iguala una meta deseada mediante un valor booleano.
"""

# Pedimos los datos al usuario

P = float(input("Capital inicial: ")) # El capital inicial

r = float(input("Tasa por periodo (1% = 0.01): ")) # Interés por periodo

t = int(input("Número de periodos: ")) # Tiempo, que debe ser igual al tiempo del interés, es decir, interés en años y periodos en años por ejemplo.

meta_deseada = float(input("Meta deseada: "))

# Cálculos

A = P * (1 + r) ** t

supera_iguala_meta = A >= meta_deseada

# Mostrar el resultado por pantalla

print("Capital final: " + str(A) + ", con una meta de " + str(meta_deseada))
print("¿Supera o iguala la meta?: " + str(supera_iguala_meta))