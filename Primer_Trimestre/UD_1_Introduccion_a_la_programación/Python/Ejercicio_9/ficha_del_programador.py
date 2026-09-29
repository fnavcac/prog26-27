"""
Ejercicio 9
Francisco Rubén Navarro Cáceres
Programa que muestra por pantalla una ficha de un programador.
"""

# Le pedimos al usuario los datos

nombre = input("Introduce tu nombre por favor: \n")

anio_nacimiento = int(input("Introduce tu año de nacimiento: \n"))

altura = float(input("Introduce tu altura en metros: \n"))

# Realizar los cálculos e imprimir los tipos

edad_aproximada  = 2026 - anio_nacimiento

"""
print("El tipo de nombre es: " + str(type(nombre)))

print("El tipo de anio_nacimiento es: " + str(type(anio_nacimiento)))

print("El tipo de altura es: " + str(type(altura)))
"""

# Mostrar el mensaje final

print("\n--- FICHA REGISTRADA ---\nNombre: " + nombre + " " + str(type(nombre)) + "\nEdad: " +
      str(edad_aproximada) + " " + str(type(edad_aproximada)) + "\nAltura: " + str(altura) + " " + str(type(altura)))

print(f"\n--- FICHA REGISTRADA ---\nNombre: {nombre} {str(type(nombre))} \nEdad: {str(edad_aproximada)} {str(type(edad_aproximada))} \nAltura: {str(altura)} {str(type(altura))}")

print("\n--- FICHA REGISTRADA ---\nNombre: {a} {b} \nEdad: {c} {d} \nAltura: {e} {f}".format(a=nombre, b=str(type(nombre)), c=str(edad_aproximada), d=str(type(edad_aproximada)), e=str(altura), f=str(type(altura))))
