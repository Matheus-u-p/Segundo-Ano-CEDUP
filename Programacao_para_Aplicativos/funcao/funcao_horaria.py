#Matheus Uggioni Possamai
#2-53
#2024 - CEDUP

posicao_ini = float(input("Digite a posição inicial (KM): "))
velocidade = float(input("Digite a velocidade (KM/h): "))
tempo = float(input("Digite o tempo em horas: "))

def func_hora():
    return posicao_ini+(velocidade*tempo)

print("A posição final é", func_hora())
