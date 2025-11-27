<!DOCTYPE html> <!-- Fala para o programa que dentro do documento de php, está sendo progamado um codigo em html -->
<html lang="en"> <!-- Idioma dos codigos -->
    <head> <!--Aba do site -->
        <meta charset="UTF-8"> <!--Tipo de codificação do codigo -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> <!-- Adaptação e tamanho da tela -->
        <title>Busca</title> <!--Titulo da aba -->
    </head>

    <body> <!--Corpo do site -->
        <form action='procsbusca.php' method='get'> <!--Formulario com o metodo GET(Metodo que guarda informações na URL), e sua ação é enviar o usuario para o arquivo procsbusca.php, após ser executado o que está dentro deste bloco -->
            <input type="text" name="busca" placeholder="Busque o nome">  <!--Campo de busca que o usuario irá digitar o nome da pessoa em que ele busca | o placeholder é para deixar a estrutura em que o usuario digite em formato  de caixa -->
            <button> Procurar </button> <!--Botão clicavel -->
        </form>
    </body>
<!--Encerra o codigo de HTML--> </html>