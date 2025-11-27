#Matheus Uggioni Possamai
#2-53
#2024 - CEDUP

import os

def finish():
    exibir_titulo("# Obrigado por utilizar nosso programa!")
    os.system("pause")

def sair():
    print("\n\n")
    sair = input("Deseja sair do programa (S/N) ?\nR: ")
    if sair == "S":
        finish()
    return sair

def separador():
    print()
    print("-----------------------------------------------------")

def exibir_titulo(texto):
    os.system("cls")
    linha = "---------------------------------------------------"
    print(linha)
    print(texto)
    print(linha)
    