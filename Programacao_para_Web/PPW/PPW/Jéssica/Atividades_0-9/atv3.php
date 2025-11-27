<?php

$nomevendedor = $_POST['vendedor'];
$salario = $_POST['salario'];
$vendas = $_POST['vendas'];

$salariovenda = $vendas*(15/100);
$salariototal = $salario + $salariovenda;

echo("O nome do vendedor é $nomevendedor <br> Seu salário fixo é $salario <br> Seu salário total é $salariototal");
?>