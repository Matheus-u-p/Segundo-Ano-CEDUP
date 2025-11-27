<?php //Inicio o programa php
$nome= $_GET['busca']; //Puxa a varivavel pelo metodo GET de outro arquivo em que ele esta linkado

echo"O usuario $nome já está cadastrado! "; //Usado para imprimir na tela

//Encerra o programa php
?>

<!DOCTYPE html> <!-- Fala para o programa que dentro do documento de php, está sendo progamado um codigo em html -->
<html lang="en"> <!-- Idioma dos codigos -->
<head>  <!--Aba do site -->
    <meta charset="UTF-8"> <!--Tipo de codificação do codigo -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">  <!-- Adaptação e tamanho da tela -->
    <title>Busca</title> <!--Titulo da aba -->
</head>
<body> <!--Corpo do site -->
    <form action='menu.php' method='post'> <!--Formulario com o metodo POST(Metodo mais seguro, não mostra o que está sendo executado dentro do programa para o usuario), e sua ação é enviar o usuario para o arquivo menu.php, após ser executado o que está dentro deste bloco -->
            <button>Voltar para o menu</button>  <!-- Botão clicavel -->
    </form>
</body>
<!--Encerra o codigo de HTML--> </hmtl> 