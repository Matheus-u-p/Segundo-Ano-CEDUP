<?php //Se inicia o programa de php
$nome = $_POST['nome']; //Puxa a varivavel pelo metodo POST(Metodo mais seguro) de outro arquivo em que ele esta linkado

$email = $_POST['email'];

echo "Nome: $nome"; //Usado para imprimir um texto na tela
echo "<br>Email: $email";
echo "<br>Usuario Cadastrado! ";
//Encerra o programa de php ?>
<!DOCTYPE html> <!-- Falar para o programa que dentro do documento de php, está sendo progamado um codigo em html -->
<html lang="en"> <!-- Idioma dos codigos --> 
<head>  <!--Aba do site -->
    <meta charset="UTF-8"> <!--Tipo de codificação do codigo -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">  <!-- Adaptação e tamanho da tela -->
    <title>Cadastro</title> <!--Titulo da aba -->

</head>
    <body>  <!--Corpo do site -->
    <form action='menu.php' method='post'> <!--Formulario com o metodo POST(Metodo mais seguro, não mostra o que está sendo executado dentro do programa para o usuario), e sua ação é enviar o usuario para o arquivo menu.php, após ser executado o que está dentro deste bloco -->
        <br> <!--Quebra de linha-->    
        <button>Voltar para o menu</button>  <!-- Botão clicavel -->
    </form>
    </body>
<!--Encerra o codigo de HTML--> </html>