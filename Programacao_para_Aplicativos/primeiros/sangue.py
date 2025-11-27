#Matheus Uggioni Possamai
#2-53
#2024 - CEDUP

pode_doar = "S"

saude = input("Você está em boas condições de saúde? [S/N] ")
peso = input("Você tem pelo menos 50KG? [S/N] ")
alimento = input("Você está alimentado? [S/N] ")
sono = input("Você dormiu pelo menos 6 horas nas últimas 24 horas? [S/N] ")

if saude == "N":
    pode_doar = "N"
    
if peso == "N":
    pode_doar = "N"
    
if alimento == "N":
    pode_doar = "N"
    
if sono == "N":
    pode_doar = "N"
    
if pode_doar == "S":
    print("Parabéns, você pode ser um doador!")
    
else:
    print("Sentimos muito, nesse momento você não pode doar!")


