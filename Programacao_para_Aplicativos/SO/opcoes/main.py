import os
import opcoes

sair = "N"

while sair =="N":
    os.system("cls")
    print("## MENU ##")
    print("1- Adicionar: ")
    print("2- Listar: ")
    print("3- Sair: ")
    opcao = int(input("R. "))
    os.system("cls")
    
    if opcao == 1:
        opcoes.adicionar (input("Nome: "))
    
    elif opcao == 2:
        opcoes.listar()
        os.system("pause")
        
    else:
        sair = "S"