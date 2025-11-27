#Matheus Uggioni Possamai
#2-53
#2024 - CEDUP

nome_produto = input("Nome Produto: ")
valor = float(input("Valor: "))
quantidade = int(input("Quantidade: "))
desconto = float(input("Desconto: "))

valor_total = (valor * quantidade) - desconto

print("O valor total do" , nome_produto ,"é de R$" , valor_total)

