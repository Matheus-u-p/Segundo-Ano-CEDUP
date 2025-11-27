import os
import lib

opcao = 0
sair = "N"

while sair == "N":
    os.system("cls")
    print("## MENU ##")
    print("1- Atendimentos: ")
    print("2- Vizualizar Atendimentos: ")
    print("3- Chamar Próxima Senha: ")
    print("4- Quantidade de Atendimentos Disponíveis: ")
    print("5- Sair: ")
    opcao = int(input("R. "))
    os.system("cls")
    
    if opcao == 1:
        if len(lib.atendimentos) < 10:
            lib.adicionar(input("Nome: "))
        else:
            print("Atendmento Finalizado!")
    
    elif opcao == 2:
        lib.visualizar()
        
    elif opcao == 3:
        lib.proxima_senha()
        
    elif opcao == 4:
        lib.disponiveis()
        
    else:
        sair = "S"
        
    os.system("pause")