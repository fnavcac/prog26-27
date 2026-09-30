"""
Ejercicio 13
Francisco Rubén Navarro Cáceres
Programa que genera un tique de compra con impuestos y propina
"""

# Pedir información al usuario

nombre_cliente = input("Introduce tu nombre: ")
nombre_producto = input("Introduce el nombre del producto: ")
precio_unitario = float(input("Introduce el precio unitario: "))
cantidad = int(input("Introduce la cantidad comprada: "))
porcentaje_iva = int(input("Introduce el porcentaje de IVA aplicable: (ej. 21 para 21%) "))
propina = input("¿Desea incluir propina opcional de 2 euros: (si/no) ")

# Cálculos

if (propina == "si"):
    propina = 2.0
else:
    propina = 0.0

subtotal_basico = precio_unitario * cantidad
monto_IVA = (subtotal_basico * (porcentaje_iva / 100))
total_precio = subtotal_basico + monto_IVA + propina

umbral_vip = total_precio > 30

# Mostrar los resultados

print("\n================================")
print("       TIQUE DE CAFETERÍA       ")
print("================================")
print("Cliente: " + nombre_cliente)
print("Producto: " + nombre_producto + " x " + str(cantidad))
print("--------------------------------")
print("Subtotal: " + str(subtotal_basico) + " Euros")
print("IVA (" + str(porcentaje_iva) + "%): " + str(monto_IVA) + " Euros")
print("Propina: " + str(propina) + " Euros")
print("TOTAL A PAGAR: " + str(total_precio) + " Euros")
print("--------------------------------")
print("¿Supera el umbral VIP (>30 Euros)?: " + str(umbral_vip))
print("================================\n")