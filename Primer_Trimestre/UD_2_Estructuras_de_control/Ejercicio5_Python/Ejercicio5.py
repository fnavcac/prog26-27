"""
Ejercicio 5
Francisco Navarro
"""

num1 = float(input("Introduce el número 1: "))

num2 = float(input("Introduce el número 2: "))


if(num1 > num2):
    print(f"El número {num1} es mayor a {num2}")
elif(num1==num2):
    print(f"El número {num1} es igual a {num2}")
else:
    print(f"El número {num2} es mayor a {num1}")

print("Fin del programa")
