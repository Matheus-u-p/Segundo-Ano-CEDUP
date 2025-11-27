<?php
    $salario = $_POST['salario'];
    $salariomin = $_POST['salariomin'];

    if ($salario < ($salariomin*3)) {
    $min = ($salario*50)/100;
    $total = $salario+$min;
    }
    else if ($salario >= ($salariomin*3) && $salario <= ($salariomin*10)) {
    $min = ($salario*20)/100;
    $total = $salario+$min;
    }
    else if ($salario >= ($salariomin*10) && $salario <= ($salariomin*20)) {
    $min = ($salario*15)/100;
    $total = $salario+$min;
    }
    else {
    $min = ($salario*10)/100;
    $total = $salario+$min;
    }

echo "Salario antigo: $salario --->  Salario novo: $total";
?>