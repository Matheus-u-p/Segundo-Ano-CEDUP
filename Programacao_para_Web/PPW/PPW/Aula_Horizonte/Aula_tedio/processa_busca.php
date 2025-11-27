<link rel="stylesheet" href="estilo.css" type="text/css" /> <!--Puxa o arquivo estilo.css -->
<?php //Começa o codigo de php
$nome= $_GET['busca']; //Puxa a variavel do arquivo anterior em que este está linkado

echo"O usuario $nome já está cadastrado! "; //Imprimi o texto na tela

//Encerra o codigo de php ?>

<!DOCTYPE html>  <!-- Fala para o programa que dentro do documento de php, está sendo progamado um codigo em html -->
<html lang="en"> <!-- Idioma dos codigos -->
<head> <!--Aba do site -->
    <meta charset="UTF-8"> <!--Tipo de codificação do codigo -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">  <!-- Adaptação e tamanho da tela -->
    <title>Busca</title> <!--Titulo da aba -->
</head>
<body> <!--Corpo do site -->
    <form action='index.php' method='post'> <!--Formulario com o metodo POST(Metodo mais seguro, não mostra o que está sendo executado dentro do programa para o usuario), e sua ação é enviar o usuario para o arquivo index.php, após ser executado o que está dentro deste bloco -->
            <button>Voltar para o menu</button>  <!-- Botão clicavel -->
    </form>
</body>
<!--Encerra o codigo de HTML--></hmtl>