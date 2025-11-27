#Matheus Uggioni Possamai
#2-53
#12/2024

def listar(nome_produto):
    import mysql.connector

    #configuração com banco de dados
    db_config = {
        'user': 'root',
        'password': '',
        'host': 'localhost',
        'database': 'atividade_avaliativa_253',
        'port': '3306'
    }

    #Conectando com o banco de dados
    conn = mysql.connector.connect(**db_config)
    cursor = conn.cursor()

    #Executando consulta para listar apenas o produto escolhido
    sql = "SELECT nome, unidade_med, marca FROM produtos_beleza WHERE nome = %s"
    cursor.execute(sql, (nome_produto,))
    resultado = cursor.fetchall()

    #Exibe a listagem
    if resultado:
        for r in resultado:
            print("")
            print("## PESQUISA ##")
            print("***************************")
            print("Nome: ", r[0])
            print("Unidade de Medida: ", r[1])
            print("Marca: ", r[2])
            print("***************************")
            print("")
    else:
        #Caso vazio
        print("Produto não encontrado.")

    #Fechando a conexão
    cursor.close()
    conn.close()

#Atividade Avaliativa Final - 2 ano