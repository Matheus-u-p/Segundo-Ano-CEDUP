#Matheus Uggioni Possamai
#2-53
#12/2024

import os
import listar
import app

opcao = 0
sair = "N"

while sair == "N":
    os.system("cls")
    print("## MENU ##")
    print("1. Cadastrar os Produtos:")
    print("2. Pesquisar os Produtos Pelo Nome:")
    print("3. Sair")
    opcao = int(input("R. "))
    os.system("cls")

    if opcao == 1:
        nome = input("Nome: ")
        unidade_med = input("Unidade Medida: ")

        if len(unidade_med) > 2:
            print("Unidade de medida inválida, max: 2 caracteres.")

            break

        marca = input("Marca: ")
        app.adicionar(nome, unidade_med, marca)

    elif opcao == 2:
        procurar = input("Digite o nome do produto: ")
        listar.listar(procurar)
        
    else:
        sair = "S"

    os.system("pause")

#Atividade Avaliativa Final - 2 ano