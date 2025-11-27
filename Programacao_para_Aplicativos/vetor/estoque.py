#Matheus Uggioni Possamai
#2-53
#2024 - CEDUP

produtos = [ "Computador Desktop", "Laptop", "Monitor LED",
"Teclado Mecânico", "Mouse Óptico", "Impressora Multifuncional",
"Webcam", "Fone de Ouvido com Microfone", "Pendrive",
"HD Externo", "Roteador Wi-Fi", "Placa de Vídeo", "Memória RAM",
"Fonte de Alimentação", "Gabinete" ]

estoques = [ 487, 434, 1, 3, 332, 123, 23, 2, 3, 44, 343, 6, 777, 56 , 4 ]

for i in estoques:
    for y in produtos:
        print("Produto: ", y ," Estoque: ", i)