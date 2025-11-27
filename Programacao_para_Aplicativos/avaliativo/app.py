#Matheus Uggioni Possamai
#2-53
#12/2024

def adicionar(nome, unidade_med, marca):
    import mysql.connector

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

    #Inserindo no banco de dados
    sql = "INSERT INTO produtos_beleza (nome, unidade_med, marca) VALUES (%s, %s, %s)"
    cursor.execute(sql, (nome, unidade_med, marca))

    #Commit para salvar a inserção
    conn.commit()

    #Fechando a conexão
    cursor.close()
    conn.close()

#Atividade Avaliativa Final - 2 ano