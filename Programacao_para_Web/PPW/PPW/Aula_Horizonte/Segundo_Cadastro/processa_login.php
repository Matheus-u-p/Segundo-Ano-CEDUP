<?php //Começa o codigo de php
$senha ='123456'; //Criação e atribuição de variavel
$usuario ='admin';
 if($_POST['usuario'] == $usuario && $_POST['senha'] == $senha){ //Se o usuario e a senha forem iguais a variavel $usuario e $senha, entao...
   //$_POST['usuario'] é a variavel que estava em outro arquivo e foi puxado para esse linkado. 
   session_start(); //Inicio da sessão

 }
//Encerra o codigo de php
?>
