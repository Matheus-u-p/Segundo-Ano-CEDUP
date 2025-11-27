<?php
$valor1 = $_POST['v1'];
$valor2 = $_POST['v2'];

    $soma =  $valor1 + $valor2;
    $sub =  $valor1 - $valor2;
    $mult =  $valor1 * $valor2;
    $div =  $valor1 / $valor2;

    echo "A soma é de $soma <br> a subtração $sub <br> a multiplicação $mult <br> e a divisao $div";
?>