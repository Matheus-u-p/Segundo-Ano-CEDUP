#Matheus Uggioni Possamai
#2-53
#2024 - CEDUP

real = float(input("Digite o valor que deseja converter: "))
moeda = input("Digite a moeda que você deseja realizar a conversão[D/E]: ")
dolar = 5.4411997
euro = 6.06974

def conversao():
    if moeda=="D":
        return (real/dolar)
    elif moeda=="E":
        return (real/euro)
    
print ("R$",real,"-->","$",conversao())

