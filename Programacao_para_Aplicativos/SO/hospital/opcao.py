atendimentos = []

def adicionar(atendimento):
    atendimentos.append(atendimento)
    
def listar():
    for i in atendimentos:
        print("Cadastrar Atendimento: ", i)