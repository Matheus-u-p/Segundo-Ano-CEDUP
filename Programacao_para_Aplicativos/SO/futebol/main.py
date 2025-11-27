import os
import lib

opcao = 0
sair = "N"

while sair == "N":
    os.system("cls")
    print("## MENU ##")
    print("1- Cadastrar Jogador: ")
    print("2- Listar Jogadores: ")
    print("3- Pesquisar Jogador: ")
    print("4- Sair: ")
    opcao = int(input("R. "))
    os.system("cls")
    
    if opcao == 1:
        if len(lib.jogador) < 11:
            lib.adicionar(input("Nome: "))
        else:
            print("Atendmento Finalizado!")
    
    elif opcao == 2:
        lib.visualizar()
        
    elif opcao == 3:
        lib.pesquisar()
        
    else:
        sair = "S"
        
    os.system("pause")