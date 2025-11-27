import tkinter as tk
import time

# Função para atualizar o relógio
def atualizar_relogio():
    hora_atual = time.strftime("%H:%M:%S")
    milissegundos = int(time.time() * 1000) % 1000
    data_atual = time.strftime("%d/%m/%Y")
    
    # Tradução dos dias da semana para português
    dias_semana = {
        'Monday': 'Segunda-feira',
        'Tuesday': 'Terça-feira',
        'Wednesday': 'Quarta-feira',
        'Thursday': 'Quinta-feira',
        'Friday': 'Sexta-feira',
        'Saturday': 'Sábado',
        'Sunday': 'Domingo'
    }
    dia_da_semana = dias_semana[time.strftime("%A")]
    
    # Atualizar o rótulo com a hora, milissegundos, dia da semana e data
    rotulo_hora.config(text=f"{hora_atual}.{milissegundos:03d}")
    rotulo_data.config(text=f"{dia_da_semana}, {data_atual}")
    
    # Atualiza o relógio a cada 50 milissegundos
    rotulo_hora.after(50, atualizar_relogio)

# Criar a janela principal
janela = tk.Tk()
janela.title("Relógio Digital Moderno")

# Configurações da janela
janela.configure(bg="#202124")
janela.geometry("500x300")
janela.resizable(False, False)

# Criar um título estilizado
titulo = tk.Label(janela, text="Relógio Digital", font=("Helvetica", 24, "bold"), bg="#202124", fg="#FFFFFF")
titulo.pack(pady=10)

# Criar um quadro para o relógio com bordas arredondadas
quadro_relogio = tk.Frame(janela, bg="#303134", bd=15, relief="flat")
quadro_relogio.pack(pady=20)

# Exibir a hora com milissegundos
rotulo_hora = tk.Label(quadro_relogio, font=("Helvetica", 48, "bold"), bg="#303134", fg="#F4B400")
rotulo_hora.pack(pady=10)

# Exibir a data e o dia da semana
rotulo_data = tk.Label(quadro_relogio, font=("Helvetica", 20), bg="#303134", fg="#FFFFFF")
rotulo_data.pack(pady=10)

# Iniciar o relógio
atualizar_relogio()

# Iniciar o loop da interface gráfica
janela.mainloop()
