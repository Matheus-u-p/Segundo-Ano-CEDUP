#Matheus Uggioni Possamai
#2-53
#2024 - CEDUP

import lib

sair = "N"
while sair == "N":
    lib.exibir_titulo("# Calculador de Média")
    n1 = int(input("Nota 1: "))
    n2 = int(input("Nota 2: "))
    media = (n1+n2)/2
    print("...............................................")
    print("Média: ", media)
    sair= lib.sair()