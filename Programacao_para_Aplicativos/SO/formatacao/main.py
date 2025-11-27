import os

os.system('cls')

print("##### CADASTRAR #####")
nome = input("Digite um nome fantasia: ")
razao = input("Digite a razão social ")
cnpj = input("Digite o CNPJ: ")
colaboradores = int(input("Digite o numero de colaboradores: "))
faturamento = int(input("Digite o faturamento anual: "))

os.system('cls')

print("***************************************")
print("DADOS DA EMPRESA")
print("***************************************")
print("Nome Fantasia....: ", nome)
print("Razão Social.....: ", razao)
print("CNPJ.............: ", cnpj)
print("Nº Colaboradores.: ", colaboradores)
print("Faturamento Anual: ", faturamento)
print("_______________________________________")