adicionar = "S"

while adicionar == "S":
    nome_roupa = input("Digite o nome da roupa: ")
    nome_roupa.append(nome_roupa)
    valor_roupa = float(input("Digite o valor da roupa: "))
    valor_roupa.append(valor_roupa)
    quantidade = int(input("Digite a quantidade de roupas: "))
    quantidade.append(quantidade)
    adicionar = input("Deseja informar uma nona roupa? (S/N)? ")
    
    
    
else:
    for i in nome_roupa:
        for y in valor_roupa:
            for x in quantidade:
                print("Roupa: ", i ,"Valor: ", y ,"Quantidade: ", x)

