atendimentos = []

def adicionar(nome):
    atendimentos.append(nome)
    
def visualizar():
    for i in atendimentos:
        print("Nome: ", i)
        
def proxima_senha():
    print("A próxima é: ", len(atendimentos) + 1)
    
def disponiveis():
    print("Atendimentos disponíveis: ", 10 - len(atendimentos))
    

    