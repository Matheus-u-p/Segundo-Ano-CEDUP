jogador = []

def adicionar(nome):
    jogador.append(nome)
    
def visualizar():
    for i in jogador:
        print("Nome: ", i)
    
def pesquisar():
    camisa = int(input("Digite o Número da Camisa:"))
    print("Nome: ", camisa)