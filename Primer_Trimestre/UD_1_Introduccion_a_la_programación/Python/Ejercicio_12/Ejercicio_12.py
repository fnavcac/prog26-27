"""
Ejercicio 12
Francisco Rubén Navarro Cáceres
Programa que verifica si es apto para el descuento
"""

# Pedir los datos

edad = int(input("Edad: "))
estudiante = input("¿Es estudiante? (si/no): ")
compra = float(input("Monto de compra: "))

"""
# Convertir estudiante a booleano

if (estudiante == "si" or estudiante == "Si"):
               es_estudiante = True

if (estudiante == "no" or estudiante == "No"):
               es_estudiante = False

# Condiciones para recibir el descuento

if (edad > 65 or (es_estudiante and compra > 50)):
               aplica_descuento = True

               
               print("¿Aplica descuento?: " + str(aplica_descuento))

else:
    aplica_descuento = False

    print("¿Aplica descuento?: " + str(aplica_descuento))
"""

# Condiciones descuento
print("¿Aplica descuento?: " + str(edad > 65 or (estudiante == "si" and compra > 50)))

