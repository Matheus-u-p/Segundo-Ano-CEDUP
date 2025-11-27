<link rel="stylesheet" href="estilo.css" type="text/css" /> <!--Puxa o arquivo estilo.css -->
<? //Inicio o codigo de php
session_start(); //Inicia a sessão
if(isset($_SESSION['nome'])){ //Se houver algo escrito na sessão "nome" então...
    echo"<h2> Usuario logado </h2>"; //Imprimi o texto na tela | h2 é o tamanho da fonte do texto
}else{ //Caso esteja vazia...
    echo"<h2> Usuario não autenticado </h2>";
}
//Encerra o codigo de php ?>