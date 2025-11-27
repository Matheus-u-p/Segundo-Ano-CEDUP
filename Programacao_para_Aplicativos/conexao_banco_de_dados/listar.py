import mysql.connector

#Configuração com banco de dados
db_config = {
    'user': 'root',
    'password': '',
    'host': 'localhost',
    'database': 'pessoa_253',
    'port': '3306',
    'collaction': 'utf8mb4_unicode_ci',
    'charset': 'utf8mb4',
}

#Conectando ao banco de dados
conn = mysql.connector.connect(**db_config)
cursor = conn.cursor()

#Executando a consulta para listar todos os nomes
cursor.execute("SELECT nome, email FROM pessoa")
resultados = cursor.fetchall()

#Exibe a lista de e-mails
for r in resultados:
    print("Nome: ", r[0])
    print("E-Mail: ", r[1])
    
#Fechando a conexão
cursor.close()
conn.close()