<!DOCTYPE html> <!-- Fala para o programa que dentro do documento de php, está sendo progamado um codigo em html -->
<html lang="en"> <!-- Idioma dos codigos -->
    <head>  <!--Aba do site -->
        <meta charset="UTF-8"> <!--Tipo de codificação do codigo -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">  <!-- Adaptação e tamanho da tela -->   
        <title>Cadastro</title> <!--Titulo da aba -->
    </head>

    <body> <!--Corpo do site -->
        <form action='procscadastro.php' method='post'> <!--Formulario com o metodo POST(Metodo mais seguro, não mostra o que está sendo executado dentro do programa para o usuario), e sua ação é enviar o usuario para o arquivo procscadastro.php, após ser executado o que está dentro deste bloco -->
            <input type="text" name="nome" placeholder="Digite seu nome"> <!--Campo de busca que o usuario irá digitar o nome da pessoa em que ele busca | o placeholder é para deixar a estrutura em que o usuario digite em formato  de caixa -->
            <input type="text" name="email" placeholder="Digite seu email">
            <button> Enviar </button> <!--Botão clicavel -->
        </form>
    </body>
<!--Encerra o codigo de HTML--> </html>