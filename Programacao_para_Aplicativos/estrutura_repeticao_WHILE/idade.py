#Matheus Uggioni Possamai
#2-53
#2024 - CEDUP

adicionar = "S"
idade = 0
soma_idade = 0

while adicionar == "S":
    idade = int(input("Digite uma idade: "))
    soma_idade = soma_idade+idade
    adicionar = input("Deseja Informar uma Idade (S/N)? ")

else:
    print("A soma das idades é", soma_idade )