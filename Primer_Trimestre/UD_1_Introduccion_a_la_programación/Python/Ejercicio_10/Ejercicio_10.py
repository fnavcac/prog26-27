"""
Ejercicio 10
Francisco Rubén Navarro Cáceres
Programa para convertir la temperatura de Celsius a Fahrenheit.
"""

# Le pedimos la temperatura en Celsius al usuario

temperatura_celsius = input("Introduce la temperatura en ºC (Celsius) por favor: ")

temperatura_fahrenheit = (float(temperatura_celsius) * (9 / 5)) + 32

# Mostramos el resultado de la conversión

print(str(temperatura_celsius) + " ºC equivalen a " + str(temperatura_fahrenheit) + " ºF")
