<?php
$real= $_POST['dolar'];
$dinheiro = $_POST['dinheiro'];
print "Valor da cotação do dolar: $real = 1 dolar";

echo" </br> Dolares disponiveis: $dinheiro";
$conta = $dinheiro*$real;

echo "</br> $dinheiro doláres são equivalentes à $conta reais";

?>