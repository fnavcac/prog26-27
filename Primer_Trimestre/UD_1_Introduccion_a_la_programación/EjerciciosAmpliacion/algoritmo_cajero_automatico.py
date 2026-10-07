"""
Ejercicio Ampliación
Francisco Rubén Navarro Cáceres
Programa que simula el vuelto de un cajero automático en billetes de
50, 20, 10, 5 y monedas de 1.
"""

# Pedimos los datos al usuario
monto_introducido = int(input("Introduce un monto entero de euros: \n"))


# Cálculos
billetes_50 = monto_introducido // 50 # Se calculan los billetes de 50

resto_billetes_50 = monto_introducido % 50


billetes_20 = resto_billetes_50 // 20 # Se calculan los billetes de 20

resto_billetes_20 = resto_billetes_50 % 20


billetes_10 = resto_billetes_20 // 10 # Se calculan los billetes de 10

resto_billetes_10 = resto_billetes_20 % 10


billetes_5 = resto_billetes_10 // 5 # Se calculan los billetes de 5

resto_billetes_5 = resto_billetes_10 % 5


monedas_1 = resto_billetes_5 // 1 # Se calculan las monedas de 1

print("El monto introducido de " + str(monto_introducido) + " euros, equivalen a " +
      str(billetes_50) + " billetes de 50 euros, " + str(billetes_20) +
      " billetes de 20 euros, " + str(billetes_10) + " billetes de 10 euros, " +
      str(billetes_5) + " billetes de 5 euros y " + str(monedas_1) + " monedas de 1 euro")
