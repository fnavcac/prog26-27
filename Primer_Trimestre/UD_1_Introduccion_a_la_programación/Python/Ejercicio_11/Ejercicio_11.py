"""
Ejercicio 11
Francisco Rubén Navarro Cáceres
Programa para dividir caramelos entre alumnos
"""

# Pedir los datos al usuario

num_caramelos = int(input("Introduce el número de caramelos a repartir: \n"))
num_alumnos = int(input("Introduce el número de alumnos presentes: \n"))

# Realizar los cálculos

caramelos_por_alumnos = num_caramelos // num_alumnos

# Otra forma de hacerlo caramelos_sobrantes = num_caramelos - (caramelos_por_alumnos * num_alumnos)

caramelos_sobrantes  = num_caramelos % num_alumnos

print(caramelos_sobrantes)

# Mostrar resultados

print("Cantidad de caramelos: " + str(num_caramelos) + "\nCantidad de alumnos: " + str(num_alumnos) + "\nCada alumno recibe: " + str(caramelos_por_alumnos) + " caramelos.\nSobran en la bolsa: " + str(caramelos_sobrantes) + " caramelos.")
