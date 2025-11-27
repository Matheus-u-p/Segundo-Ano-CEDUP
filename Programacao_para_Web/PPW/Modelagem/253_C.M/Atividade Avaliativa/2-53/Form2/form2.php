<?php
$nome = $_POST['nome'];
$email = $_POST['email'];
$mensagem = $_POST['mensagem'];

if($nome == '' || $email == '' || $mensagem == ''){
    echo "Erro!";
    header('Location:form2.html');
}
else{
    echo "Nome: $nome";
    echo "</br> Email: $email";
    echo "</br> Mensagem: $mensagem";
}

?>